import { createContext, useState, useContext, useEffect } from "react";

export const AuthContext = createContext();

export const AuthProvider = ({ children }) => {
  const [username, setUsername] = useState(null);
  const [token, setToken] = useState(null);
  const [roles, setRoles] = useState([]);

  useEffect(() => {
    const storedToken = localStorage.getItem('authToken');
    if (storedToken) {
      setToken(storedToken);
      const storedUsuario = localStorage.getItem('usuario');
      if (storedUsuario) {
        setUsername(JSON.parse(storedUsuario));
        setRoles(JSON.parse(storedUsuario).roles);
      }
    }
  }, []);

  const login = (usuarioLogueado, token, roles) => {
    setUsername(usuarioLogueado);
    setToken(token);
    setRoles(roles);
    localStorage.setItem('authToken', token);
    localStorage.setItem('usuario', JSON.stringify(usuarioLogueado));
    localStorage.setItem('roles', JSON.stringify(roles));
  };

  const logout = () => {
    setUsername(null);
    setToken(null);
    setRoles([]);
    localStorage.removeItem('authToken');
    localStorage.removeItem('usuario');
  };

  const usuarioConRoles = (rolesAutorizados) => {
    if(!rolesAutorizados || rolesAutorizados.length == 0){
      return true;
    }
    
    let rtas = [];
    
    //if(usuario && usuario.roles){
    //  rtas = usuario.roles.map(rolUsuario => rolesAutorizados.includes(rolUsuario));
    //}
    if(roles){
      rtas = roles.map(rolUsuario => rolesAutorizados.includes(rolUsuario));
    }
    
    return rtas.includes(true);
  };

  return (
    <AuthContext.Provider value={{ usuario: username, login, logout, token, usuarioConRoles }}>
      {children}
    </AuthContext.Provider>
  );
}

export const useAuth = () => {
  return useContext(AuthContext);
};
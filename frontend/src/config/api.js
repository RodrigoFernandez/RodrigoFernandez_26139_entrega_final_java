//const API_BASE_URL = import.meta.env.VITE_API_URL || 'http://localhost:8080/api'
const API_BASE_URL = import.meta.env.VITE_API_URL || '/api'

export const API_ENDPOINTS = {
  productos: `${API_BASE_URL}/productos`,
  carrito: `${API_BASE_URL}/carrito`,
  pedidos: `${API_BASE_URL}/pedidos`,
  login: `${API_BASE_URL}/auth/login`,
  usuarios: `${API_BASE_URL}/usuarios`,
  contacto: `${API_BASE_URL}/contacto`
}

export default API_BASE_URL

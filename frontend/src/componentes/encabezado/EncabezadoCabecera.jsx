import style from './EncabezadoCabecera.module.css';
import { useAuth } from '../../contextos/AuthContext';
import { MenuAdmin } from './MenuAdmin';

function LogoEncabezado({linkHome, logo}){
    return <div className={style.logo}>
                <a href={linkHome}>
                    <img src={logo} alt="logo"></img>
                </a>
            </div>;
}

function TituloEncabezado({children, titulo}){
    return <div className={style.titulo}>
                <h1>{titulo}</h1>
                <p>{children}</p>
            </div>;
}

function LoginEncabezado({linkLogin}){
    return <div className={style.login}>
                <a href={linkLogin}>Ingresar</a>
            </div>;
}

function EncabezadoUsuarioSesion({usuario}){
    console.log(usuario);
    return (
        <div className={style['encabezado-sesion']}>
            <MenuAdmin usuario={usuario}></MenuAdmin>
        </div>
    );
}

export function EncabezadoCabecera(){
    const { usuario } = useAuth();
    console.log(usuario);
    return (
        <div> 
            <div className={style['encabezado-cabecera']}>
                <LogoEncabezado linkHome="/" logo="/img/logo.svg"></LogoEncabezado>
                <TituloEncabezado titulo="Yoga en equilibrio">
                    Conectá cuerpo y mente con productos pensados para vos
                </TituloEncabezado>
                {
                    !usuario && 
                    <LoginEncabezado linkLogin="/login"></LoginEncabezado>
                }
                {
                    usuario &&
                    <EncabezadoUsuarioSesion usuario={usuario}></EncabezadoUsuarioSesion>
                }
            </div>
        </div>);
}
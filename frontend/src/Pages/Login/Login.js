import { useState } from 'react';
import { Navigate } from 'react-router-dom';
import { ActiveLink } from '../../components/Navigation/ActiveLink';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faRightToBracket, faUser } from '@fortawesome/free-solid-svg-icons';
import { HttpInterface } from '../../api/HttpInterface';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import './Login.css';


const LOGIN_ICON  = (<FontAwesomeIcon icon={faRightToBracket} style={{color: '#ffffff',}} />);
const SIGNUP_ICON = (<FontAwesomeIcon icon={faUser} style={{color: '#ffffff',}} />);

const SIGNUP_BUTTON = (
    <ActiveLink to='/signup'>
        <Button id='signup-btn' variant='contained'>Create Account &nbsp; {SIGNUP_ICON}</Button>
    </ActiveLink>
);




function Form(props) {

    const USERNAME_INPUT = (
        <TextField
            variant='filled'
            label='Username'
            defaultValue=''
            onChange={props.handleUsernameChange}
        />
    );

    const PASSWORD_INPUT = (
        <TextField
            variant='filled'
            label='Password'
            type='password'
            defaultValue=''
            onChange={props.handlePasswordChange}
        />
    );

    const LOGIN_BUTTON = (
        <Button id='login-btn' variant='contained' onClick={props.handleLogin}>
            Login  &nbsp; {LOGIN_ICON}
        </Button>
    );


    return (
        <article id='login-article'>
            <header>
                <h1>Login</h1>
            </header>

            <section id='login-section'>
                <ul>
                    <li> {USERNAME_INPUT} </li>
                    <li> {PASSWORD_INPUT} </li>
                </ul>
                {LOGIN_BUTTON}
            </section>

            <section id='signup-section'>
                <h2>Don't have an account?</h2>
                {SIGNUP_BUTTON}
            </section>
        </article>
    );
}





export function Login() {

    const [credentials, setCredentials] = useState({username: '', password: ''});

    const handleLogin = async () => {
        if (await HttpInterface.authenticateLogin(credentials)) {
            setContent(<Navigate to='/cart'/>);
        }
    };

    const handleUsernameChange = (event) => {
        setCredentials({
            ...credentials,
            ['username']: event.target.value
        });
    };

    const handlePasswordChange = (event) => {
        setCredentials({
            ...credentials,
            ['password']: event.target.value
        });
    };


    const [content, setContent] = useState(
        <Form 
            handleLogin={handleLogin} 
            handleUsernameChange={handleUsernameChange} 
            handlePasswordChange={handlePasswordChange}
        />
    );

    return content;
}
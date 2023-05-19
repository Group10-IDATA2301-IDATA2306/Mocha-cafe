import { useState } from 'react';
import { Navigate } from 'react-router-dom';
import { ActiveLink } from '../../components/Navigation/ActiveLink';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';
import { HttpInterface } from '../../api/HttpInterface';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import './Signup.css';



const strengthIndicators = ['weak', 'decent', 'strong'];

const LOGIN_BUTTON = (
    <ActiveLink to='/login'>
        <Button id='login-btn' variant='contained'>Already have an account?</Button>
    </ActiveLink>
);

const SIGNUP_ICON = (<FontAwesomeIcon icon={faUser} style={{color: '#ffffff',}} />);




function determineStrength(password) {

    let indicator = -1;
    let upperCase  = false;
    let lowerCase  = false;
    let nummerical = false;

    for (let index = 0; index < password.length; index++) {

        const char = password.charCodeAt(index);

        if (!upperCase && char >= 65 && char <= 90) {
            upperCase = true;
            indicator++;
        }

        if (!lowerCase && char >= 97 && char <= 122) {
            lowerCase = true;
            indicator++;
        }

        if (!nummerical && char >= 48 && char <= 57) {
            nummerical = true;
            indicator++;
        }
    }

    if (password.length < 10) indicator = 1;
    if (password.length < 5) indicator = 0;
    if (password.length < 1) indicator = -1;

    return strengthIndicators[indicator];
};




function Form(props) {

    const [strengthIndicator, setStrengthIndicator] = useState('');

    const handlePasswordChange = (event) => {
        const password = event.target.value;
        props.handlePasswordChange(password);
        setStrengthIndicator(determineStrength(password));
    };

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
            onChange={handlePasswordChange}
        />
    );

    const SIGNUP_BUTTON = (
        <Button id='signup-btn' variant='contained' onClick={props.handleSignUp}>
            Sign Up &nbsp; {SIGNUP_ICON}
        </Button>
    );

    const STRENGTH_CONTAINER = (
        <>
            <div className={`strength-bar ${strengthIndicator}`}>
                <div></div>
            </div>
            <div id='strength-label'>
                {strengthIndicator && <>{strengthIndicator} password</>}
            </div>
        </>
    );

    
    return (
        <main id='signup'>
        <article id='signup-article'>
            <header>
                <h1>Registration</h1>
            </header>

            <form>
                {USERNAME_INPUT}
                {PASSWORD_INPUT}
                {STRENGTH_CONTAINER}
            </form>

            <section>
                <div id='login-btn-container'>{LOGIN_BUTTON}</div>
                <div id='signup-btn-container'>{SIGNUP_BUTTON}</div>
            </section>
        </article>
        </main>
    );
}



export function Signup() {

    const [credentials, setCredentials] = useState({username: '', password: ''});

    const handleSignUp = async () => {
        if (await HttpInterface.signUp(credentials)) {
            setContent(<Navigate to='/cart'/>);
        }
    };

    const handleUsernameChange = (event) => {
        setCredentials({
            ...credentials,
            ['username']: event.target.value
        });
    };

    const handlePasswordChange = (password) => {
        setCredentials({
            ...credentials,
            ['password']: password
        });
    };

    const [content,  setContent]  = useState(
        <Form
            handleSignUp={handleSignUp}
            handleUsernameChange={handleUsernameChange}
            handlePasswordChange={handlePasswordChange}
        />
    );

    return content;
}
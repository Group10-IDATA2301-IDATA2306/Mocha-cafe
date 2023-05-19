
const SERVER_URL = "http://localhost:8080";

const SESSION = {
    Token: '',
    Authorized: false
}


async function httpGET(endpoint) {
    const response = await fetch(SERVER_URL + endpoint,
        {
            method: 'GET',
            headers: { 
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + SESSION.Token
            }
        }
    );
    return response.json();
}


async function httpSendData(endpoint, method, data) {
    return await fetch(SERVER_URL + endpoint,
        {
            method: method,
            headers: { 
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + SESSION.Token
            },
            body: JSON.stringify(data)
        }
    );
}


export const HttpInterface = {

    authenticateLogin: async function(credentials) {
        const response = await httpSendData('/login', 'POST', credentials);
        if (response.ok) {
            const authHeader = response.headers.get("Authorization").split(' ');
            SESSION.Token = authHeader[1];
            SESSION.Authorized = true;
        }
        return SESSION.Authorized;
    },



    signUp: async function(credentials) {
        const response = await httpSendData('/users', 'POST', credentials);
        return (response.created) ? await this.authenticateLogin(credentials) : false;
    },


    getAllProducts: async function() {
        const response = await httpGET('/products');
        return (response.ok) ? response.text() : null;
    },


    getUserDetails: async function(userId) {
        const response = await httpGET('/users/' + userId);
        return (response.ok) ? response.text() : null;
    }
}
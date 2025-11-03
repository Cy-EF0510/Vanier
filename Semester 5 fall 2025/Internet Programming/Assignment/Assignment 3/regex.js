// •	username 
// o	must be between 8 and 16 characters
// o	must start with a letter
// o	must contain at least 1 uppercase letter
// o	only alphanumerical characters
const regUsername = /^[a-zA-Z](?=.+[A-Z])[a-zA-Z\d]{7,23}$/;

// •	password
// o	must be between 8 and 24 characters
// o	must start with ‘#’
// o	must end with ‘$’
// o	must have 2 consecutive numbers
// o	must have at least 1 uppercase letter
// o	only alphanumerical characters, ‘-‘, ‘!’, ‘@’ ‘#’ and ‘$’

const regPass = /^#(?=.*\d{2})(?=.*[A-Z])[a-zA-Z\d-!@#$]{6,22}$/;

function sendData(){
    var uname = document.getElementById("username").value;
    var pswd = document.getElementById("pass").value;

    // cyr1l3fr3nF4br0
    // #22wEwewe$
    console.log(uname);
    console.log(pswd);

    console.log(regUsername.test(uname));
    console.log(regPass.test(pswd));

    document.getElementsByTagName("form")
}
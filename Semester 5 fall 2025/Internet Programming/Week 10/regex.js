const regEmail = /^[a-z0-9_-]+@[a-z0-9]\.(com|(co\.)uk|(qc\.)ca)$/gi
const regPass = /^(?=.+\d)(?=.+[a-zA-Z])(?=.+[\$!_\-]).{8,24}$/;

function sendData(){
    var email = document.getElementById("email").value;
    var pswd = document.getElementById("pass").value;

    console.log(regEmail.test(email));
    console.log(regPass.test(pswd));

    document.getElementsByTagName("form")[0].submit();
}
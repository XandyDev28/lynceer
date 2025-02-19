function btnLogin(){

var email = document.getElementById("txtemail")
var resultadoemail = document.getElementById("resultadoemail")
var resultadosenha = document.getElementById("resultadosenha")

    if (email.value == ""){
        resultadoemail.innerHTML = "DIgite seu email"
        resultadosenha.innerHTML = "DIgite sua senha"
    } else {
        alert("LOGOU")
         resultadoemail.innerHTML = ""
        resultadosenha.innerHTML = ""
    }
}
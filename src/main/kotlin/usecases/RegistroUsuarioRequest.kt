package cl.hcs.clean.usecases

data class RegistroUsuarioRequest(
    val email:String,
    val contrasena:String,
    val telefono:String
)

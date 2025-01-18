package cl.hcs.clean.usecases

class IngresarUseCase(
    val repository: UsuarioRepository,
    val email:String,
    val contrasena:String
) {

    operator fun invoke():IngresarResponse {
        val usuario = repository.encontrar(email)
        if( usuario != null && usuario.contrasena == contrasena) {
            return IngresarResponse.Exito( UsuarioDTO(usuario.email, usuario.telefono, usuario.contrasena) )
        } else {
            return IngresarResponse.Fallo("Usuario no existe o la contraseña está incorrecta.")
        }
    }
}
package cl.hcs.clean.usecases

interface UsuarioRepository {
    fun guardar(usuario: UsuarioDTO):Unit
    fun encontrar(email:String):UsuarioDTO?
}
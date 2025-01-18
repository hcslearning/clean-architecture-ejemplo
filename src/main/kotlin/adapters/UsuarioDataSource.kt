package cl.hcs.clean.adapters

interface UsuarioDataSource {
    fun insertar(email:String, telefono:String, contrasena:String):Unit
    fun actualizar(email:String, telefono:String, contrasena:String):Unit
    fun eliminar(email:String):Unit
}
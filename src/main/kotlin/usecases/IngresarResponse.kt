package cl.hcs.clean.usecases

import cl.hcs.clean.entities.Usuario

sealed class IngresarResponse {
    data class Exito(val usuario:UsuarioDTO):IngresarResponse()
    data class Fallo(val mensaje:String):IngresarResponse()
}
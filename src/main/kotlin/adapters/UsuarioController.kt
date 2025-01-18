package cl.hcs.clean.adapters

import cl.hcs.clean.usecases.IngresarResponse
import cl.hcs.clean.usecases.IngresarUseCase
import cl.hcs.clean.usecases.RegistrarUseCase

class UsuarioController(

) {

    fun registrar() {

    }

    fun ingresar(email:String, contrasena:String) {
        val resultado = IngresarUseCase(
            UsuarioRepositoryImpl(),
            email,
            contrasena
        )()

        when(resultado) {
            is IngresarResponse.Exito -> {

            }
            is IngresarResponse.Fallo -> {

            }
        }
    }
}
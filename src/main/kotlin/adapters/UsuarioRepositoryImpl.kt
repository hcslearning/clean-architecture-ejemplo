package cl.hcs.clean.adapters

import cl.hcs.clean.usecases.UsuarioDTO
import cl.hcs.clean.usecases.UsuarioRepository

class UsuarioRepositoryImpl(

):UsuarioRepository {
    override fun guardar(usuario: UsuarioDTO) {
        TODO("Not yet implemented")
    }

    override fun encontrar(email: String): UsuarioDTO? {
        TODO("Not yet implemented")
    }

}
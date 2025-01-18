package cl.hcs.clean.usecases

import cl.hcs.clean.entities.Usuario

class RegistrarUseCase(
    val usuarioRepository: UsuarioRepository
) {
    // operator invoke permite invocar el método directamente con el constructor RegistrarUseCase(param)
    operator fun invoke(request:RegistroUsuarioRequest) {
        val usuario = Usuario(
            request.email,
            request.contrasena,
            request.telefono
        )
        //usuarioRepository.guardar(usuario)
    }
}
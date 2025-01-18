package cl.hcs.clean.adapters

import cl.hcs.clean.usecases.UsuarioDTO
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class IngresoPresenter(
    val usuario:UsuarioDTO
) {
    fun present():IngresoViewModel {
        val fechaHoy = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy MM dd kk:mm")
        val fechaStr = formatter.format(fechaHoy)
        return IngresoViewModel(
            usuario.email,
            fechaStr
        )
    }
}
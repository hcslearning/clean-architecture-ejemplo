package cl.hcs.clean.b_application.result

import cl.hcs.clean.b_application.dto.CursoDTO

sealed class ResultListarCursos {
    data class Exito(
        val cursos:List<CursoDTO>
    ):ResultListarCursos()
    data class Fallo(val mensaje:String):ResultListarCursos()
}
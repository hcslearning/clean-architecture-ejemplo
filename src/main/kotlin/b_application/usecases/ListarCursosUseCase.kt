package cl.hcs.clean.b_application.usecases

import cl.hcs.clean.b_application.repository.ICursoRepository
import cl.hcs.clean.b_application.result.ResultListarCursos

class ListarCursosUseCase(
    val cursoRepository:ICursoRepository
) {
    operator fun invoke():ResultListarCursos {
        val cursos = cursoRepository.obtenerTodosLosCursos()
        return ResultListarCursos.Exito(cursos)
    }
}
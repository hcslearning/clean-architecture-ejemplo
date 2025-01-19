package cl.hcs.clean.b_application.repository

import cl.hcs.clean.b_application.dto.CursoDTO

interface ICursoRepository {
    fun obtenerTodosLosCursos():List<CursoDTO>;
}
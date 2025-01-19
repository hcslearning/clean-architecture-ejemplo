package cl.hcs.clean.c_adapters.repository

import cl.hcs.clean.b_application.dto.CursoDTO
import cl.hcs.clean.b_application.repository.ICursoRepository
import cl.hcs.clean.c_adapters.datasource.ICursoDataSource

class CursoRepository(
    val dataSource:ICursoDataSource
):ICursoRepository {
    override fun obtenerTodosLosCursos(): List<CursoDTO> {
        return dataSource.recuperar()
    }
}
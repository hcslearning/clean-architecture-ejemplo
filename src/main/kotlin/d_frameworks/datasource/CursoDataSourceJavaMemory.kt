package cl.hcs.clean.d_frameworks.datasource

import cl.hcs.clean.b_application.dto.CursoDTO
import cl.hcs.clean.c_adapters.datasource.ICursoDataSource

class CursoDataSourceJavaMemory:ICursoDataSource {
    companion object {
        private val cursos:MutableList<CursoDTO> = mutableListOf(
            CursoDTO("Java", "Lorem ipsum dolor"),
            CursoDTO("Python", "Asit atme consequeum"),
        )
    }

    override fun recuperar(): List<CursoDTO> {
        return cursos;
    }

    override fun insertar(curso: CursoDTO) {
        cursos.add(curso)
    }

    override fun actualizar(nombre: String, curso: CursoDTO) {

    }

    override fun eliminar(curso: CursoDTO) {
        TODO("Not yet implemented")
    }
}
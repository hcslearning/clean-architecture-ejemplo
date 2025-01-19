package cl.hcs.clean.d_frameworks.builders.repositories

import cl.hcs.clean.b_application.repository.ICursoRepository
import cl.hcs.clean.c_adapters.repository.CursoRepository
import cl.hcs.clean.d_frameworks.builders.datasources.BuilderCursoDataSource

class BuilderCursoRepository {
    fun build():ICursoRepository {
        val ds = BuilderCursoDataSource().build()
        return CursoRepository(ds)
    }
}
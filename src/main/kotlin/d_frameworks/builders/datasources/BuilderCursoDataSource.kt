package cl.hcs.clean.d_frameworks.builders.datasources

import cl.hcs.clean.c_adapters.datasource.ICursoDataSource
import cl.hcs.clean.d_frameworks.datasource.CursoDataSourceJavaMemory

class BuilderCursoDataSource {
    fun build():ICursoDataSource {
        return CursoDataSourceJavaMemory()
    }
}
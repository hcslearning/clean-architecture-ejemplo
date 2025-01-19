package cl.hcs.clean.c_adapters.datasource

import cl.hcs.clean.b_application.dto.CursoDTO

interface ICursoDataSource {
    fun recuperar():List<CursoDTO>
    fun insertar(curso:CursoDTO):Unit
    fun actualizar(nombre:String, curso: CursoDTO):Unit
    fun eliminar(curso: CursoDTO):Unit
}
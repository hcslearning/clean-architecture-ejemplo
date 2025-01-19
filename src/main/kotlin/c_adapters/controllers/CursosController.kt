package cl.hcs.clean.c_adapters.controllers

import cl.hcs.clean.b_application.usecases.ListarCursosUseCase
import cl.hcs.clean.c_adapters.datasource.ICursoDataSource
import cl.hcs.clean.c_adapters.presenters.ListarCursosPresenter
import cl.hcs.clean.c_adapters.repository.CursoRepository
import cl.hcs.clean.c_adapters.viewmodels.ListadoCursosViewModel

class CursosController (
    val dataSource : ICursoDataSource
) {
    fun listadoCursos():ListadoCursosViewModel {
        val repository  = CursoRepository(dataSource)
        val resultado = ListarCursosUseCase(repository)()
        return ListarCursosPresenter()(resultado)
    }
}
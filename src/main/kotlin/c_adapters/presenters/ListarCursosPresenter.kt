package cl.hcs.clean.c_adapters.presenters

import cl.hcs.clean.b_application.dto.CursoDTO
import cl.hcs.clean.b_application.result.ResultListarCursos
import cl.hcs.clean.c_adapters.viewmodels.CursoViewModel
import cl.hcs.clean.c_adapters.viewmodels.ListadoCursosViewModel
import java.util.stream.Collectors

class ListarCursosPresenter {
    operator fun invoke(resultado:ResultListarCursos):ListadoCursosViewModel {
        val cursos:List<CursoViewModel>?
        val titulo:String
        when(resultado) {
            is ResultListarCursos.Exito -> {
                titulo = "Listado de Cursos"
                cursos = resultado.cursos.stream().map { c ->
                    CursoViewModel(c.nombre, c.descripcion)
                }.collect(Collectors.toList())
            }
            is ResultListarCursos.Fallo -> {
                titulo = resultado.mensaje
                cursos = null
            }
        }
        return ListadoCursosViewModel(
            true,
            titulo,
            cursos
        )
    }
}
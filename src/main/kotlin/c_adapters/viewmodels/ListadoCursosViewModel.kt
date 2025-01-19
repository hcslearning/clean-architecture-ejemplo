package cl.hcs.clean.c_adapters.viewmodels

data class ListadoCursosViewModel(
    val exito:Boolean,
    val titulo:String,
    val cursos:List<CursoViewModel>?
)

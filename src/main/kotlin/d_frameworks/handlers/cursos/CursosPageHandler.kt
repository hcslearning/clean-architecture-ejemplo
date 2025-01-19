package cl.hcs.clean.d_frameworks.handlers.cursos

import cl.hcs.clean.c_adapters.controllers.CursosController
import cl.hcs.clean.d_frameworks.builders.datasources.BuilderCursoDataSource
import cl.hcs.clean.d_frameworks.handlers.TemplateHttpHandler
import java.util.stream.Collectors

class CursosPageHandler(
    urlHtmlResource:String,
    replace:HashMap<String, String>?
):TemplateHttpHandler(urlHtmlResource, replace) {
    override fun preProcesar() {
        val ds = BuilderCursoDataSource().build()
        val controller = CursosController(ds)
        val cursosVm = controller.listadoCursos()
        replace?.put("{{titulo}}", cursosVm.titulo)
        val cursosHtml = cursosVm.cursos?.stream()
            ?.map { c ->
                "<div class='curso'><h2>${c.nombre}</h2><p>${c.descripcion}</p></div>"
            }
            ?.collect(Collectors.joining())
            ?: ""
        replace?.put("{{cursos}}", cursosHtml)
    }
}
package cl.hcs.clean

import cl.hcs.clean.d_frameworks.handlers.cursos.CursosPageHandler
import cl.hcs.clean.d_frameworks.handlers.StaticResourceHttpHandler
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.util.concurrent.Executors

fun main() {
    val port = 8090
    val server = HttpServer.create( InetSocketAddress(port), 0)
    server.createContext("/", StaticResourceHttpHandler("/registro/form.html"))
    server.createContext("/css/general.css", StaticResourceHttpHandler("/estilo/general.css"))
    server.createContext("/cursos", CursosPageHandler(
        "/cursos/listado.html",
        HashMap<String,String>()
    )
    )
    server.executor = Executors.newCachedThreadPool()
    server.start()
    println("Server started on http://localhost:${port}")
}


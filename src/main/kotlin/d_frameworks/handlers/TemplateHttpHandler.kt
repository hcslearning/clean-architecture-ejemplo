package cl.hcs.clean.d_frameworks.handlers

import cl.hcs.clean.d_frameworks.util.Util
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler

open class TemplateHttpHandler(
    protected val urlHtmlResource:String,
    protected val replace:HashMap<String, String>?
):HttpHandler {
    open fun preProcesar() {}

    override fun handle(exchange: HttpExchange?) {
        preProcesar()
        var html = Util.readFile(urlHtmlResource)
        if( replace != null){
            for ((key, value) in replace) {
                html = html.replace(key, value)
            }
        }
        val byteArr = html.toByteArray(Charsets.UTF_8)
        exchange?.sendResponseHeaders(200, byteArr.size.toLong())
        exchange?.responseBody?.write( byteArr )
        exchange?.responseBody?.close()
    }
}
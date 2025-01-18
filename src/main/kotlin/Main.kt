package cl.hcs.clean

import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import java.util.stream.Collectors

fun main() {
    val port = 8090
    val server = HttpServer.create( InetSocketAddress(port), 0)
    server.createContext("/", HomePageHandler())
    server.createContext("/register", RegisterPageHandler())
    server.executor = Executors.newCachedThreadPool()
    server.start()
    println("Server started on http://localhost:${port}")
}

class Util {
    companion object {
        fun readFile(file:String):String {
            val inputStream = Util::class.java.getResourceAsStream(file)
            val reader = BufferedReader(InputStreamReader(inputStream, Charsets.UTF_8))
            return reader.lines().collect(Collectors.joining(System.lineSeparator()))
        }
    }
}

class HomePageHandler:HttpHandler {
    override fun handle(exchange: HttpExchange?) {
        val html = Util.readFile("/index.html")
        val byteArr = html.toByteArray(Charsets.UTF_8)
        exchange?.sendResponseHeaders(200, byteArr.size.toLong())
        exchange?.responseBody?.write( byteArr )
        exchange?.responseBody?.close()
    }
}

class RegisterPageHandler:HttpHandler {
    override fun handle(exchange: HttpExchange?) {
        val byteArr = "<h1>Registro</h1>".toByteArray(Charsets.UTF_8)
        exchange?.sendResponseHeaders(200, byteArr.size.toLong())
        exchange?.responseBody?.write( byteArr )
        exchange?.responseBody?.close()
    }
}
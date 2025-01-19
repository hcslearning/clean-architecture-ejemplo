package cl.hcs.clean.d_frameworks.util

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

class Util {
    companion object {
        fun readFile(file:String):String {
            val inputStream = Util::class.java.getResourceAsStream(file)
            val reader = BufferedReader(InputStreamReader(inputStream, Charsets.UTF_8))
            return reader.lines().collect(Collectors.joining(System.lineSeparator()))
        }
    }
}
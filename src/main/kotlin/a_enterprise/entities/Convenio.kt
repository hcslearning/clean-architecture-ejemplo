package cl.hcs.clean.a_enterprise.entities

import java.time.LocalDate

class Convenio(
    val fecha:LocalDate,
    val fechaTermino:LocalDate,
    val razonSocial:String,
    val dominios:List<String>
) {

}
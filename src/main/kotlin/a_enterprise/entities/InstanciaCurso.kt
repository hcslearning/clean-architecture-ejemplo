package cl.hcs.clean.a_enterprise.entities

class InstanciaCurso(
    val curso: Curso,
    val alumnos:Set<Usuario>
) {

}
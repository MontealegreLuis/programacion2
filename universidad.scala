class Universidad(b: Alumnos, c: Profesores) {
     var historial1 = b
     var hostorial2 = c
}

class Alumnos(a: Departamentos, f: Asignatura) {
  var nombre
  var apellidos
  var proyectos
  var cuatri
  var seguridad
  var direccion
  var fecha
}

class Profesores(a: Departamentos, f: Asignatura){
  var nombre
  var apellidos
  var proyectos
  var despacho
  var extension
  var salario
}

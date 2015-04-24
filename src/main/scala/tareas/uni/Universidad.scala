package tareas.uni
import com.github.nscala_time.time.Imports._
object University extends App{
    var option: Int = 0
    var answer: Boolean = true
    val students = new Students()
    val professors = new Professors()
    val subjects = new Subjects()
    val departments = new Departments()
    val sections = new Sections()
    val academichistory = new academicHistory
    val projects = new Projects()
    println("\n ---------------------------BASE DE DATOS UNIVERSITARIA--------------------- ")
    println(" |                                                                         |\n")
    println("\t\t             ******BIENVENIDO******\n")
    while(answer == true){
        println("\t[1] AGREGAR ALUMNO \n")
        println("\t[2] AGREGAR PROFESOR \n")
        println("\t[3] AGREGAR ASIGNATURA \n")
        println("\t[4] AGREGAR DEPARTAMENTO \n")
        println("\t[5] SALIR \n")
        println("\n\t ---INGRESA EL NUMERO DE LA OPCION A LA QUE DESEAS INGRESAR--- \n")
        option = readInt()
    option match {
                
case 1 => println("\n+++AGREGAR ALUMNO+++")
    var tof: Boolean = true
        while(tof == true){
            println("\n Nombre:") ; var na = readLine()
            println("\n Numero de Seguro Social:") ; var socialSN = readLine()
            println("\n Direccion:") ; var a = readLine()
            println("\n Sexo[M/F]:") ; var s = readChar()
            println("\n Fecha de Nacimiento")
            println("\n Dia:") ; var d = readInt()
            println("\n Mes:") ; var m = readInt()
            println("\n Anio")  ; var y = readInt()
            var dateOB = new DateTime(y,m,d,0,0)
            println("\n Carrera:")   ; var c = readLine()
            println("\n Matricula:") ;var registrationN=readLine()
            var student = new Student(na,socialSN,a,s,dateOB,c,registrationN)
        
            students.add(student) ; student.showStudent()
            println("\n DESEA INGRESAR OTRO ALUMNO? \n 1. Si || 2. No\n")
            var option: Int = readInt() ; var booleano: Boolean = true                            
                while(booleano == true) {                    
                        if(option == 2) {
                            tof = false ; booleano = false} 
                        else if (option == 1) {
                            tof = true  ; booleano = false}
                        else if (option != 1) {
                            println("\n ERROR VUELVA A INTENTARLO")
                            println("\n 1. Si || 2. No\n")
                            option = readInt()}
                        else {}                        
                    }
        }
        
     
println("\n +++ DESEAS VER EL MENU?: [1. Si || 2. No]+++\n") ; var op = readInt()
if (op == 2) 
answer = false

case 2 => println("\n+++AGREGAR PROFESOR+++=")
    var tof:Boolean = true
        while(tof == true){
            
            println("\n Nombre:") ; var na2 = readLine()
            println("\n Numero de Seguro Social:") ; var socialSN2 = readLine()
            println("\n Direccion:") ; var a2 = readLine()
            println("\n Sexo[M/F]:") ; var s2 = readChar()
            println("\n Fecha de Nacimiento:")
            println("\n Dia:") ; var d2 = readInt()
            println("\n Mes:") ; var m2 = readInt()
            println("\n Anio:") ; var y2 = readInt()
            var dateOB2 = new DateTime(y2,m2,d2,0,0)
            println("\n Carrera:") ; var c2 = readLine()
            println("\n Categoria - HC,TC,MT:") ; var cat = readLine()
            println("\n Despacho:") ; var ofNu = readInt()
            println("\n Extensión:") ; var ext = readInt()
            println("\n Salario mensual:") ; var py = readFloat()
            val professor = new Professor(na2,socialSN2,a2,s2,dateOB2,c2,cat,ofNu,ext,py)
            professors.add(professor) ; professor.showProfessor()
            println("\n DESEA INGRESAR OTRO PROFESOR \n 1. Si || 2. No")
            var option: Int = readInt() ; var booleano: Boolean = true                            
                while(booleano == true) {                    
                        if(option == 2) {
                            tof = false ; booleano = false} 
                        else if (option == 1) {
                            tof = true  ; booleano = false}
                        else if (option != 1) {
                            println("\n ERROR VUELVA A INTENTARLO")
                            println("\n 1. Si || 2. No\n")
                            option = readInt()}
                        else {}                        
                    }
                }
        

println("\n DESEAS VER EL MENU?: [1. Si || 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                
case 3 => println("+++AGREGAR ASIGNATURA+++")
    var tof:Boolean = true
        while(tof == true){
            println("\n Nombre: \n") ; var na3 = readLine()
            println("\n Codigo: \n") ; var co = readInt()
            println("\n Descripcion: \n") ; var des = readLine()
            println("\n Carrera: \n") ; var c3= readLine()
            
            val subject = new Subject(na3,co,des,c3)
            subjects add(subject); subject.showSubject
            println("\n DESEA AGREGAR OTRA ASIGNATURA? \n 1. Si || 2. No\n")
            var option: Int = readInt() ; var booleano: Boolean = true                            
                while(booleano == true) {                    
                        if(option == 2) {
                            tof = false ; booleano = false} 
                        else if (option == 1) {
                            tof = true  ; booleano = false}
                        else if (option != 1) {
                            println("\n ERROR VUELVA A INTENTARLO")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }
                        }
                
  
println("\n DESEAS VER EL MENU?: [1. Si || 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                

case 4 => println("+++AGREGAR DEPARTAMENTO+++")
    var tof:Boolean = true
        while(tof == true){
            
            println("\n Nombre:") ; var na4 = readLine()
            println("\n Telefono:") ; var tel = readLine()
            println("\n Carrera:") ; var c4 = readLine()
                        val department = new Department (na4,tel,c4)
            departments.add(department) ; department.showDepartment()
                println("\n DESEA AGREGAR OTRO DEPARTAMENTO? \n 1. Si|| 2. No\n")
                var option: Int = readInt() ; var booleano: Boolean = true                            
                while(booleano == true) {                    
                        if(option == 2) {
                            tof = false ; booleano = false} 
                        else if (option == 1) {
                            tof = true  ; booleano = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si || 2. No\n")
                            option = readInt()}
                        else {}                        
                    }
                            }
      
println("\n DESEAS VER EL MENU?: [1. Si || 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                               

                
                case 5 => println("\n...PROGRAMA FINALIZADO...\n")
                answer = false
            }            
        }
    
}
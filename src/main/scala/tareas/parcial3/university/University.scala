package parcial3.university
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
    println("\n\t\t= AGENDA-ESCOLAR V1.94 =\n\t\t------------------------")
    println("\t\t  = #Menu Principal# =\n")
    while(answer == true){
        println("\n[1] Agregar Alumno \n")
        println("[2] Agregar Profesor \n")
        println("[3] Agregar Asignatura \n")
        println("[4] Agregar Departamento \n")
        println("[5] Agregar Seccion \n")
        println("[6] Inscribir Alumno \n")
        println("[7] Calificar Alumno \n")
        println("[8] Historial Academico \n")
        println("[9] Agregar Proyecto \n")
        println("[10] Agregar Profesor a proyecto \n")
        println("[11] Agregar Becario a proyecto \n")
        println("[12] Buscar Proyecto por codigo \n")
        println("[13] Salir \n")
        println("\n Ingresa el numero de la opcion que deseas: \n")
        option = readInt()
    option match {
                
//Caso 1: Agregar Alumno                
// - - - - - - - - - - -
                
case 1 => println("\n= Agregar Alumno =")
    var tof: Boolean = true
        while(tof == true){
            //Ingresar información del alumno
            println("\n~ Nombre:") ; var na = readLine()
            println("\n~ Numero de Seguro Social:") ; var socialSN = readLine()
            println("\n~ Direccion:") ; var a = readLine()
            println("\n~ Sexo[M/F]:") ; var s = readChar()
            println("\n~ Fecha de Nacimiento")
            println("\n~ Dia:") ; var d = readInt()
            println("\n~ Mes:") ; var m = readInt()
            println("\n~ Año")  ; var y = readInt()
            var dateOB = new DateTime(y,m,d,0,0)
            println("\n~ Carrera:")   ; var c = readLine()
            println("\n~ Matricula:") ;var registrationN=readLine()
            var student = new Student(na,socialSN,a,s,dateOB,c,registrationN)
            //Crear nuevo alumno con la información ; Mostrar información del alumno
            students.add(student) ; student.showStudent()
            println("\n Desea ingresar otro alumno? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }//End While Students
        
// Mostrar Menú      
println("\n # Mostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false

//Caso 2: Agregar Profesor                
// - - - - - - - - - - - -
                
case 2 => println("\n= Agregar Profesor=")
    var tof:Boolean = true
        while(tof == true){
            //Ingresar información del profesor
            println("\n~ Nombre:") ; var na2 = readLine()
            println("\n~ Número de Seguro Social:") ; var socialSN2 = readLine()
            println("\n~ Direccion:") ; var a2 = readLine()
            println("\n~ Sexo[M/F]:") ; var s2 = readChar()
            println("\n~ Fecha de Nacimiento:")
            println("\n~ Dia:") ; var d2 = readInt()
            println("\n~ Mes:") ; var m2 = readInt()
            println("\n~ Año:") ; var y2 = readInt()
            var dateOB2 = new DateTime(y2,m2,d2,0,0)
            println("\n~ Carrera:") ; var c2 = readLine()
            println("\n~ Categoria - HC,TC,MT:") ; var cat = readLine()
            println("\n~ Despacho:") ; var ofNu = readInt()
            println("\n~ Extensión:") ; var ext = readInt()
            println("\n~ Salario mensual:") ; var py = readFloat()
            val professor = new Professor(na2,socialSN2,a2,s2,dateOB2,c2,cat,ofNu,ext,py)
            //Crear nuevo profesor con la información ; Mostrar información del profesor
            professors.add(professor) ; professor.showProfessor()
            println("\n Desea ingresar otro profesor? \n 1. Si / 2. No")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
                }//End While Professor
        
// Mostrar Menú      
println("\n # Mostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                
//Caso 3: Agregar Asignatura           
// - - - - - - - - - - - - -

case 3 => println("= Agregar Asignatura=")
    var tof:Boolean = true
        while(tof == true){
            //Ingresar información de la asignatura
            println("\n~ Nombre: \n") ; var na3 = readLine()
            println("\n~ Codigo: \n") ; var co = readInt()
            println("\n~ Descripcion: \n") ; var des = readLine()
            println("\n~ Carrera: \n") ; var c3= readLine()
            val depOfCareer = departments.ofCareer(c3)
            println("\n~ Departamento: \n")
                for (i <- 0 to depOfCareer.length){
                    println("/t=>" + depOfCareer(i).Name)}
            println("\n~ Seleccionar departamento:\n")
            val select = readInt()
            val depart = depOfCareer(select)
            val subject = new Subject(na3,co,des,depart,c3)
            subjects add(subject)
            println("\n Desea ingresar otro asignatura? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
                        }//endWhile Asignaturas
                
// Mostrar Menú      
println("\n # Mostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                
//Caso 4: Agregar departamento             
// - - - - - - - - - - - - - -              

case 4 => println("= Agregar Departamento =")
    var tof:Boolean = true
        while(tof == true){
            //Ingresar información del departamento
            println("\n~ Nombre:") ; var na4 = readLine()
            println("\n~ Telefono:") ; var tel = readLine()
            println("\n~ Carrera:") ; var c4 = readLine()
            val professorsOfCareer = professors.ofCareer(c4)
            println("Profesores de la Carrera:")
                for (i <- 0 to professorsOfCareer.length){
                println("/t=>" + professorsOfCareer(i).Name)}                                                    
            var select = readInt()
            val principal = professorsOfCareer(select)
            val department = new Department (na4,tel,principal,c4)
            departments.add(department) ; department.showDepartment()
            println("\n Desea ingresar otro departamento? \n 1. Si / 2. No\n")
                var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false
                               
//Caso 5: Agregar Sección             
// - - - - - - - - - - - 
        
case 5 => println("\n= Agregar Seccion =")
    var tof:Boolean = true
        while(tof == true){
            //Ingresar información de la sección
            println("\n~ Carrera:") ; var c5 = readLine()
            //Seleccionamos la asignatura
            val subjectsOfCareer = subjects.ofCareer(c5)
            println("Asignaturas de la carrera:")
                for (i <- 0 to subjectsOfCareer.length){
                    println("/t=>" + subjectsOfCareer(i).Name)}                                
            val selectSubject = readInt()
            val subject = subjectsOfCareer(selectSubject)
            println("\n~ Grupo:") ; var gr = readInt()
            val professorsOfCareer = professors.ofCareer(c5)
            println("Profesores de la carrera:")
                for (i <- 0 to professorsOfCareer.length){
                    println("/t=>" + professorsOfCareer(i).Name)}                                
            var select = readInt()
            val professor = professorsOfCareer(select)
            println("\n~ Cuatrimestre (Primavera/Verano/Otoño):")
            var fmp = readLine()
            println("\n~ Year")
            var y = readInt()
            val section = new Section(subject,gr,professor,fmp,y)
            sections.add(section)                   
            println("\n Desea ingresar otra seccion? \n 1. Si / 2. No\n")
           var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }//End While Seccion
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false                                    
//Caso 6:             
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -             
case 6 => println("\n= Inscribir Alumno=")
    var tof:Boolean = true
        while(tof == true){                          
            println("\n~ Carrera: \n") ; var c6= readLine()
            println("\n~ Cuatrimestre (Primavera/Verano/Otoño): ") ; var fmp = readLine()
            println("\n ~ Año: ") ; var y6 = readInt()
            //Seleccion de la carrera
            val sectionsCareer = sections.coincideWith(c6,fmp,y6)
            println("Seccion: ")                                    
            for (i <- 0 to sectionsCareer.length){                    
            //println("/t=>" + subjectsOfCareer(i).subject.Name() + "<=>" + professorsOfCareer(i)professor.Name())
            }
            val selectSection = readInt()
            val section = sectionsCareer(selectSection)
            println("\n Desea inscribir otro alumno? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
                            }
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false                             
//Caso 7: Calificar Alumno             
// - - - - - - - - - - - -
case 7 => println("\n= Calificar Alumno =")
    var tof:Boolean = true
        while(tof == true){
            println("Matricula") ; var rNumber = readLine
            println(" Materia:") ; val stud = students.withRegistrationNumber(rNumber)
            val emptyNotes = stud.subjectsUnrated()
            for (i <- 0 to emptyNotes.length){
                println("/t=> [" + i + "]" + emptyNotes(i).section.career())}
            println("Materia a calificar: ") ; val selectSubject = readInt()
            println("Calificacion: ") ; val grade = readInt()
            emptyNotes(selectSubject).Rate(grade)
            val qualifiedNote = emptyNotes(selectSubject)
            academichistory.add(qualifiedNote)
            println("\n Desea ingresar otro alumno? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false                             
//Caso 8: Historial Academico           
// - - - - - - - - - - - - - - 
                
case 8 => println("= Historial Academico =")
    var tof:Boolean = true
        while(tof == true){
            println("\n Matricula: \n") ; var rg = readLine()
            val stud = students.withRegistrationNumber(rg)
            println("=>" + students.withRegistrationNumber(rg).Name())
            val academicH = students.withRegistrationNumber(rg).History()
            // Falta...
            println("\n Desea mostrar otro historial academico? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false 
                
//Caso 9: Agregar Proyecto             
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -             
case 9 => println("= Agregar Proyecto =")
    var tof:Boolean = true
        while(tof == true){
            println("\n Career: \n") ; var c11 = readLine()
            println("\n Nombre: \n") ; var na11 = readLine()
            println("\n Codigo: \n") ; var cod = readLine()
            println("\n Fecha de inicio: \n")
            println("\n Dia: \n") ; val day = readInt()
            println("\n Mes: \n") ; val month= readInt()
            println("\n Año: \n") ;  val year = readInt()
            var startdate = new DateTime(year,month,day,0,0)
            println("\n ($) Subvención: \n") ; var sub = readFloat()
            println("\n Insitución: \n") ; var inst = readLine()
            println("\n Investigador: \n")
            val profs = professors.ofCareer(c11)
                for(i <- 0 to profs.length){
                    println("[" + i + "]" + profs(i).Name)}
            println("\nEliga un profesor como investigador:\n")
            val selectProf = readInt()
            val project = new Project(c11,na11,cod,startdate,sub,inst)
            //project.addProfessor(proff)
            projects.add(project)
            project.addResearcher(profs(selectProf))
            println("\n Desea agregar otro proyecto? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false                               

//Caso 10: Agregar Profesor a Proyecto         
// - - - - - - - - - - - - - - - - - - 

case 10 => println("= Agregar Profesor a Proyecto =")
    var tof:Boolean = true
        while(tof == true){
        println("\n Codigo: \n") ; var code = readLine()
        val projectWithCode = projects.withCode(code)
        val careerCode = projectWithCode.Career()
        val professorsOfCareer = professors.ofCareer(careerCode)
            for(i <- 0 to professorsOfCareer.length){
                println("[" + i + "]" +  professorsOfCareer(i).Name())}
       println("\n Que profesor desea agregar al proyecto?\n") ; var select = readInt()
       val selectProfessor = professorsOfCareer(select)
       projectWithCode.addProfessor(selectProfessor)
       println("\n Desea ingresar otro profesor a otro proyecto? \n 1. Si / 2. No\n")
       var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false                             
//Caso 11: Agregar Becario a Proyecto            
// - - - - - - - - - - - - - - - - -            
case 11 => println("= Agregar Becario a Proyecto =")
    var tof:Boolean = true
        while(tof == true){
            println("\n Codigo: \n") ; var code = readLine()
            val projectWithCode = projects.withCode(code)
            val careerCode = projectWithCode.Career()
            val scholarshipHolderOfCareer = students.ofCareer(careerCode)        
            for(i <- 0 to scholarshipHolderOfCareer.length){
                println("[" + i + "]" + scholarshipHolderOfCareer(i).Name())}
            println("\nQue becario desea agregar al proyecto:\n") ; var select = readInt()
            val selectSH = scholarshipHolderOfCareer(select)
            projectWithCode.addScholarshipHolder(selectSH)
            println("\n Desea ingresar otro becario al proyecto \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
        }
                            
 // Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false 
        
//Caso 12: Buscar Proyecto por Código            
// - - - - - - - - - - - - - - - - - -
case 12 => println("= Buscar Proyecto por Codigo=")
    var tof:Boolean = true
        while(tof == true){
            println("\n Codigo: \n") ; var code = readLine()
            //Datos del proyecto
            val projectWithCode = projects.withCode(code)
            projectWithCode.showProject()
            // Profesores del proyecto  
            val professorProject = projectWithCode.Professor()
                for(i <- 0 to professorProject.length){
                    professorProject(i).showProfessor()}
            //Becarios del Proyecto
            val  shProject = projectWithCode.ScholarshipHolder()
                for( i <- 0 to shProject.length ){
                    shProject(i).showStudent()}
            println("\n Desea buscar otro proyecto con codigo? \n 1. Si / 2. No\n")
            var option: Int = readInt() ; var bool: Boolean = true                            
                while(bool == true) {                    
                        if(option == 2) {
                            tof = false ; bool = false} 
                        else if (option == 1) {
                            tof = true  ; bool = false}
                        else if (option != 1) {
                            println("\n Opcion incorrecta dude! Vuelve a intentarlo")
                            println("\n 1. Si / 2. No\n")
                            option = readInt()}
                        else {}                        
                    }//End while option
            }
        
// Mostrar Menú     
println("\nMostrar Menu: [1. Si / 2. No]\n") ; var op = readInt()
if (op == 2) 
answer = false  
        
//Caso 13: Salir         
// - - - - - - -            
case 13 => println("\n= GRACIAS POR HABER USADO AGENDA-ESCOLAR V1.94 =\n")
    answer = false
        
        
//Fin opciones          
// - - - - - -
        
            }//End match            
        }//while menu
    println("\n### PROGRAMA FINALIZADO ###")
    println("- Compilado por Jorge Montes")
    println("- Matricula: 201321617\n")
}//while object
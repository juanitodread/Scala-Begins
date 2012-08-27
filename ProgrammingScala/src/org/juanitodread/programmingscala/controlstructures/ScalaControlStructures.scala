package org.juanitodread.programmingscala.controlstructures
import scala.swing._

object ScalaControlStructures{

  def main(args: Array[String]): Unit = {
    require(args.size == 2)
    
    //The if and for control structures are expressions, the while control structure is not an expression
    
    //You should use val's, cause They make your code easier to read and easier to refactor
    val sex = if(args(0).toUpperCase() == "H") "MASCULINO" else if(args(0).toUpperCase() == "M") "FEMENINO" else "NO DEFINIDO"
    
    var cad: StringBuilder = new StringBuilder(args(1))
    var aux: String = ""
    val reverse = while(cad.length != 0){
      aux += cad.charAt(if(cad.length > 0) cad.length - 1 else cad.length)
      cad.setLength(if(cad.length > 0) cad.length - 1 else cad.length)
      aux
    }
      
    println(sex)
    println(reverse)
    
    //for
    val filesHere = new java.io.File(".\\src\\org\\juanitodread\\programmingscala").listFiles()
    
    for(file <- filesHere
    	if file.isFile 
    	if file.getName.endsWith(".scala")
    	){
      println(file)
    }
    
    //asign for values to a new collection
    val files = for{
      file <- filesHere
    	if file.isFile 
    	if file.getName.endsWith(".scala")
    } yield file
    
    files.foreach(println)
    
  }

}
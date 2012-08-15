package org.juanitodread.programmingscala
import org.juanitodread.programmingscala.functional.Rational


object MainApplication {

  def main(args: Array[String]): Unit = {
    val rational: Rational = new Rational(5, 25)
    val sumando: Rational = new Rational(7)
    
    val suma: Rational = rational + sumando
    val producto = rational * sumando
    val cociente = rational / sumando
    
    println(suma)
    println(producto)
    println(cociente)
    println(rational + 2)
  }

}
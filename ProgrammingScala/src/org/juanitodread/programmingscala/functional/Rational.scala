package org.juanitodread.programmingscala.functional

class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0)//a constraint for check the construct of the class with a valid values
  
  private val gcd = greatestCommonDivisor(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcd//make class parameters to class fields
  val denom: Int = denominator / gcd//make class parameters to class fields
  
  def this(numer: Int) = this(numer, 1)//auxiliary constructor (invokes to original class constructor)
  
  /*
   * 
   */
  def +(that: Rational): Rational = {
    new Rational(this.denom * that.numer + that.denom * this.numer, this.denom * that.denom)
  }
  
  /*
   * 
   */
  def +(natural: Int): Rational = {
    new Rational(this.denom * natural + this.numer, this.denom)
  }
  
    /*
   * 
   */
  def -(that: Rational): Rational = {
    new Rational(this.denom * that.numer - that.denom * this.numer, this.denom * that.denom)
  }
  
  /*
   * 
   */
  def -(natural: Int): Rational = {
    new Rational(this.denom * natural - this.numer, this.denom)
  }
  
  /*
   * 
   */
  def *(that: Rational): Rational = {
    new Rational(this.numer * that.numer, this.denom * that.denom)
  }
  
  /*
   * 
   */
  def *(natural: Int): Rational = {
    new Rational(this.numer * natural, this.denom)
  }
  
  /*
   * 
   */
  def /(that: Rational): Rational = {
    new Rational(this.numer * that.denom, this.denom * that.numer)
  }
  
  /*
   * 
   */
  def /(natural: Int): Rational = {
    new Rational(this.numer, this.denom * natural)
  }
  
  private def greatestCommonDivisor(a: Int, b: Int): Int = {
    if(b == 0) a else greatestCommonDivisor(b, a % b)
  }
  
  /*
   * Override toString() method
   */
  override def toString(): String = {
    this.numer + "/" + this.denom
  }
  
}
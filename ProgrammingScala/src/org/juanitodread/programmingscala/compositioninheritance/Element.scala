/**
 * Scala-Begins
 *
 * Copyright 2014 juanitodread
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.juanitodread.programmingscala.compositioninheritance

/**
 *
 *
 * @author juanitodread
 * @version $
 *
 * Jul 26, 2014
 */
abstract class Element {

  def contents: Array[ String ]

  def height = contents.length

  def width = if ( height == 0 ) 0 else contents( 0 ).length
  
  override def toString = contents mkString "\n"
  
}

object Element {
  
  def elem( contents: Array[ String ] ): Element = new ArrayElement( contents )
  
  def elem( chr: Char, width: Int, height: Int ): Element = new UniformElement( chr, width, height )
  
  def elem( line: String ): Element = new LineElement( line )
}
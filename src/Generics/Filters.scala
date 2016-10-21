package Generics

/**
  * Created by allangomes on 21/10/16.
  */

class Primitives[T <: AnyVal] {
}

class Objects[T <: AnyRef] {
}

object Start extends App {
  val p = new Primitives[Int]
  println(p.getClass.getName)
  val o = new Objects[String]
  println(o.getClass.getName)


  //val error = new Objects[Int]
  //val error = new Primitives[String]
}
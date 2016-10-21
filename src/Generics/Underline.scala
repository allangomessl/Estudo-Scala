package Generics

import scala.reflect.ClassTag

/**
  * Created by allangomes on 21/10/16.
  */


class TypeInformation[T] {
  def name(implicit t: ClassTag[T]) = t.runtimeClass.getName
}

class Underline[T[_]] {

    //Define sempre como String
    def Generic[TR](implicit ts: ClassTag[T[TR]]) = {
      ts.runtimeClass.newInstance().asInstanceOf[T[TR]]
    }

    //Define sempre o tipo da classe
    def GenericClass(implicit t: ClassTag[T[_]]) = t.runtimeClass.newInstance().asInstanceOf[T[_]]

    //Define _ com o que for passado utilizando inferencia de tipos
    def GenericMethod[TR](param: T[TR]) = param.asInstanceOf[T[TR]]
}

object test extends App {
  val un = new Underline[TypeInformation]
  println(un.Generic[String].name)
  println(un.GenericClass.name)
  println(un.GenericMethod(new TypeInformation[Integer]).name)
}
package Implicits

import scala.reflect.ClassTag

/**
  * Created by allangomes on 21/10/16.
  */
class Injection(implicit val tag: ClassTag[String]) {
  println(f"Type is ${tag.runtimeClass.getName}")
}


object Console extends App {
  new Injection()
}
package Implicits

/**
  * Created by allangomes on 21/10/16.
  */

class Base {
}

object extension {
  implicit class BaseExtension(self: Base) {
    def extMethod = self.getClass.getName
  }
}


object Start extends App {
  import extension._

  val base = new Base
  println(base.extMethod)
}
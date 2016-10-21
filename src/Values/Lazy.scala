package Values

/**
  * Created by allangomes on 21/10/16.
  */
object Console extends App {

  def waitForIt: Int = {
    println("Wait For It")
    Thread.sleep(3000)
    10
  }

  lazy val tenValue = waitForIt

  println(tenValue) // Wait

  println(tenValue) // Cached Value
}

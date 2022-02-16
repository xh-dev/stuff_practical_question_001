import Test.calc

/* in javascript
function recur(n, cur){
    if(!cur){
        cur=0;
    }
    if(n<2){
        throw new Error("invalid input");
    }
    if(n===2){
        return 1/n +cur;
    }
    return recur(n-1, cur + 1/(n*(n-1)));
}
 */
object Test{
  def calc(n: Int, cur: Double = 0): Double = {
    n match {
      case n if n < 2 =>
        throw new RuntimeException("Input not valid")
      case n if n >= 2 =>
        val nDouble = n.toDouble
        val k = (n - 2).toDouble
        val x = 0.5
        cur + (k/(nDouble*(nDouble-k))) + x
    }
  }
}

object Main extends App {
  println(calc(2))
  println(calc(3))
  println(calc(4))
  println(calc(5))
  println(calc(6))
  println(calc(7))
  println(calc(8))
  println(calc(9))
}

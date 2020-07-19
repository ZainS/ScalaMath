import scala.collection.mutable.ListBuffer

object SpecialMath {
  def main(args: Array[String]) = {
    for(ar<-args){
      var x:Int = ar.toInt
      print(specialMathCalc(x))
    }
  }
  def specialMathCalc(n:Int): Int = {
    val values = ListBuffer[Int]();
    values += 0
    values += 1
    for (x <- 2 to n+1) {
      values += ( (x-1) + (x-2) )
    }
    return values.last
  }
}

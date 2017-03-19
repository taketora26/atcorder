import java.util.Scanner;

object Main {

  def main(args: Array[String]): Unit = {
    val scan:Scanner = new Scanner(System.in)

    val sampleA = scan.nextLine()
    val sampleBC = scan.nextLine()
    val sampleS: String = scan.next()

    val sampleBCSplit= sampleBC.split(" ").map(_.toInt).toList.sum
    val sampleSum = sampleA.toInt + sampleBCSplit
    println(sampleSum + " " + sampleS)
  }
}

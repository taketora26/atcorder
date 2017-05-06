import java.util.Scanner;

object Main {

  def main(args: Array[String]): Unit = {
    val scan: Scanner = new Scanner(System.in)

    val wordA = scan.next()
    val wordB = scan.next()
    val wordC: String = scan.next()


    val lastWordWordA = wordA.charAt(wordA.length() - 1)
    val firstWordWordB = wordB.charAt(0)

    val lastWordWordB = wordB.charAt(wordB.length() - 1)
    val firstWordWordC = wordC.charAt(0)

    if (lastWordWordA == firstWordWordB && lastWordWordB == firstWordWordC) {
      println("YES")
    } else {
      println("NO")
    }
  }
}

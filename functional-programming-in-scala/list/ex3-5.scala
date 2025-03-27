package ex3_5

import datastructures.List
import datastructures.List.*

object Solve {
    @main def printResult: Unit =
        println(dropWhile(List(2, 4, 5, 6), (n: Int) => n % 2 == 0))
}
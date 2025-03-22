package ex3_2

import datastructures.List
import datastructures.List.*

object Solve {
    @main def printResult: Unit =
        println(tail(List(1, 2, 3, 4, 5)))
        println(tail(List(1)))
        println(tail(Nil))
}
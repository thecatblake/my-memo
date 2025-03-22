package ex3_1

import datastructures.List
import datastructures.List.*

object Solve {
    @main def printResult: Unit =
        println(
            List(1, 2, 3, 4, 5) match 
                case Cons(x, Cons(2, Cons(4, _))) => x
                case Nil => 42
                case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
                case Cons(h, t) => h + sum(t)
                case null => 0
        )
}
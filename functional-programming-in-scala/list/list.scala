package datastructures

enum List[+A]:
    case Nil
    case Cons(head: A, tail: List[A])

object List:
    def apply[A](as: A*): List[A] =
        if as.isEmpty then Nil
        else Cons(as.head, apply(as.tail*))

    def sum(ints: List[Int]): Int = ints match
        case Nil => 0
        case Cons(x, xs) => x + sum(xs)
    
    def produt(doubles: List[Double]): Double = doubles match
        case Nil => 1.0
        case Cons(0, _) => 0.0
        case Cons(x, xs) => x * produt(xs)

    def tail[A](as: List[A]): List[A] = as match 
        case Nil => sys.error("Do not use tail on Nil")
        case Cons(x, xs) => xs
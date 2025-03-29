package datastructures

enum List[+A]:
    case Nil
    case Cons(head: A, tail: List[A])

object List:
    def apply[A](as: A*): List[A] =
        if as.isEmpty then Nil
        else Cons(as.head, apply(as.tail*))

    def foldRight[A, B](as: List[A], acc: B, f: (A, B) => B): B = as match
        case Nil => acc
        case Cons(x, xs) => f(x, foldRight(xs, acc, f))

    def sum(ints: List[Int]): Int =
        foldRight(ints, 0, _ + _)
    
    def produt(doubles: List[Double]): Double =
        foldRight(ints, 1.0, _ * _)

    def tail[A](as: List[A]): List[A] = as match 
        case Nil => sys.error("Do not use tail on Nil")
        case Cons(x, xs) => xs

    def setHead[A](as: List[A], head: A): List[A] = as match
        case Nil => Cons(head, Nil)
        case Cons(_, xs) => Cons(head, xs)

    def drop[A](as: List[A], n: Int): List[A] =
        if n == 0 then as
        else as match 
            case Nil => Nil
            case Cons(x, xs) => drop(xs, n - 1)

    def dropWhile[A](as: List[A], f: A => Boolean): List[A] = as match
        case Nil => Nil
        case Cons(x, xs) => 
            if f(x) then dropWhile(xs, f)
            else Cons(x, xs)

    def init[A](as: List[A]): List[A] = as match
        case Nil => Nil
        case Cons(x, Nil) => Nil
        case Cons(x, xs) => Cons(x, init(xs))

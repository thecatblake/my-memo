object FibTail {
    def fibTail(n: Int, i: Int, r1: Int, r2: Int): Int =
        if (n == i) r2
        else fibTail(n, i + 1, r2, r1 + r2)

    def fib(n: Int): Int = 
        if (n == 0 || n == 1) n
        else fibTail(n, 1, 0, 1)

    @main def printFib: Unit =
        println(fib(10))
}
object Fib {
    def fib(n: Int): Int =
        if (n == 0 || n == 1) n
        else fib(n - 1) + fib(n - 2)

    @main def printFib: Unit = 
        println(fib(10))
}
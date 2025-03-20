object Solve {
    def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))

    def square(n: Int): Int = n * n

    def toString(n: Int): String =
        val s = n.toString
        f"num: $s"

    @main def printResult: Unit = 
        println(compose(toString, square)(4))
}
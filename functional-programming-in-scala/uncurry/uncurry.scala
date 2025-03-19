object UnCurry {
    def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

    def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A) => (b: B) => f(a, b)

    def mulstr(s: String, i: Int): Int = s.length * i


    @main def printResult: Unit =
        println(uncurry(curry(mulstr))("aa", 3))
}
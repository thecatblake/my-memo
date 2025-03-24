package bitcoin.field.test

import bitcoin.field.*

object Test {
    @main def printResult: Unit =
        println(FieldElement(7, 13) == FieldElement(7, 13))
        println(FieldElement(7, 13) != FieldElement(6, 13))
}
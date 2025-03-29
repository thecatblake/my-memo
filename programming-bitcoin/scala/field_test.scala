package bitcoin.field.test

import bitcoin.field.*

object Test {
    @main def printResult: Unit =
        println(FieldElement(7, 13) == FieldElement(7, 13))
        println(FieldElement(7, 13) != FieldElement(6, 13))

    @main def testAddition: Unit =
        println(FieldElement(44, 57) + FieldElement(33, 57))

    @main def testSubtraction: Unit =
        println(FieldElement(9, 57) - FieldElement(29, 57))

}

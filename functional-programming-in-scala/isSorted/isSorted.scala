object IsSorted {
    def isSortedLoop[A](as: Array[A], gt: (A, A) => Boolean, prev: A, result: Boolean): Boolean =
        if (as.length == 0) result
        else isSortedLoop(as.tail, gt, as.head, result & gt(prev, as.head))

    def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
        isSortedLoop(as.tail, gt, as.head, true)

    @main def printResult: Unit = 
        println(isSorted(Array(1, 2, 3, 5, 1), _ < _))
}

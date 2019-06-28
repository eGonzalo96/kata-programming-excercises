
fun chop(numberToSearch: Int, list: List<Int>,
         lowerIndex: Int = 0, higherIndex: Int = list.size) : Int {

    var halfOfArray = (higherIndex - lowerIndex)

    if(halfOfArray <= 0) {
        return -1
    } else {

        halfOfArray = halfOfArray/2 + lowerIndex

        if(list[halfOfArray] == numberToSearch) {
            return halfOfArray
        } else {
            val leftSideResult = chop(numberToSearch, list, lowerIndex, halfOfArray)
            if(leftSideResult != -1) {
                return leftSideResult
            }

            val rightSideResult = chop(numberToSearch, list, halfOfArray+1, higherIndex)
            if(rightSideResult != -1) {
                return rightSideResult
            }

            return -1
        }
    }
}

class SumOfParts {

    companion object {

        fun sum(list: MutableList<Int>) : MutableList<Int> =
            if(list.size > 0) {
                val newList = mutableListOf(list.sum())
                newList.addAll(sum(list.subList(1, list.size)) as Collection<Int>)
                newList
            } else {
                mutableListOf(0)
            }

    }

}


fun MutableList<Int>.sum() : Int {
    var sum = 0
    for(i in this) { sum += i }
    return sum
}
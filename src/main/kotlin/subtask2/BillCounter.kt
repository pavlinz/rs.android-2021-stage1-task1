package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0

        for ((index, value) in bill.withIndex()) {
            if (index == k) continue
            sum += value
        }

        return if (sum / 2 == b) "bon appetit"
        else (b - sum / 2).toString()
    }
}

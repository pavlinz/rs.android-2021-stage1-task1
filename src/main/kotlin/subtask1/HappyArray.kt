package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var array = sadArray.toMutableList()
        val buffer = mutableListOf<Int>()

        while (isSadArray(array.toIntArray())) {
            buffer.add(array[0])
            for (i in 1..array.size - 2)
                if (array[i] < array[i - 1] + array[i + 1])
                    buffer.add(array[i])
            buffer.add(array[array.size - 1])
            array = buffer.toMutableList()
            buffer.clear()
        }
        return array.toIntArray()
    }

    private fun isSadArray(array: IntArray) : Boolean {
        for (i in 1..array.size - 2) {
            if (array[i] > array[i - 1] + array[i + 1])
                return true
        }
        return false
    }
}

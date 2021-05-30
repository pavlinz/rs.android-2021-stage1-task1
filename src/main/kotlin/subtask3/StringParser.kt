package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val brackets = listOf('(','<','[',')','>',']')
        val result = ArrayList<String>()
        val buffer = StringBuilder(inputString)

        for (i in buffer.length - 1 downTo 0){
            if (buffer[i] in brackets.subList(0, 3)){
                var last = 0
                for (letter in i until buffer.length) {
                    if (buffer[letter] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                        last = letter
                        buffer[i] = ' '
                        buffer[last] = ' '
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, last))
            }
        }
        return result.toTypedArray()
    }
}

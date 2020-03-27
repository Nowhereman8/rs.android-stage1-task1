package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {
        var temp = ""
        var t : Int
        var count = 0
        val res = arrayListOf<String>()

        for (i in 0..inputString.length-1) {
            when (inputString[i].toChar()) {
                '[' -> {
                    count++
                    t = i + 1
                    while (count != 0) {
                        if (count != 0 ) {
                            temp += inputString[t].toChar()
                        }
                        t++
                        if (inputString[t].toChar() == '[') {count++}
                        if (inputString[t].toChar() == ']') {count--}
                    }
                    res.add(temp)
                    // println("fin $temp")
                    temp = ""
                }
                '(' -> {
                    count++
                    t = i + 1
                    while (count != 0) {
                        if (count != 0 ) {
                            temp += inputString[t].toChar()
                        }
                        t++
                        if (inputString[t].toChar() == '(') {count++}
                        if (inputString[t].toChar() == ')') {count--}
                    }
                    res.add(temp)
                    // println("fin $temp")
                    temp = ""
                }
                '<' -> {
                    count++
                    t = i + 1
                    while (count != 0) {
                        if (count != 0 ) {
                            temp += inputString[t].toChar()
                        }
                        t++
                        if (inputString[t].toChar() == '<') {count++}
                        if (inputString[t].toChar() == '>') {count--}
                    }
                    res.add(temp)
                    temp = ""
                }
            }
        }

        return res.toTypedArray()
    }
}

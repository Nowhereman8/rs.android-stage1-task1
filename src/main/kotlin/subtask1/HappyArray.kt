package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val sadList = sadArray.toCollection(ArrayList())
        var i = 1
        println(sadList)
        while (i < (sadList.size - 1)) {
            if (sadList.get(i) > (sadList.get(i - 1) + sadList.get(i + 1))) {
                sadList.removeAt(i)
                if (i > 1) {
                    i = i - 1
                }
            }
            else {
                    i = i + 1
                }
            }
        return sadList.toIntArray()
        }
    }
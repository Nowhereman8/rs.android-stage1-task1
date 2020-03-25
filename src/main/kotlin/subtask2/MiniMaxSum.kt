package subtask2

class MiniMaxSum {


    fun getResult(input: IntArray): IntArray {
        // val mylist = input.toCollection(ArrayList())
        var minlist = input.toCollection(ArrayList())
        var maxlist = input.toCollection(ArrayList())
       var min = maxlist.get(0)
       // println(minlist.size)
       var max = minlist.get(0)
        //println(max)
        var minsum = 0
        var maxsum = 0

        for (i in 0..minlist.size -1) {
            if (max < minlist.get(i)) { max = minlist.get(i) }
        }
        for (i in 0..maxlist.size -1) {
            if (min > maxlist.get(i)) {min = maxlist.get(i) }
        }
        minlist.remove(max)
        println(minlist)
        maxlist.remove(min)
        println(maxlist)
        for (i in 0..minlist.size - 1) {
            maxsum += minlist.get(i)
        }
        for (i in 0..maxlist.size - 1) {
            minsum += maxlist.get(i)
        }
        return intArrayOf(maxsum, minsum)
    }
}

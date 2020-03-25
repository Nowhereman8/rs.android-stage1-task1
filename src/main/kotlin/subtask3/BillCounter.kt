package subtask3

@Suppress("UNREACHABLE_CODE")
class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val billList = bill.toCollection(ArrayList())
        var sumAll = 0
        var sumAnn = 0
        for (i in 0..billList.size - 1) {
            sumAll += billList.get(i)
        }
        billList.removeAt(k)
        for (i in 0..billList.size - 1) {
            sumAnn += billList.get(i)
        }
        val brianPay = sumAll - (sumAnn/2)
        val annPay = sumAll - brianPay
        if (b == annPay) {
            return ("Bon Appetit")
        }
        else {
            return (b - annPay).toString()
        }
    }
}

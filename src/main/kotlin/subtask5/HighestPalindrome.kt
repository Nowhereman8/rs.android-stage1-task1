package subtask5

class HighestPalindrome {


    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

            var p = 0
            var g = 0
            var index = -1
            var list = digitString.toCollection(ArrayList())
            var t = 0
            for (i in 0..(list.size)/2 - 1) {
                if (list.get(i) != list.get(list.size-1-i)) {

                    t++
                }
            }
            if (k < t) { return ("-1")}
            else {
                if (k == t) {
                    for (i in 0..((list.size)/2 - 1)) {
                        if (list.get(i) > (list.get(list.size-1-i))) {
                            list.removeAt(list.size-1-i)
                            list.add(list.size-i, list.get(i))
                            if (index == -1) {index = i}
                        }
                        if (list.get(i) < (list.get(list.size-1-i))) {
                            list.removeAt(i)
                            list.add(i, list.get(list.size-1-i))
                            if (index == -1) {index = i}
                        }
                    }

                }
                else {
                    if (k > t) {
                        for (i in 0..((list.size)/2 - 1)) {
                            if (list.get(i) > (list.get(list.size-1-i))) {
                                list.removeAt(list.size-1-i)
                                list.add(list.size-i, list.get(i))
                                if (index == -1) {index = i}
                            }
                            if (list.get(i) < (list.get(list.size-1-i))) {
                                list.removeAt(i)
                                list.add(i, list.get(list.size-1-i))
                                if (index == -1) {index = i}
                            }
                        }
                        p = k - t
                        if (p % 2 == 1) {
                            list.removeAt(index)
                            list.add(index, '9')
                            list.removeAt(list.size -1 - index)
                            list.add(list.size - index, '9')
                            p--
                        }
                        if ((p % 2 == 0) && (p > 0)) {
                            g = 0
                            while ((p > 0) && (g <= list.size/2 - 1)) {
                                if (list.get(g) != '9') {
                                    p = p - 2
                                    list.removeAt(g)
                                    list.add(g, '9')
                                    list.removeAt(list.size -1 - g)
                                    list.add(list.size - g, '9')
                                }
                                g++
                            }
                        }
                        if ((p > 0) && (list.size % 2 == 1)) {
                            list.removeAt(list.size/2)
                            list.add(list.size/2, '9')
                        }
                    }
                }
            }
        var st = ""
        for (i in 0..list.size - 1) {
            st += list.get(i)
        }
        return st
    }
}


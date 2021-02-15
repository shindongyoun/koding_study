package programmers.day1

import java.util.*

fun solution7(priorities: IntArray, location: Int): Int {
    val que = LinkedList<Pair<Int, Int>>()
    priorities.forEachIndexed { index, i ->
        que.offer(Pair(index, i))
    }
    var count = 0
    while (que.isNotEmpty()) {
        val firstValue = que.poll()

        if (que.filter { it.second > firstValue.second }.count() > 0) {
            que.offer(firstValue)
        } else {
            count++
            if (firstValue.first == location) return count
        }
    }
    return 0
}
package study.programmers.practice

fun solution_역순(s: String): String =
    String(s.toCharArray().sortedArrayDescending())


fun main(args: Array<String>) {
    print(solution_역순("Zbcdefg"))
}
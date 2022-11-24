fun main() {
    val str = "AB"
    toPermute(str, "").forEach {
        println(it)
    }
}

fun toPermute(s: String, answer: String): MutableList<String> {
    val list = mutableListOf<String>()
    return permute(s, answer, list)
}

fun permute(s: String, answer: String, list: MutableList<String>): MutableList<String> {
    if (s.isEmpty()) {
        list.add(answer)
        return list
    }

    for (i in s.indices) {
        val ch = s[i]
        val leftSub = s.substring(0, i)
        val rightSub = s.substring(i + 1)
        val rest = leftSub + rightSub
        permute(rest, answer + ch, list)
    }

    return list
}

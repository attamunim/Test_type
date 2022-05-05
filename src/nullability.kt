fun main() {
    var name: String = "munim"
    //  name = null

    var names: String? = "Do i really exist?"
    // names = null

    // null check
    var length = 0
    if (names != null) {
        length = names.length
    } else {
        length = -1
    }
    println(length)

    val l = if (names != null) names.length else -1
// second method safe call operator
    println(names?.length)

    // third method is Elvis operator
    val len = names?.length ?: -1
    val noname = names ?: "no onw knows me..."

    println(noname)

    // !! null exception

    println(names!!.length)




}

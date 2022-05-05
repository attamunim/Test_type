fun main() {
    val vehiclenumber = mapOf("mybike" to "2445", "azhar's bike" to "5521")


    val vehicles = hashMapOf("mybike" to "2445", "azhar's bike" to "5521", "car" to "4455")

    for( numbers in vehiclenumber)
    {
        println("name:: $numbers")
    }

    for ((key, value )in vehicles)
    {
        println("$key  number is $value")
    }
    var x = 10
    while (x>0)
    {
        println(x)
        x--
    }
    var z = 0
    while (z<10)
    {
        println(z)
        z++
    }
}
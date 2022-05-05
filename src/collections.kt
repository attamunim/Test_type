fun main() {

    // list is a collection of ordered values
    val players = listOf("afridi", " shahidh ali", "mustufa","jibran", "babar") // immutable list of arrays
    println(players)
    println(players.sorted())
    println(players[2])
    println(players.last())
    println(players.contains("babar"))
    println(players.contains("lukaa"))

    val playerss = arrayListOf("shahid ali","shamoon ismail", "abdullah", "fiaz")
    println(players)
    playerss.add("jugnu")
    println(playerss[3])
    playerss.add(0,"chachaa")
    println(playerss)
    println( playerss.indexOf("chachaa"))
    playerss.remove("jugnu")
    println(playerss)

    // map is a collection of un ordered key value pairs

    //immutable
    val vehiclenumber = mapOf("mybike" to "2445", "azhar's bike" to "5521")
    println(vehiclenumber["mybike"])
    println(vehiclenumber.get("azhar's bike"))
    println(vehiclenumber.getOrDefault("pridors", "this vehicle is not available in map"))
    println(vehiclenumber.values)

    val vehicles = hashMapOf("mybike" to "2445", "azhar's bike" to "5521", "car" to "4455")
    vehicles["car"]= "7878"
    println(vehicles)
    vehicles.put("rikshaw", "3221")
    println(vehicles)
    vehicles.remove("car")
    println(vehicles)
   println(vehicles.isEmpty())


}
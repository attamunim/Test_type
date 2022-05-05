fun main() {
    fun forceChoke()
    {
        println("you have failed me for the last time man....")
    }
    forceChoke()

    // keep in mind that all the functions works in the main function so do not call that in out of the main function

    fun inputline(line:String)
    {
        println(line)
    }
        inputline("i have nothing to do with it , it was your wish so go and tackle it yourself.")
    fun goodGuyscalculate(rebels: Int, ewoks : Int) :Int // int is the return type we use
    {
        val goodguys = rebels + ewoks
        return goodguys
    }
    val rebels = goodGuyscalculate(5 , 7)
    println("darth vaders faced off against $rebels rebel scum.")
    // we can use more direct method to do this
    println("darth vaders faced off against ${goodGuyscalculate(5,7)} rebel scum.")
    // $ sign indicates the string template we use{} inside it to calculate any thing or call a function

    //default values of the function are passeed by
    fun felling(mood:String = "angry"){
        println(mood)
    }
    felling()
    // we can override the default value by
    felling("happy")
}
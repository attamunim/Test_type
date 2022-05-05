fun main()
{
    val a = 75
    val b = 75
    if (a==b)
    {
        println("a is equal to b")
    }
    if (a<b)
    {
        println("a is smaller than b")
    }
    else if(a<= b) {
        println("a is smaller or equal to b")
        }

    val name= "jordan"
    val istrue= true
    if (name=="jordian") {
        println(istrue)
    }
    else {
        println(false)
    }

    val x = 323
    when(x)
    {
        1 -> println("x is not equal to 1")
        32 -> println("x is equal to 32")
        else -> println("x is not 32 not 1")

    }
    val isHungary = false
    val isBored = true
    if( isHungary || isBored)
    {
        println("lets eat something")
    }
        fun felling(mood:String= "angry"){
            if (mood== "angry"){
                println("lets run to the hills as the mood is $mood")

            } else{
                println("otherwise stay home ")
            }
        }
    felling()
    }

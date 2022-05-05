class Car(val make: String, val model:String, var color:String)
{
    fun accelerate()
    {

        println("vroooom vrooom")
    }
    fun details()
    {
        println("this is a $color $make $model")
    }

    }

class  Truck(val make:String, val model:String, val towingCapacity:Int){
    fun  tow()
    {
        println("truck is taking horses to the rodeos")
    }
    fun details()
    {
        println("the $make $model has a towing capacity of $towingCapacity lb")
    }
}

fun main() {
        val car = Car("toyota", "vaioieem", "Red")
    println(car.make)
    println(car.model)
    car.accelerate()
car.details()
    val truck= Truck("ford", "f-150", 10000)
    println(truck.make)
    println(truck.model)
    println(truck.towingCapacity)
    truck.tow()
    truck.details()
val k:Int = 0
    if ( k==1)
    {
        
    }
}
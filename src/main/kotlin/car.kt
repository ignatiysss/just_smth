import kotlin.random.Random

open class car(
    nameOfBrand: String = "Toyota",
    nameOfModel: String = "Corolla",
    color: Int = 1
) {
    init {
        println("You create car, name of brand: $nameOfBrand, name of model $nameOfModel, color: $color")
    }

}


object function {
    fun randomMax() = Random.nextInt(150, 250)

}

class toyota(nameOfModel: String = "Corolla"): car("Toyota", nameOfModel, color = 1) {
	private val maxSpeed: Int
        get() {
            println("Enter the max speed (Enter for random)")
            val temporary = readln()
            return if (temporary.isEmpty()) function.randomMax() else temporary.toInt()
        }

    init {
		println("init block worked")
        println("Max speed $maxSpeed")
    }
}
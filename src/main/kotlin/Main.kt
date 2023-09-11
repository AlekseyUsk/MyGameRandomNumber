import kotlin.math.PI
fun main() {

    val squareCabin = SquareCabin(6,50.5)
    val roundHut = RoundHut(4, 10.0)
    val roundTower = RoundTower(5,15.5)

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")

        with(roundHut) {
            println("\nRound Hut\n=========")
            println("Material: ${buildingMaterial}")
            println("Capacity: ${capacity}")
            println("Has room? ${hasRoom()}")
            println("Floor area: ${floorArea()}")}

        with(roundTower) {
            println("\nRound Hut\n=========")
            println("Material: ${buildingMaterial}")
            println("Capacity: ${capacity}")
            println("Has room? ${hasRoom()}")
            println("Floor area: ${floorArea()}")}
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val capacity: Int
    abstract val buildingMaterial: String

    fun hasRoom(): Boolean {
        return residents < capacity
    }
    abstract fun floorArea(): Double
}

class SquareCabin(residents: Int,val length : Double) : Dwelling(residents) {
    override val capacity: Int = 6
    override val buildingMaterial: String = "WOOD"
    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int,val radius: Double) : Dwelling(residents) {
    override val capacity: Int = 4
    override val buildingMaterial: String = "железо"
    override fun floorArea(): Double {
        return PI * radius * radius
    }
}

class RoundTower(residents: Int,radius: Double, val floors: Int = 2) : RoundHut(residents,radius) {
    override val capacity: Int = 4 * floors
    override val buildingMaterial: String = "камень"
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}
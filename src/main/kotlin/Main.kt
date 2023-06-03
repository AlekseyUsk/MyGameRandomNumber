fun main() {
    val user1 = Dice("Гриха")
    val user2 = Dice("Леха")
    val user3 = Dice("Саня")
    println("${user1.name} БРОШЕН КУБИК ЦВЕТОМ - ${user1.randomColor} С КОЛЛИЧЕСТВОМ ПОЛЕЙ - ${user1.range}")
    println("${user2.name} КУБИК ЦВЕТОМ - ${user2.randomColor} С КОЛЛИЧЕСТВОМ ПОЛЕЙ - ${user2.range}")
    println("${user3.name} КУБИК ЦВЕТОМ - ${user3.randomColor} С КОЛЛИЧЕСТВОМ ПОЛЕЙ - ${user3.range}")

    val listUsers = listOf<Dice>(user1, user2, user3)

    val start: Coin = Coin()
    start.game(listUsers)
}

class Dice(val name: String) {
    val colors = arrayListOf("красный/", "синий/", "зеленый/", "белый/", "черный/")
    var randomColor = colors.random()
    val range = (1..20).random()
}

class Coin() {
    private var number = 0
    private var name = ""
    fun game(list: List<Dice>) {
        for (i in 0..list.size) {
            val item = list[i]
            number = item.range
            name = item.name
            val resultGame = (1..number).random()
            if (resultGame == item.range) {
                println("ИГРОК ${name} ПОЗДРАВЛЯЮ ЧИСЛА СОВПАЛИ!!! ВЫИГРАЛ! число было = ${resultGame}")
            }
        }
    }
}
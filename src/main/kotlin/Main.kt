import kotlin.math.PI

fun main() {

    val arr = arrayOf(1, 2, 3, 4, 5)
    arr.swap(0, 4)

//  println(arr) и так как будет просто хеш код на 1 общ элемент так как в классе Array нет метода toString
//  а нам надо все эл глянуть массива
//  этот массив надо отдельно пробежать fun расширения

    println(arr.print())  // и вот мы поменяли при пом fun  расширения 0 и 4 эл местами 5 и 1 цифра
}

fun <T> Array<T>.swap(i1: Int, i2: Int) {
    val el1 = this[i1]  //мы через this обращаемся к элементу массива у которого будет вызван метод swap
    val el2 = this[i2]

    this[i1] = el2
    this[i2] = el1
}

//фун расширения чтобы глянуть у каждого элемента в массиве данные без нее будет один общий хешкод на массив
fun <T> Array<T>.print() {
    for (i in this) {  // перебераем некие обьекты i которые находятся внутримассива куда мы применим эту fun расширения
        println(i)
    }
}
// ТАКОЙ СПОСОБ ПОДСТРОИТЬ СВОИ fun расширения ДЛЯ РАБОТЫ С ЛЮБЫМИ ТИПАМИ ДАННЫХ (для String необязательно)
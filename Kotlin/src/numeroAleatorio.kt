import kotlin.random.Random

fun main(){
    var pares = 0
    var impares = 0

    repeat(10){
        val number = Random.nextInt(1,51)
        println("Número: $number")

        if (number % 2 == 0){
            pares++
        } else {
            impares++
        }
    }
    println("Total de números pares: $pares")
    println("Total de números ímpares: $impares")

}
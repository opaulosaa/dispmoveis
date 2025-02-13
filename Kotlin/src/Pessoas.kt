class Pessoa(val name: String, val age: Int, val work: String) {
    fun info(){
        println("Nome: $name, idade: $age, profissão: $work")
    }
}

fun main(){
    val pessoa1 = Pessoa("Neymar", 32, "jogador")
    val pessoa2 = Pessoa("Roger Federer", 43, "tenista")
    val pessoa3 = Pessoa("Narak", 34, "professor")

    pessoa1.info()
    pessoa2.info()
    pessoa3.info()
}
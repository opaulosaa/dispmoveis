import java.util.Scanner

class Produto(val nome: String, var preco: Double, var estoque: Int) {
    fun info() {
        println("Produto: $nome, Preço: R$ %.2f, Estoque: $estoque".format(preco))
    }

    fun mudarPreco(novoPreco: Double) {
        if (preco > 0) {
            preco = novoPreco
            println("Preço atualizado")
        }
    }

    fun mudarQntd(novaQntd: Int) {
        if (estoque >= 0) {
            estoque = novaQntd
            println("Estoque atualizado")
        }
    }
}

fun main() {
    val input = Scanner(System.`in`)

    val produtos = mutableListOf(
        Produto("Talbet", 2000.00, 20),
        Produto("Notebook", 4500.00, 15),
        Produto("Mouse", 250.00, 40)
    )

    var opcao = 0


    while (opcao != 4) {
        println("---------MENU--------")
        println("1. Exibir produtos")
        println("2. Atualizar preço")
        println("3. Atualizar quantidade em estoque")
        println("4. Sair")
        println("Escolha uma opção: ")
        opcao = input.nextInt()

        when (opcao) {
            1 -> {
                println("Lista de Produtos:")
                var i = 0
                while (i < produtos.size) {
                    produtos[i].info()
                    i++
                }
            }

            2 -> {
                println("Atualizar Preço")
                var i = 0
                while (i < produtos.size) {
                    println("$i - ${produtos[i].nome}")
                    i++
                }
                print("Escolha o número do produto: ")
                val index = input.nextInt()

                if (index >= 0 && index < produtos.size) {
                    print("Digite o novo preço: ")
                    val novoPreco = input.nextDouble()
                    produtos[index].mudarPreco(novoPreco)
                } else {
                    println("Produto inválido!")
                }
            }

            3 -> {
                println("Atualizar Quantidade")
                var i = 0
                while (i < produtos.size) {
                    println("$i - ${produtos[i].nome}")
                    i++
                }
                print("Escolha o número do produto: ")
                val index = input.nextInt()

                if (index >= 0 && index < produtos.size) {
                    print("Digite a nova quantidade em estoque: ")
                    val novaQuantidade = input.nextInt()
                    produtos[index].mudarQntd(novaQuantidade)
                } else {
                    println("Produto inválido!")
                }
            }

            4 -> println("Saindo do programa...")

            else -> println("Opção inválida, tente novamente!")
        }
    }


}

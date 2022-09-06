package storeclasscorrigido


/*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch*/

fun main() {


    try {

        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o endereço: ")
        val end = readln()

        print("Digite seu telefone: ")
        val tel = readln()

        val cliente = ListaCompraClass(nome, end, tel)

        while (true){

            println()
            println("***Menu***")
            println("1 - Adicionar compra")
            println("2 - Remover compra")
            println("3 - Listar compras")
            println("4 - Sair")

            print("Opc: ")
            val opc = readln().toInt()
            println()

            when(opc){

                1 -> {
                    print("Digite o produto que deseja adicionar: ")
                    val prod = readln()
                    cliente.addCompra(prod)
                }
                2 -> {
                    print("Digite o produto que deseja remover: ")
                    val prod = readln()
                    cliente.removeCompra(prod)
                }
                3 -> {
                    cliente.exibirCompras()
                }
                4 -> break
                else -> println("Opção Inválida")

            }

        }

    }catch (e: Exception){
        println(e.message)
    }

}
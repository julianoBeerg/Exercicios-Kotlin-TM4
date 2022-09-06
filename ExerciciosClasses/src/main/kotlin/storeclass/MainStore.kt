package storeclass

/*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/


fun main(){

    print("Digite seu nome: ")
    var nomeDigitado = readln()

    print("Digite seu CPF: ")
    var cpf = readln()

    print("Digite seu RG: ")
    var rg = readln()

    var cliente = ClienteClass(nomeDigitado, cpf, rg)


    while (true) {
        println()
        println("================CENTRAL DE ARMAZENAMENTO====================")
        println()
        println("***************DIGITE O NUMERO DA OPÇÃO DESEJADA***************")

        println("1- Adicionar Mercadorias")
        println("2- Remover Mercadorias")
        println("3- Renomear Mercadorias")
        println("4- Ver Mercadorias No Estoque")
        println("5- Fechar")

        print("Digite uma das opções: ")
        when (readln().toInt()){

            1->{
                println("0 - Voltar para o Menu Principal ")
                println("Qual o produto que será adicionado: ")
                val produto = readln()
                addMercadorias(produto)
            }
            2-> removeMecadorias()
            3-> atualizaMercadorias()
            4-> exibirMercadorias()
            5-> break
            else  -> println("Opção inválida")
        }

        }

    }

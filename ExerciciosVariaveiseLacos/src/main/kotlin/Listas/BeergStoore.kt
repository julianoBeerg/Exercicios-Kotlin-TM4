package Listas

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
        */
var estoque = mutableListOf<String>("Arroz","Feijão","Macarão","Oleo","Cebola", "Massa de Tomate")
fun main(){
while (true){


    println("================CENTRAL DE ARMAZENAMENTO====================")
    println()
    println("**DIGITE O NUMERO DA OPÇÃO DESEJADA**")
    println()
    println("1- Adicionar Mercadoria")
    println("2- Remover Mercadoria")
    println("3- Renomear Mercadoria")
    println("4- Ver Mercadorias No Estoque")
    println("5- Retornar ao Menu")
    println("6-Fechar")
    println()

    print("Digite uma opção ")
    when (readln()){
        "1"->{
            println("Qual o PRODUTO sera adicionado: ")
            val produto= readln()
            addMercadorias(produto)

        }
        "2"-> removeMecadorias()
        "3"-> atualizaMercadorias()
        "4" -> exibirMercadorias()
        "5"-> break
    else  -> println("Opção invalida")

    }



    }




    }
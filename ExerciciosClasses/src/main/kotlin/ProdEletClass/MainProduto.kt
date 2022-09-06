package ProdEletClass

var produto = ProdutoClass("" ,"", "", true, true)

fun main(){

    println("0 - Cadastra Aparelho")
    println("1 - Mostrar Aparelho")
    println("2 - Trocar bateria")
    println("3 - Trocar tela")
    println("4 - Atualizar estado")
    println("5 - Retornar ao menu")
    print("Digite oque você deseja fazer: ")

    when(readln()){
        "0" -> produto.cadastraProduto()
        "1" -> produto.mostrarAparelho()
        "2" -> produto.trocaBateria()
        "3" -> produto.trocaTela()
        "4" -> produto.atualizaEstado()
        "5" -> return main()
        else -> println("Opção Inválida")
    }

}
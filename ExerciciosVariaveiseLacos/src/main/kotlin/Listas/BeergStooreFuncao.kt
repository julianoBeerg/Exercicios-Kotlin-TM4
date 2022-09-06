package Listas

fun  addMercadorias(produto:String){
    while (true)

        if (produto!= ""){
            estoque.add(produto)
            println("produto $produto adicionado com secesso!")
        }else{
            println("Produto invalido!")
        }
}
fun removeMecadorias() {
    while (true) {
        println("Qual Produto sera excluido? ")
        val produtoexc = readln()
        if (estoque.contains(produtoexc)) {
            estoque.remove(produtoexc)
            println("Produto $produtoexc excluido co secesso!")
            break
        } else {
            println("O produto $produtoexc não existe")
            println(estoque)

        }


    }
}

fun atualizaMercadorias(){

    println("Qual Produto sera atualizado? ")
    val produtoatt = readln()
    if (estoque.contains(produtoatt)){
        val posicao = estoque.indexOf(produtoatt)
        println("Qual o novo nome do produto? ")
        estoque[posicao] = readln()
        println("Produto $produtoatt atualizado com secesso!")

    }

    else {
        println("O produto $produtoatt não existe")

    }


}

fun exibirMercadorias(){
    println()
    print(estoque)
}
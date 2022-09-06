package ListasStore

fun  addMercadorias(produto:String){
    while (true)
        if (produto!= ""){
            estoque.add(produto)
            println("Produto $produto adicionado com secesso!")
        }else{
            println("Produto inválido!")
        }
}

fun removeMecadorias() {
    while (true) {
        println("0 - Voltar para o Menu Principal ")
        println()
        println("Qual Produto sera excluido? ")
        val produtoExc = readln()
            if (estoque.contains(produtoExc)) {
                estoque.remove(produtoExc)
                println("Produto $produtoExc excluido com sucesso!")
                break
            }else if(produtoExc == "0"){
                return main()
            }else {
                println("O produto $produtoExc não existe")
                println(estoque)
            }
    }
}

fun atualizaMercadorias(){
    println("0 - Voltar para o Menu Principal ")
    println()
    println("Qual Produto sera atualizado? ")
    val produtoAtt = readln()
        if (estoque.contains(produtoAtt)){
            val posicao = estoque.indexOf(produtoAtt)
            println("Qual o novo nome do produto? ")
            estoque[posicao] = readln()
            println("Produto $produtoAtt atualizado com sucesso!")
        }else if(produtoAtt == "0"){
            return main()
        }else {
            println("O produto $produtoAtt não existe")
        }
}

fun exibirMercadorias(){
    println("0- Voltar para o Menu Principal ")
    println()
    print(estoque)
}
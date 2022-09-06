package storeclass

private var _estoque = mutableListOf<String>()//A lista declarada como privada
var estoqueTest: List<String> = _estoque//A variavel estoqueTest, pegando os atributos

   fun  addMercadorias(produto:String){
        while (true)
            if (produto!= ""){
                _estoque.add(produto)
                println("Produto $produto adicionado com secesso!")
                break
            }else{
                println("Produto inválido!")
            }
    }

    fun removeMecadorias() {
        while (true) {
            println("0 - Voltar para o Menu Principal ")
            println(_estoque)
            println()
            println("Qual Produto sera excluido? ")
            val produtoExc = readln()
            if (_estoque.contains(produtoExc)) {
                _estoque.remove(produtoExc)
                println("Produto $produtoExc excluido com sucesso!")
                break
            }else if(produtoExc == "0"){
                return main()
            }else {
                println("O produto $produtoExc não existe")
                println(_estoque)
            }
        }
    }

    fun atualizaMercadorias(){
        println("0 - Voltar para o Menu Principal ")
        println()
        println("Qual Produto sera atualizado? ")
        val produtoAtt = readln()
        if (_estoque.contains(produtoAtt)){
            val posicao = _estoque.indexOf(produtoAtt)
            println("Qual o novo nome do produto? ")
            _estoque[posicao] = readln()
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
        print(_estoque)
    }


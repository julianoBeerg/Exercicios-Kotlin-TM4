package storeclasscorrigido

class ListaCompraClass(
    var nome: String,
    var endereco: String,
    var telefone: String
){

    private val listaCompras = mutableListOf<String>()
    val listaComprasTest: List<String> = listaCompras

    init {
        checarDados()
    }

    fun addCompra(compra: String){
        if(compra.isNotBlank()){
            listaCompras.add(compra)
            println("Produto adicionado com sucesso!")
        }else{
            println("Produto Inválido")
        }
    }

    fun removeCompra(compra: String){
        if(listaCompras.contains(compra)){
            listaCompras.remove(compra)
            println("Produto removido com sucesso!")
        }else{
            println("O produto $compra não existe na lista!")
        }
    }

    fun exibirCompras(){
        println("***Lista de Compras***\n")
        listaCompras.forEach {
            println(it)
        }
    }

    private fun checarDados(){
        if(nome.isBlank()){
            throw Exception("Cadastro feito de maneira incorreta!")
        }
    }

}
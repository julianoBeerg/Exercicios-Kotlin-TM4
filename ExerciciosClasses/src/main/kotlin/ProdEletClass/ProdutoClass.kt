package ProdEletClass

class ProdutoClass(
    var modelo: String,
    var marca: String,
    var estado: String
) {

    var tela: Boolean = false
    var bateria: Boolean = false

    constructor(
        modelo: String,
        marca: String,
        estado: String,
        tela: Boolean,
        bateria: Boolean
    ) : this(modelo, marca, estado) {
        this.tela = tela
        this.bateria = bateria
    }

    fun cadastraProduto(){
        print("Digite o modelo do aparelho: ")
        modelo = readln()

        print("Digite a marca do aparelho: ")
        marca = readln()

        print("Digite o estado do aparelho: ")
        estado = readln()

        print("A tela está quebrada? 1 - Sim ou 2 - Não ")
        var estadotela = readln().toInt()
            if (estadotela == 1){
                tela = true
                }else{
                tela = false}

        print("A está defasada? 1 - Sim ou 2 - Não ")
        var estadobateria = readln().toInt()
        bateria = estadotela == 1

        return mostrarAparelho()
}

    fun atualizaEstado(){
        println("Digite o novo estado do aparelho? ")
        val estadoAtt = readln()
        println("O estado $estado atualizado com sucesso!")
        estado = estadoAtt
        println("O novo estado é: $estado")
    }

    fun mostrarAparelho(){
        println(modelo)
        println(marca)
        println(estado)
        if (tela == true){
            println("A tela está quebrada!")
        }else{
            println("A tela está boa!")
        }
        if (bateria == true){
            println("A bateria está defasada!")
        }else{
            println("A bateria está boa!")
        }
    }

    fun trocaBateria(){
        if (bateria == true){
            println("Deseja trocar a tela: ")
            var trocaTela = readln()
                if (trocaTela == "sim"){
                bateria == false
                println("Troca de tela efetuada com sucesso ! ")
        }
        }else{

        }
        return mostrarAparelho()
    }
    fun trocaTela(){
        if (tela == true){
            println("Deseja trocar a tela: ")
            var trocaTela = readln()
            if (trocaTela == "sim"){
                tela == false
                println("Troca de tela efetuada com sucesso ! ")
            }
        }else{
            println("SUa tela continua Quebrada")
        }
        mostrarAparelho()
    }
}
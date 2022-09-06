package storeclass

class ClienteClass(

    var nome: String,
    cpf: String,
    rg: String
) {
    //lateinit
    lateinit var apelido: String
    var cnpj = 0

    constructor(
        nome: String,
        cpf: String,
        rg: String,
        apelido: String,
        cnpj: Int
    ): this( nome, cpf, rg){
        this.apelido = apelido
        this.cnpj = cnpj
    }
    fun atualizanome(){
        println("Digite o novo nome? ")
        val nomeAtt = readln()
        println("O $nome atualizado com sucesso!")
        nome = nomeAtt
        println("O novo nome é: $nome")
    }

}
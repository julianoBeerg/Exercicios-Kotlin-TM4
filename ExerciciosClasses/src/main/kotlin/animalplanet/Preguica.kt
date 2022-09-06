package animalplanet

class Preguica (
    nome: String,
    idade: Int,
    espVida: Int,
    val habitat: String
) : Animal(nome, idade, espVida) {

    override fun emitirSom() {
        println("O som que ele emite é: aaaaaah, aaaarh")
    }
    override fun locomocao() {
        println("Como ele se locomove: o bixo preuiça sobe em arvores")
    }
    fun dorme(){
        println("Oque ele faz: o bixo precuiça dorme")
    }

    override fun exibirDados() {
        println("O nome do bixo preguiça é: $nome\n" +
                "A idade do bixo preguiça é: $idade\n" +
                "A expectativa de vida dele é: $espVida\n" +
                "A habitat do bixo preguiça é: $habitat\n")
                fazSom()
                emitirSom()
                locomocao()
                dorme()
    }
}
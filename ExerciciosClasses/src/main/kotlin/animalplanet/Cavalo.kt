package animalplanet

class Cavalo (
    nome: String,
    idade: Int,
    espVida: Int,
    val tipo: String
) : Animal(nome, idade, espVida) {

    override fun emitirSom() {
        println("O som que ele emite é:: iiirrrrí, rilinchin")
    }
    override fun locomocao() {
        println("Como ele se locomove: o cavalo galopa")
    }

    fun abanarRabo(){
        println("Oque ele faz: o cavalo abana o rabo e a crina")
    }

    override fun exibirDados() {
        println("O nome do cavalo é: $nome\n" +
                "A idade do cavalo é: $idade\n" +
                "A expectativa de vida dele é: $espVida\n" +
                "O tipo do cavalo é: $tipo\n")
                fazSom()
                emitirSom()
                locomocao()
                abanarRabo()

    }
}
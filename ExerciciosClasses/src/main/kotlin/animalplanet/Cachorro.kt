package animalplanet

class Cachorro(
    nome: String,
    idade: Int,
    espVida: Int,
    val raca: String
) : Animal(nome, idade, espVida) {

    override fun emitirSom() {
        println("O som que ele emite é:: Auau")
    }
    override fun locomocao() {
        println("Como ele se locomove: O cachorro corre")
    }
    fun abanarRabo(){
        println("Oque ele faz: o cachorro abana o rabo")
    }

    override fun exibirDados() {
        println("O nome do cachorro é: $nome\n" +
                "A idade do cachorro é: $idade\n" +
                "A expectativa de vida dele é: $espVida\n" +
                "A raça do cachorro é: $raca\n")
                fazSom()
                emitirSom()
                locomocao()
               abanarRabo()
            }
}
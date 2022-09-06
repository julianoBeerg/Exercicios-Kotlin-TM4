package animalplanet

abstract class Animal (
    val nome: String,
    val idade: Int,
    val espVida: Int
        ) {

        open fun fazSom(){
            println("Esse animal Faz som")
        }

        abstract fun emitirSom()

        abstract fun locomocao()

        abstract fun exibirDados()


}
package animalplanet

fun main(){

    val cachorro = Cachorro("Snoop", 6, 15, "Vira-Lata")

    val cavalo = Cavalo("Pé de pano", 20, 30, "Cavalo do pica-pau")

    val preguica = Preguica("Sid", 3, 12, "Selva")

        println("1 - Cachorro")
        println("2 - Cavalo")
        println("3 - Bixo preguiça")
        print("Escolha qual dos animais você quer ver: ")
        when (readln().toInt()) {
            1 -> cachorro.exibirDados()
            2 -> cavalo.exibirDados()
            3 -> preguica.exibirDados()
            else -> println("Opção Inválida")

        }

}
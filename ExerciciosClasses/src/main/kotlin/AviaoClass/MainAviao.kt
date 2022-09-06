package AviaoClass

fun main(){

    print("Digite o modelo do avião: ")
    val modelo = readln()

    print("Digite o nome do avião: ")
    val nome = readln()

    print("Digite se o avião já saiu: ")
    val verifica = readln().toBoolean()

    val aviao1 = AviaoClass(modelo, nome, verifica)

    print(aviao1.modelo)
    println(aviao1.nome)
    println(aviao1.aviao)

    aviao1.decolarAviao()
}
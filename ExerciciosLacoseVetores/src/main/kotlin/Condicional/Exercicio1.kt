import java.util.*

fun main () {

    val limite: Double = 50.0 //double=real
    val multa: Double = 4.0
    var sub: Double

    var valor: Double

    var leitor = Scanner(System.`in`)

    print("Digite o peso total dos tomates: ")
    var peso: Int = leitor.nextInt()

    //if=se
    if (peso > 50 ){
        sub = (peso-limite)
        valor = (multa*sub)
        println("Você passou do peso estabelecido em: $sub" + "Kg")
        println("Você passou do peso estabelecido em:" + "$sub" + "Kg")
        println("Total da Multa: R$$valor")
    }else{//else=senao
        print("Você esta abaixo do peso estabelecido pelo governo, não é necessario pagar multa")
    }

}


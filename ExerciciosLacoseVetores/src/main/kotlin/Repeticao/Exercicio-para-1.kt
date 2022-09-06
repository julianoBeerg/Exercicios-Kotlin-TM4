package Repeticao

fun main(){

    var sal: Double = 0.0
    var salMedia: Double = 0.0
    var filhosMedia: Double = 0.0
    var salMaior: Double = 0.0
    var porcent: Double = 0.0
    var filhos: Int = 0
    var hab: Int = 20

    for(i in 0 until 20){
        print("Pessoa ${i+1}, qual o seu salário: ")
        sal = readln()!!.toDouble()
        if (salMaior <= sal){
            salMaior = sal
        }
        if (sal < 100){
            porcent++
        }
        salMedia +=sal

        print("Pessoa ${i+1}, quantos filhos você tem: ")
        filhos = readln()!!.toInt()
        filhosMedia += filhos
    }
    println()
    println("--------------------------------")
    println("A média Salarial do município é: ${salMedia/hab}")
    println("A média de filhos do município é: ${filhosMedia/hab}")
    println("O maior salário é: ${salMaior}")
    println("Pessoas que recebem menos de R$100,00: $porcent")
    println("Porcentagem: ${((hab-porcent)/hab)*100}")
}
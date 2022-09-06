package Repeticao

fun main(){

    var num: Double = 0.0
    var cont: Double = 0.0
    var soma: Double = 0.0

    while (num>=0){
        print("Digite um número positivo: ")
        num = readln()!!.toDouble()
        soma += num
        cont ++
    }
    println()
    soma -= num
    cont --
    println("Total somatório: $soma")
    println("Total de valores lidos: $cont")
    print("Média dos valores: ${soma/cont}")
}
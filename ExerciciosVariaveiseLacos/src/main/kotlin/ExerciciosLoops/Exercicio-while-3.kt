package ExerciciosLoops

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

fun main() {

    var menor21 = 0
    var maior50 = 0
    var idade = 0

    while (idade != -99) { //vai dar certo, mas dái esse while fica inútil
        print("Digite sua idade: ")
        idade = readln().toInt()
        if (idade <= 21) {
            menor21++
        } else if (idade >= 50) {
            maior50++
        }
    }
    println("Total de pessoas com menos de 21 anos: $menor21")
    println("Total de pessoas com mais de 50 anos: $maior50")
}

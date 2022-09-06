package ExerciciosLoops

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
fun main(){

    var soma = 0
    do {
        print("Digite uma idade maior que zero: ")
        var num = readln().toInt()
        soma +=num
    }while (num != 0)
    println("A soma das idades digitadas é: $soma")
}
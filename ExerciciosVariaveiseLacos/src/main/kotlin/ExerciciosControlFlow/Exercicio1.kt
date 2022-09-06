package ExerciciosControlFlow

//Faça um programa que receba três inteiros e diga qual deles é o maior.

fun main(){

    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    println()

    if (num1 > num2 && num1 > num3){
        println("O primeiro número digitado foi o maior")
    }else if (num2 > num1 && num2 > num3){
        println("O segundo número digitado foi o maior")
    }else if (num3 > num1 && num3 > num2){
        println("O terceiro número digitado foi o maior")
    }

}
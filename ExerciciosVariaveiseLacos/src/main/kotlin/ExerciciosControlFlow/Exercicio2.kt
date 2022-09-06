package ExerciciosControlFlow

//Faça um programa que entre com três números e coloque em ordem crescente.

fun main(){

    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    println()

    /* if (num1 > num2 && num1 > num3 && num2 > num3){
        println("Números em ordem crescente: $num1, $num2, $num3")
    }else if (num1 > num2 && num1 > num3 && num3 > num2){
        println("Números em ordem crescente: $num1, $num3, $num2")
    }else if (num2 > num1 && num2 > num3 && num1 > num3){
        println("Números em ordem crescente: $num2, $num1, $num3")
    }else if (num1 > num2 && num1 > num3 && num2 > num3){
        println("Números em ordem crescente: $num2, $num3, $num1")
    }else if (num3 > num1 && num3 > num2 && num1 > num2){
        println("Números em ordem crescente: $num3, $num1, $num2")
    }else if (num3 > num1 && num3 > num2 && num2 > num1){
        println("Números em ordem crescente: $num3, $num2, $num1")
    }*///Codígo que eu fiz esta grande

    //Código reduzido professor Henrique
    if(num1 <= num2 && num2 <= num3){
        println("$num1 - $num2 - $num3")
    }else if (num1 <= num3 && num3 <= num2) {
        println("$num1 - $num3 - $num2")
    }else if (num2 <= num1 && num1 <= num3) {
        println("$num2 - $num1 - $num3")
    }else if (num2 <= num3 && num3 <= num1) {
        println("$num2 - $num3 - $num1")
    }else if (num3 <= num1 && num1 <= num2) {
        println("$num3 - $num1 - $num2")
    }else{
        println("$num3 - $num2 - $num1")
    }
}
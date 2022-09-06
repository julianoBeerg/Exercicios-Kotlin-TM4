package ExerciciosLoops

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

fun main(){

    var cont = 0
    var soma = 0


    do {
        print("Digite um número inteiro: ")
        var num = readln().toInt()
            if(num%3 == 0){
                cont++
                soma += num
            }

    }while (num > 0)

    println("$cont números múltiplos de três foram digitados")
    println("$soma é a soma dos números múltiplos de três digitados")
    println("A média dos números múltiplos de 3 digitados é: ${soma/cont}")
}
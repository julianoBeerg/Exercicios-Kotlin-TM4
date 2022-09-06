package funcoes

//1º Método
fun main(){
    print("Digite seu nome: ")
    val nome = readln()
    var num1: Int =0
    var num2: Int =0

    println("=========================================================")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Raiz")
    println("6 - Quadrado")
    print("$nome, Digite uma das opções acima para calcular dois números: ")
    var opc = readln().toInt()


    if (opc == 0 || opc == 1 || opc == 3 || opc == 4){
        print("$nome, Digite o primeiro número: ")
        num1 = readln().toInt()

        println()

        print("$nome, Digite o segundo número: ")
        num2 = readln().toInt()

    }else if(opc == 5 || opc == 6){
        print("$nome, Digite o primeiro número: ")
        num1 = readln().toInt()
    }else
        println("Opção Inválida")

    calculos(opc,num1, num2)
}

//2º Método
//fun calculo() {
//    print("Digite um número: ")
//    var num1 = readln().toDouble()
//
//    print("Digite outro número: ")
//    var num2 = readln().toDouble()
//
//    println("Qual o tipo de operação?\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Ao Quadrado\n6-Raiz Quadrada")
//    var op = readln().toInt()
//    menu(op = op, n1 = num1, n2 = num2)
//}











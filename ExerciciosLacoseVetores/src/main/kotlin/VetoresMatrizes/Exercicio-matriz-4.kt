//inteiro num [3][3], lin=0, col=0, somaTotal=0, somaDiagonal=0

//para (lin;lin<3;lin++){
//    escreva("Digite um número: ")
//    leia (num[col][lin])
//    somaTotal += num[col][lin]
//}
//col ++
//para (lin=0;lin<3;lin++){
//    escreva("Digite um número: ")
//    leia (num[col][lin])
//    somaTotal += num[col][lin]
//}
//col ++
//para (lin=0;lin<3;lin++){
//    escreva("Digite um número: ")
//    leia (num[col][lin])
//    somaTotal += num[col][lin]
//}
//limpa()
//somaDiagonal += num[0][0] + num[1][1] + num[2][2]
//escreva ("A soma total dos vetores é: ", somaTotal)
//escreva ("\nA soma total dos vetores da primera diagonal é: ", somaDiagonal)

fun main(){

    var num = Array(3) {Array(3){0;1;2}}
    var soma :Int=0
    //val soma = num.sumOf { it. }()

    for (i in 0 .. 2){
        print("Digite um número: ")
        num[i][0] = readln()!!.toInt()
        soma += num[i][0]
    }
    for (i in 0 .. 2){
        print("Digite um número: ")
        num[i][1] = readln()!!.toInt()
        soma += num[i][1]
    }
    for (i in 0 .. 2){
        print("Digite um número: ")
        num[i][2] = readln()!!.toInt()
        soma += num[i][2]
    }
    var somaDia: Int = 0
    somaDia = num[0][0] + num[1][1] + num[2][2]
    println("A soma total dos números é $soma")
    println("A soma total dos vetores da primera diagonal é: $somaDia")
}
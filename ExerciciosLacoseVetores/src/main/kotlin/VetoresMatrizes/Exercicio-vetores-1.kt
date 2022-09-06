import java.util.*
fun main() {
    var num = IntArray(5) //Criando uma lista com nome num de 5 espaços
    //val leitor = Scanner(System.`in`) //Inicando o Scanner
    var maior: Int = 0 //Iniciando o maior número

    //for (i in 0 until 5) {//i = faz uma contagem de 0 ate 4 (until <5)
    for (i in 0 .. 4) {//i = faz uma contagem de 0 ate 4 (.. <=4)
        print("Insira um número: ")

        num[i] = readln()!!.toInt()
        //num[i] = leitor.nextInt() //num que é a lista com i que é a contagem lista[posição]                                 
        if(num[i] > maior){//coparação se o valor de num é maior que o antigo
            maior = num[i]
        }
    }
    for (i in 0 until 5) {
        println (num[i])//imprimindo todos os valores dos vetores
    }
    println()
    println("O maior número digitado foi: $maior")//imprimindo o maior número
}

import java.util.*

fun main(){

    val leitor = Scanner(System.`in`)
    print("Digite um número: ")

    var num:Int = leitor.nextInt()
    println(num)

    //while=enquanto
    while (num < 100){
        num = num*3

        println(num)
    }
}
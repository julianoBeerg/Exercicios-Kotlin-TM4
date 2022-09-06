package Repeticao

fun main(){

    var num:Int
    var soma:Int = 0
    var cont:Int = 0

    print("Digite um número: ")
    num = readln()!!.toInt()

    do {
        cont ++
        soma += cont
    }while (cont < num)
    println(num)
    println(cont)
    println(soma)
}
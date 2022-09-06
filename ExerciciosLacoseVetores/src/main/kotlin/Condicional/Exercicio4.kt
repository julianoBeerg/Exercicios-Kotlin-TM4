fun main(){

    var num: Int

    print("Digite um número: ")
    num = readln()!!.toInt()

    if (num%2 == 0){
        println("O número $num é par")
    }else{
        println("O número $num é impar")
    }
}

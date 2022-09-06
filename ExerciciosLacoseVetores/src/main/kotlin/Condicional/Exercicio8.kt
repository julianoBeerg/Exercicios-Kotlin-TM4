fun main(){

    var num: Int

    print("Digite um número: ")
    num = readln()!!.toInt()

    if(num > 100){
        println("O número digitado foi: $num")
    }else{
        println("O número digitado é abaixo de 100")
    }
}
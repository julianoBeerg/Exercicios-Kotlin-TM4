fun main(){

    var base: Double
    var altura: Double

    print("Escreva a largura da base: ")
    base = readln()!!.toDouble()

    print("Escreva a altura: ")
    altura = readln()!!.toDouble()

    if(base >= 0 && altura >=0){
        println("O cálculo da area do triângulo é ${(base*altura)/2}")
    }else{
        println("Não é possível realizar o cálculo com esses números, tente novamente")
    }
}
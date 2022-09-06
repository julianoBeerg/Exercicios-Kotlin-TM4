fun main(){

    var num = IntArray(5)
    var soma = IntArray(5)
    for(i in 0..4){
        print("Digite um número: ")
        num[i] = readln()!!.toInt()
        soma[i] = num[i] * num[i]
    }
    if (soma[3] > 1000){
        println("O quadrado do terceiro número é ${soma[3]}")
    }else{
        println("O quadrado do primeiro número é ${soma[1]}")
        println("O quadrado do segundo número é ${soma[2]}")
        println("O quadrado do terceiro número é ${soma[3]}")
        println("O quadrado do quarto número é ${soma[4]}")
    }
}
fun main(){

    var idade: Int

    print("Escreva sua idade: ")
    idade = readln()!!.toInt()

    if (idade >= 5 && idade <=7){
        println("Você está na turma infantil A")
    }else if (idade >= 8 && idade <= 11){
        println("Você está na turma infantil B")
    }else if (idade >= 12 && idade <= 13){
        println("Você está na turma juvenil A")
    }
    else if (idade >= 14 && idade <= 17){
        println("Você está na turma juvenil B")
    }else if (idade >= 18){
        println("Você está na turma adulta")
    }else{
        println("Você não tem idade para participar das turmas")
    }
}
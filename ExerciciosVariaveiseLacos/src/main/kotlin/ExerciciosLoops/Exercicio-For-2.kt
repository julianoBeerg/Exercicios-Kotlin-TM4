package ExerciciosLoops

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
fun main(){

    var contPar = 0
    var contImpar = 0

    for (n in 1..10){
        print("Digite o ${n}º número: ")
        var num = readln().toInt()

        if(num%2 == 0){
            contPar++
        }else{
            contImpar ++
        }
    }
    println("$contPar números pares foram digitados")
    println("$contImpar números ímpares foram digitados")
}
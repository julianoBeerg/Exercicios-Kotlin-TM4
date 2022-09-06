package praticando

fun main(){

    var contDia = 0
    print("Digite seu nome: ")
    val nome = readln()

    print("$nome, Digite sua idade: ")
    val idade = readln().toInt()

    print("Você ja fez aniversário esse ano: ")
    val valIdade = readln()

    print("$nome, digite o mês que você nasceu: ")
    val mes = readln().toInt()

    print("$nome, digite o dia que você nasceu: ")
    val dia = readln().toInt()

    for (i in mes..12){
        mes == 0
        mes+1
    }
    contDia = (idade*365) +(mes*30) +dia

    if (valIdade == "Sim" || valIdade == "sim" ) {
        println("Você nasceu dia $dia de $mes de ${2022 - idade}")
        print(contDia)
    }else{
        idade -1
        println("Você nasceu dia $dia de $mes de ${2022 - idade}")
        print(contDia)
    }
}
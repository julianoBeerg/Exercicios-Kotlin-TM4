fun main(){

    var codigo: Int //= 12345
    var numHoras: Double
    var horasSem: Double = 50.0
    var valorHora: Double = 10.0
    var valorHoraExtra: Double = 20.0

    print("Digite seu código de funcionário: ")
    codigo = readln()!!.toInt()

    if(codigo == 12345){
        println()
        println("Acesso Permitido !")
        println("----------------------------------------")
        print("Digite a quantidade de horas trabalhadas: ")
        numHoras = readln()!!.toDouble()

            if(numHoras < horasSem){
               println("Valor das horas trabalhadas ${numHoras*valorHora}")
            }else{
                println("Valor fez ${numHoras-horasSem} horas extras esse mês")
                println()
                println("Valor do pagamento R$ ${(numHoras-horasSem)*valorHoraExtra}")
                println("Valor total R$ ${(horasSem*valorHora) + ((numHoras-horasSem)*valorHoraExtra)}")
            }
    }else{
        println("Acesso Negado")
    }
}
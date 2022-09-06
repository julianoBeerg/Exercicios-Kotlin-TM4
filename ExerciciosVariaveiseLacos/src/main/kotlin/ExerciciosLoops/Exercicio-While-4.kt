package ExerciciosLoops

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;*/

fun main(){

    var cont = 0
    var pessoaCalma: Int = 0
    var homemAgressivo: Int = 0
    var mulherNervosa: Int = 0
    var outrosCalmos: Int = 0
    var nervosoMais40: Int = 0
    var calmoMenor18: Int = 0

    println("Olá cidadão, bem vindo ao profile people")
    println ("=========================================")

    println()
    println()

    while(cont <= 5){

        print("Para começar digite seu nome: ")
        var nome = readln().toString()

        print("$nome digite sua idade: ")
        var idade = readln().toInt()

        println()

        println("1 - Sexo Masculino")
        println("2 - Sexo Feminino")
        println("3 - Outro")
        print("$nome, Digite uma das opções acima para informar seu sexo: ")
        var sexo = readln().toInt()

        println()

        println("1 - Pessoa calma")
        println("2 - Pessoa Nervosa")
        println("3 - Pessoa Agressiva")
        print("$nome, Digite acima como você se considera: ")
        var pessoa = readln().toInt()

        if(pessoa == 1){
             pessoaCalma ++
             if(sexo==3){outrosCalmos++}
             if(idade < 18){calmoMenor18++}
        }else if (pessoa == 2){
            if(sexo == 2 ){mulherNervosa ++}
            if(idade > 40){nervosoMais40++}
        }else if (pessoa == 3){
            if (sexo == 1){homemAgressivo ++}}

    println()
    println()
    cont++
    }

    println()
    println("Número de pessoas calmas: $pessoaCalma")
    println("Número de mulheres nervosas: $mulherNervosa")
    println("Número de homens agressivos: $homemAgressivo")
    println("Número de outros calmos: $outrosCalmos")
    println("Número de nervosos com mais de 40 anos: $nervosoMais40")
    println("Número de calmos com menos de 18 anos: $calmoMenor18")
    println()
    println("Obrigado por participar !")
}

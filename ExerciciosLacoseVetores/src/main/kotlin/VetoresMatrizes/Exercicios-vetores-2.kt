fun main(){
    var lance = IntArray(10)
    var media: Double = 0.0
    var maior: Int = 0
    var recorde: Int = 0

    for(i in 0..9){
        print("Escreva a pontuação: ")
        lance[i] = readln()!!.toInt()
        media += lance[i]

        if (lance[i] > maior){
            maior = lance[i]
            recorde ++
        }
    }
    println("Média de pontos: ${media/10}")
    println("Maior Pontuação: $maior")
    println("O recorde foi batido por $recorde vezes")
}
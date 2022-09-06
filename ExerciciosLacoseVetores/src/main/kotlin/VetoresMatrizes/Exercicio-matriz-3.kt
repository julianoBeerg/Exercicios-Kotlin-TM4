package VetoresMatrizes

fun main(){

    var n1: IntArray = intArrayOf(4, 6)//Declarando um vetor int com dois valores ja definidos
    var n2: IntArray = intArrayOf(4, 6)
    var m1: IntArray = intArrayOf(0, 1)
    var m2: IntArray = intArrayOf(0, 1)


    m1[0] = n1[0] + n2[0]
    m1[1] = n1[1] + n2[1]
    m2[0] = n1[0] - n2[1]
    m2[1] = n1[1] - n2[0]
    println("${m1[0]}, ${m1[1]}")
    println("${m2[0]}, ${m2[1]}")
}
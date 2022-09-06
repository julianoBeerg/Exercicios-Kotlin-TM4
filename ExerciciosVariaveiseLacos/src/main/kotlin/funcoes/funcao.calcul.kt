package funcoes

import kotlin.math.pow
import kotlin.math.sqrt

//1º Metodo
fun calculos( opcCalc: Int, n1: Int, n2:Int ): Any {

     return when (opcCalc) {
         1 -> {
             println("A soma dos números digitados é: ${n1 + n2}")
         }2 -> {
             println("A subtração dos números digitados é: ${n1 - n2}")
         }3 -> {
             println("A multiplicação dos números digitados é: ${n1 * n2}")
         }4 -> {
             println("A divisão dos números digitados é: ${n1 / n2}")
         }5 -> {
             println("A raiz quadrada de $n1 é: ${sqrt(n1.toDouble())}")
         }6 -> {
             println("O quadrado de $n1 é: ${n1.toDouble().pow(2)}")
         }
         else -> {
             return 0
         }
     }
}

//2º Metodo
//fun menu (op: Int, n1:Double, n2:Double) {
//    return if (op == 1) {
//        println("A soma dos números digitados é: ${n1 + n2}")
//    } else if (op == 2) {
//        println("A subtração dos números digitados é: ${n1 - n2}")
//    } else if(op == 3){
//        println("A multiplicação dos números digitados é: ${n1 * n2}")
//    } else if(op == 4){
//        println("A divisão dos números digitados é: ${n1 / n2}")
//    } else if(op == 5){
//        println("O quadrado de $n1 é: ${n1.pow(2)} e de $n2 é: ${n2.pow(2)}")
//    } else {
//        println("A raiz quadrada de $n1 é: ${sqrt(n1)} e de $n2 é: ${sqrt(n2)}")
//    }
//}
import java.time.LocalDateTime
import kotlin.math.pow

fun main(){

    val pi: Double = 3.14

    print("Digite o diâmetro do círculo: ")
    val diam = readln().toDouble()

    val raio = diam / 2

    println("O perímetro do círculo é: ${2 * pi * raio} ")
    println("O perímetro do círculo é: ${2 * Math.PI * raio} ")

    println()

    //format - padrão.format(numero)

    println("A area do círculo é: ${pi * (raio * raio)}")//forma manual
    println("A area do círculo é: ${"%.2f".format(pi * (raio * raio))}")//número formatado
    println("A area do círculo é: ${Math.PI * Math.pow(raio, 2.0)}")//pow calcula o numero elevado
    println("A area do círculo é: ${Math.PI * (raio.pow(2))}")
}
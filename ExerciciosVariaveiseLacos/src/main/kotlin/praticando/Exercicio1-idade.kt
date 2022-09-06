import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){


    print("Digite sua idade: ")
    val idade = readln().toInt()


    val data = LocalDateTime.now()
    val data2 = LocalDate.now().year
    val ano = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY"))//Formatando a data para aparecer só ano



    println("Você ano de ${data.year - idade}")
    println(data2)
    println(ano)

}

package ExerciciosLoops

/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/
//fun main(){
//
//    var cont: Int = 0
//
//    for(i in 1000..1999){
//
//        if(i%11 == 5){
//            cont ++
//        }
//
//    }
//    print("No total $cont números dividos por 11 tem resto = 5")
//}
fun main() {

    var num: Int

    for (i in 1..100) {

        if (i%3 == 0) {
            println("fizz")
            if (i % 3 == 0 && i % 5 == 0) {
                println("fizzBuzz")
            }

        } else if (i % 5 == 0) {
            println("buzz")

        }else{
            println(i)
        }

    }
}

package Repeticao

fun main(){

    var num: Int = 233

    do {
        num +=3
        println(num)
        if (num >= 300 && num <=400){
            num+=5
            num -=3
        }

    }while (num < 456)
}
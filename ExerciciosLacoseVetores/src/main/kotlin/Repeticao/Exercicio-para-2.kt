fun main(){

    var soma: Int = 0

    //para=for
    for(i in 3..500 step 3){//step adiciona 3 ao valor inicial
            if(i %2== 1){
                println(i)
                soma += i
            }
    }
    print(soma)
}
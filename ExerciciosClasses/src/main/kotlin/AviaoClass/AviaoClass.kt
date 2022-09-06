package AviaoClass

class AviaoClass(
    var modelo: String,
    var nome: String,
    var aviao: Boolean,
    ) {

    fun decolarAviao() {
        if (aviao){
            println("O avião já decolou")
        }else{
            println("O avião ainda não saiu")

    }
    }

}
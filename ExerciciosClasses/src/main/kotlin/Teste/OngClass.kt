package Teste

class OngClass (

    var login: String,
    var senha: Int,

    ) {

    fun verificaLogin(testaLogin: String = "Ong", testasenha: Int = 123) {
        print("Digite seu Login: ")
        var testaLogin = readln()

        print("Digite Sua Senha: ")
        var testasenha = readln().toInt()

        var acesso = OngClass(testaLogin, testasenha)
             while (true){
                if (testaLogin == login && testasenha == senha) {
                    println("Acesso Concedido ! ")
                    break
                }else {
                    println("Acesso Negado ! ")
                    return main()
                }
            }
        }
    }


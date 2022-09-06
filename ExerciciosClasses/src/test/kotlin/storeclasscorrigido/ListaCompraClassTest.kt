package storeclasscorrigido

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ListaCompraClassTest {

    val cliente = ListaCompraClass(
        "Juliano",
        "Rua irrriii",
        "9999999"
    )

    @BeforeEach//Vai adicionar a lista antes de rodar qualquer teste
    fun addCompraTest() {
        cliente.addCompra("Arroz")
        cliente.addCompra("Feijão")
        cliente.addCompra("Café")
        cliente.addCompra("Macarrão")
        cliente.addCompra("")//Produto inválido, pois não pode ser criando em branco

        assertEquals(4, cliente.listaComprasTest.size)//Comparando se o Tamanho da lista é igual a expectativa
        assertEquals(0, cliente.listaComprasTest.indexOf("Arroz"))//Comparando se a posição 0 da lista é Arroz
    }

    @Test
    fun removeCompraTest(){
        assertEquals(3, cliente.listaComprasTest.indexOf("Macarrão"))//Verificando se na terceira posição tem macarrão
        cliente.removeCompra("Macarrão")//Removendo macarrão
        assertEquals(3, cliente.listaComprasTest.size)
        assertSame(cliente.listaComprasTest[1], "Feijão")//Verificando se a posição 1 do vetor tem "Feijão"
    }

}
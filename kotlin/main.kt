fun main() {
    println("Bem-Vinde ao ByteBank")    //println = printe e pule linha//
    //var titular = "Crhis""     val não pode mudar o valor, para criar variavel se usa o var//

    // testaComportamentos()

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.0
    )

    println("nome: ${alex.nome}")
    println("bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        123
    )


}

fun testaComportamentos() {
    val contaAlex = Conta("Alex", 1000)
    contaAlex.titular = "Alex"
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.titular = "Fran"
    contaFran.deposita(300.0)


    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do alex0")
    contaAlex.deposita(40.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando da conta da Fran")
    contaFran.saca(400.0)
    println(contaFran.saldo)

    println("Transferencia para o ALex")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }
}

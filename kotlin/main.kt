fun main() {
    println("Bem-Vinde ao ByteBank")    //println = printe e pule linha//
    //var titular = "Crhis""     val não pode mudar o valor, para criar variavel se usa o var//

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
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

    if (contaFran.transfere(100.0 ,contaAlex)){
        println("Transferencia sucedida")
    } else{
        println("Falha na transferencia")
    }


}


class Conta() {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        if (valor > 0){
        this.saldo += valor}
    }

    fun saca(valor: Double){
        if (saldo >= valor) {
            saldo -= valor
        }else {
            println("Você não tem saldo suficiente para realizar este saque!")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
            return false
    }



}


fun testaLacos() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Seu saldo atual é POSITIVO")
    } else if (saldo == 0.0) {
        println("A conta é neutra")
    } else {
        println("A conta está NEGATIVA")
    }

    //OU USAR O WHEN//

    when {
        saldo > 0.0 -> println("Seu saldo atual é POSITIVO")
        saldo == 0.0 -> println("A conta é neutra")
        else -> println("A conta está NEGATIVA")
    }


    //cria 5 contas
    for (i in 1..5) {
        //...
    }

//cria 5 contas na ordem decrescente
    for (i in 5 downTo 1) {
        //...
    }

//cria 3 contas de 2 em 2
    for (i in 1..5 step 2) {
        //...
    }
}}
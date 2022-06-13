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
}
open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double
        get(){
            println("bonificacao funcionario")
            return salario * 0.3
        }

}
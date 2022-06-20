abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double
        get() {
            return 0.0
        }

}
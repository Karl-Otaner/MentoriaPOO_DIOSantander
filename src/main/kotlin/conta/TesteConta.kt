package conta

fun main() {
    val conta = ContaPoupanca(123, "001")
    println("saldo: ${conta.getSaldo()}")
    conta.Depositar(50.0)
    println("saldo: ${conta.getSaldo()}")
    println(" taxa: ${conta.taxa()}")

    val contaCorrente = ContaCorrente(321, "002")
    contaCorrente.Depositar(10.0)
    println("${contaCorrente.taxa()}")
}
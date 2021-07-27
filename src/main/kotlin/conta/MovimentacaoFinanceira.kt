package conta

interface MovimentacaoFinanceira {
    fun Sacar(valor: Double)

    fun Depositar(valor: Double)

    fun Transferir(ContaBancariaDestino: Conta, valor: Double)
}
package conta

abstract class Conta (  val numero: Int,
                        open val agencia: String,
                        ) : MovimentacaoFinanceira {
    private var _saldo: Double = 0.0

    abstract fun taxa(): Double

    private fun temSaldo(valor: Double) : Boolean{
        return (_saldo >= valor)
    }

    open fun getSaldo(): Double{
        return _saldo
    }

    override fun Sacar(valor: Double) {
        if (temSaldo(valor)) {
            _saldo -= valor
            println("Saque -> Valor: $valor")
        } else{
            println("Saque -> Não há saldo suficiente!")
        }
    }

    override fun Depositar(valor: Double) {
        if (valor > 0){
            _saldo += valor
            println("Deposito -> Valor: $valor")
        } else{
            println("Deposito -> Informe um valor válido para depósito!")
        }

    }

    override fun Transferir(ContaBancariaDestino: Conta, valor: Double) {
        if (temSaldo(valor)){
            _saldo -= valor
            println("Saque -> Valor: $valor")
        } else{
            println("Saque -> Não há saldo suficiente!")
        }
    }

/*
    override fun Depositar(valor: Double) {
        TODO("Not yet implemented")
    }

    fun saldo(): Double{
        return _saldo
    }

    */
}
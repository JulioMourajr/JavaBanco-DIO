public class ContaTerminal {
    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public Float Saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, Float saldo) {
        Numero = numero;
        Agencia = agencia;
        NomeCliente = nomeCliente;
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + NomeCliente + ", obrigado por criar um conta em nosso banco, sua agencia é " + Agencia + " e seu saldo " +
                Saldo + " R$ já está disponível para saque.";
    }
}


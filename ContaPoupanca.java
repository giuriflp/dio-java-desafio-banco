public class ContaPoupanca extends Conta{
    private double taxa = 10d;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }



    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia= " + agencia +
                ", numero= " + numero +
                ", saldo= " + saldo +
                ", cliente= " + cliente.getNome() +
                '}';
    }
}

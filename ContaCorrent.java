public class ContaCorrent extends Conta {
    private final double TAXA = 20d;


    public ContaCorrent(Cliente cliente) {
        super(cliente);
    }


    @Override
    public String toString() {
        return "ContaCorrent{" +
                "agencia= " + agencia +
                ", numero= " + numero +
                ", saldo= " + saldo +
                ", cliente= " + cliente.getNome() +
                '}';
    }
}

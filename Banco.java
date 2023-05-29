import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contasLis;

    public Banco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{ " +
                "nome=' " + nome + '\'' +
                ", contasList= " + contasLis +
                '}';
    }

    public List<Conta> getContasLis() {
        return contasLis;
    }

    public void setContasLis(List<Conta> contasLis) {
        this.contasLis = contasLis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

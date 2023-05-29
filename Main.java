import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco b1 = new Banco("Banco Y");
        Cliente c1 = new Cliente("Lala");
        Cliente c2 = new Cliente("Bebe");
        Cliente c3 = new Cliente("Cici");

        Conta cc = new ContaCorrent(c1);
        Conta cp = new ContaPoupanca(c2);
        Conta cc2 = new ContaCorrent(c3);

        b1.setContasLis(Arrays.asList(cc, cp, cc2));
        cc.depositar(100);
        cc.transferir(cp, 50);
        cc2.depositar(2456d);

        System.out.println(cc.toString());
        System.out.println(cp.toString());
        System.out.println(cc2.toString());


        System.out.println(b1.toString());
    }
}
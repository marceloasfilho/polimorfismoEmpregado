package application;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Program {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Alex", 50, 20.00);
        EmpregadoTerceirizado empregado2 = new EmpregadoTerceirizado("Bob", 100, 15.00, 200.00);
        Empregado empregado3 = new Empregado("Maria", 60, 20.00);

        System.out.println("PAYMENTS:");
        System.out.println(empregado1.getNome() + ": " + empregado1.pagamento());
        System.out.println(empregado2.getNome() + ": " + empregado2.pagamento());
        System.out.println(empregado3.getNome() + ": " + empregado3.pagamento());
    }
}

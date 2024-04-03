package kao;

public class Main {
    public static void main(String[] args) {
    	 Cliente cliente1 = new Cliente("Joaozin gameplays", 1000, 500);
         System.out.println("Saldo + Limite: " + cliente1.checarSaldo());
         cliente1.sacar(1500);
         System.out.println("Saldo + Limite: " + cliente1.checarSaldo());
         cliente1.depositar(200);
         System.out.println("Saldo + Limite: " + cliente1.checarSaldo());
    }
}

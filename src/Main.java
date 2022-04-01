
public class Main {
    public static void  main(String[] args){
        Cliente marcoAntonio = new Cliente();
        marcoAntonio.setNome("Marco Antonio");

        Conta cc = new ContaCorrente(marcoAntonio);
        Conta poupanca = new ContaPoupanca(marcoAntonio);

        cc.depositar(850);                      //inserir valor para depositar na cc
        cc.transferir(75, poupanca);            //inserir valor para transferir p/ poupanca

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
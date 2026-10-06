public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular,double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Depósito realizado : R$"+ valor);
    }

    public void sacar(double valor){
        if(valor<=saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        }else{
            System.out.println("Não foi possivel realizar a operação. Saldo Insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular :" +titular);
        System.out.println("Saldo : R$"+saldo);
    }
    public static void main(String[] args) {
       ContaBancaria contaBancaria = new ContaBancaria("Natália",1000);
       contaBancaria.exibirSaldo();
       contaBancaria.depositar(500);
       contaBancaria.sacar(100);
       contaBancaria.exibirSaldo();
       contaBancaria.sacar(1550);
    }
}

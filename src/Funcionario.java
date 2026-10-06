public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
        return salario*0.10;
    }

    static class Gerente extends Funcionario{
        public Gerente(String nome,double salario){
            super(nome,salario);
        }
        @Override
        public double calcularBonus(){
            return salario*0.20;
        }
    }

    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Pedro",2000);
        Funcionario gerente = new Gerente("Juliana",5000);

        System.out.println("Funcionário :"+funcionario.nome);
        System.out.println("Bônus :"+funcionario.calcularBonus());

        System.out.println("Gerente :"+gerente.nome);
        System.out.println("Bônus :"+gerente.calcularBonus());
    }
}


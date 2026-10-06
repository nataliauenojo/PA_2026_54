public class Veiculo {
    public void mover(){
        System.out.println("O veiculo está se movendo rapidamente");
    }
    static class Carro extends Veiculo{
        @Override
        public void mover(){
            System.out.println("O carro está se movendo rapidamente");
        }
    }
    static class Bicicleta extends Veiculo{
        @Override
        public void mover(){
            System.out.println("O bicicleta está se movendo rapidamente");
        }
    }
    public static void main(String[] args){
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}

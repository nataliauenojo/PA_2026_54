public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public static void main(String[] args){
        Produto produto = new Produto();
        produto.setNome("Parafuso");
        produto.setPreco(2.5);

        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preco: "+produto.getPreco());

    }
}

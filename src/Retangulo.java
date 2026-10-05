public class Retangulo {
    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.largura = 5;
        r.altura = 2;
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Largura: " + r.largura);
        System.out.println("Altura: " + r.altura);
    }
}

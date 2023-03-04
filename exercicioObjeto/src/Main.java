public class Main {
    public static void main(String[] args){
        Retangulo rt = new Retangulo(10, 15);
        rt.calcularArea();
        rt.calcularPerimetro();

        System.out.println("Area:" + rt.calcularArea());
        System.out.println("Perimetro:" + rt.calcularPerimetro());

    }

}
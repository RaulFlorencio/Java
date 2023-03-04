public class Retangulo {
    private int altura , base;

    public Retangulo(int altura, int base){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(){
        altura = 1;
        base = 1;
    }

    public int calcularArea(){
        int area;
        area = base*altura;
        return area;
    }
    public  int calcularPerimetro(){
        int perimetro;
        perimetro = altura*2 + base*2;
        return perimetro;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura < 1 || altura >20){
            this.altura = altura;
        }
        else System.out.println("A altura não esta entre 1 e 20");

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base < 1 || base >20){
            this.base = base;
        }
        else System.out.println("A base não esta entre 1 e 20");
    }
}

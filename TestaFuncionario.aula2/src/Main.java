public class Main {
    public static void main(String[] args) {

        Gerentes g1 = new Gerentes("Raul",100,"Raul123","1234");
        Secretarias s1 = new Secretarias("Amanda", 1500, 642);
        Telefonistas t1 = new Telefonistas("Ian Leite", 20,777);

        System.out.println(g1);
        System.out.println(s1);
        System.out.println(t1   );
    }
}
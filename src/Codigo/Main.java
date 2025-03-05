package Codigo;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Apple", "iPhone1");

        iphone.exibirInfo();
        iphone.tocar();
        iphone.ligar("40028922");
        iphone.exibirPagina("https://www.exemplo.com");
    }
}


public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Parquer";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        // c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Vermelha";
        c2.ponta = 0.9f;
        // c2.tampar();
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}

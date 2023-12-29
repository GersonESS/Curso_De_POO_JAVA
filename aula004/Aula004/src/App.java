
public class App 
{
    public static void main(String[] args) 
    {
        Caneta c1 = new Caneta("Bic", "Amarelo", 0.4f );
        c1.setModelo("BIC cristal");
        c1.setPonta(0.5f);
        //c1.modelo = "BIC cristal";
        //c1.cor = "Azul";
        //c1.carga = 80;
        //c1.ponta = 0.5f;
        c1.status();
        /**
         * c1.rabiscar();
         * 
         * Caneta c2 = new Caneta();
         * c2.modelo = "BIC";
         * c2.cor = "Vermelha";
         * c2.ponta = 0.9f;
         * // c2.tampar();
         * c2.destampar();
         * c2.status();
         * c2.rabiscar();
         */
    }
}

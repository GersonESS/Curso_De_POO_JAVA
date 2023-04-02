
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO ! nao posso rabiscar");
        } else {
            System.out.println("Estou Rabiscano");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}

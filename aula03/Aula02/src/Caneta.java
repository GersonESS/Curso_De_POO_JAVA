
public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO ! nao posso rabiscar");
        } else {
            System.out.println("Estou Rabiscano");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}

public abstract class Eletromestico{
    private int voltagem;
    private String marca;
    private boolean ligado;

    public abstract String som();

    public Eletromestico(String marca){
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public String getMarca() {
        return marca;
    }
    public int getVoltagem() {
        return voltagem;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    @Override
    public String toString(){
        return "Marca: "+this.marca+". Voltagem: "+this.voltagem;
    }
}

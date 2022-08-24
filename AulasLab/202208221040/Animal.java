public abstract class Animal{
    private String raca;
    private double tamanho;
    
    public String getRaca() {
        return raca;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String toString(){
        return "Raça: "+this.getRaca()+". Tamanho: "+this.getTamanho();
    }

    public abstract String emitirSom();

}

public abstract class Imovel{
    private double area;
    private String localizacao;

    public abstract String tocaOQue();
    
    public Imovel(String localizacao){
        this.localizacao = localizacao;
    }
    public double getArea() {
        return area;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String toString() {
        return "Localizacao: "+localizacao;
    }

    public String definicao(){
        return "sou um imóvel";
    }
}

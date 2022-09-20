class Aviao {

    private int numPassageiros;
    private int numAssentos;
    private String modelo;
    private boolean ligado;
    private double altitude;

    public Aviao(String modelo){
        this.modelo = modelo;
        ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

    public boolean isLigado(){
        return ligado;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int qtde){
        if(qtde>0 && qtde<=numAssentos){
            numPassageiros = qtde;
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public double getAltitude() {
        return altitude;
    }
    public int getNumAssentos(){
        return numAssentos;
    }

    public void setNumAssentos(int qtde){
        if(qtde>=0)
            numAssentos = qtde;
    }


    void subir(double altura){
        altitude += altura;
    }

    void descer(double altura){
        altitude-= altura;
    }

    String comunicado(){
        return "Atenção passageiros.";
    }

}

import java.util.Set;

class Programa {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Cachorro");
        Animal gato = new Animal("Gato");
        Animal coelho = new Animal("coelhos");
        Zoologico zoo = new Zoologico();
        zoo.adicionaAnimal(cachorro);
        zoo.adicionaAnimal(gato);
        zoo.mostraAnimais();
    }
}

class Animal {

    private int qtdePatas;
    private String especie;
    private double peso;
    private boolean vivo;
    public Animal(){

    }
    public Animal(String especie){
        this.especie = especie;
        vivo = true;

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPatas() {
        return qtdePatas;
    }

    public void setPatas(int qtde) {
        if (qtde >= 0 && qtde < 1000)
            qtdePatas = qtde;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String estaVivo() {
        return vivo ? "SIM" : "NÃO";
    }

    public void morrer() {
        vivo = false;
    }

    String emitirSom() {
        return "xxxxxxx";
    }

    void comer(double qtde) {
        if (qtde > 0)
            peso += qtde;
    }

    void movimentar() {
        peso -= 0.01;
    }
}

class Zoologico{
    private String nome;
    private Animal[] animais = new Animal[50];
    int numAnimais=0;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adicionaAnimal(Animal x){
        animais[numAnimais++]=x;
    }
    public void mostraAnimais(){
        for(int i=0;i<numAnimais;i++){
            System.out.println(animais[i].getEspecie());
        }
    }


}
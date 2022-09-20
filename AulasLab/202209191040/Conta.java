import java.io.FileNotFoundException;

public class Conta{
    private String nome;
    private double saldo;
    private double limite;
    public double getLimite() {
        return limite;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void deposita(double valor){
        saldo+=valor;
    }
    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo+this.limite < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente," +  
                                            "tente um valor menor");
        } else {
            this.saldo-=valor;      
        }  
    }
}
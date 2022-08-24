public abstract class Conta{
    private int numero;
    protected double saldo;

    public abstract String mostraTipo();
    
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void saca(double valor){
        if(valor<=saldo && valor>=0)
            this.saldo-=valor;
    }
    public void deposita(double valor){
        this.saldo+=valor;
    }

    @Override
    public String toString() {
        return "Numero: "+this.numero+".Saldo: "+this.saldo;
    }

}

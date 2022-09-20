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
    public void saca(double valor) throws SaldoInsuficienteException {
        if(valor>=800){
            throw new SaldoInsuficienteException("Valor excede o limite diário para saque.");
        }
        else if (this.saldo+this.limite > valor) {
            this.saldo-=valor;      
        }else{
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
}

}
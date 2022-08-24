public class ContaCorrente extends Conta {
    private int qtdCheques;
    private double limite;
    public ContaCorrente(){
        this.limite=200;
    }
    public void setQtdCheques(int qtdCheques) {
        this.qtdCheques = qtdCheques;
    }
    public int getQtdCheques() {
        return qtdCheques;
    }

    @Override
    public void saca(double valor){
        if(valor<=(limite+saldo)){
            saldo-=valor;
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente"+super.toString()+" Limite: "+this.limite;
    }
    @Override
    public String mostraTipo() {
        // TODO Auto-generated method stub
        return "Corrente";
    }


}

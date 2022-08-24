public class ContaPoupanca extends Conta{
    private double rendimento;
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    public double getRendimento() {
        return rendimento;
    }

    @Override
    public String toString() {
        return "Conta Poupanca: "+super.toString();
    }
    @Override
    public String mostraTipo() {
        // TODO Auto-generated method stub
        return "Poupanca";
    }
}

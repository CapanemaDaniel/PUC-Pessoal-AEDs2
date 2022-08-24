public class Fogao extends Eletromestico{
    public Fogao(String marca) {
        super(marca);
        //TODO Auto-generated constructor stub
    }
    private int numBocas;
    public void setNumBocas(int numBocas) {
        this.numBocas = numBocas;
    }
    public int getNumBocas() {
        return numBocas;
    }
    @Override
    public String som() {
        
        return "tsiiiiitsiiii";
    }
}

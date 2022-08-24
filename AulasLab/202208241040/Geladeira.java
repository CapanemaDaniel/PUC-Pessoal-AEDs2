public class Geladeira extends Eletromestico{
    public Geladeira(String marca, double litros) {
        super(marca);
        this.litros = litros;
        
    }

    private double litros;
    
    public double getLitros() {
        return litros;
    }
    @Override
    public String getMarca(){
        return "Sou uma geladeira da marca: "+super.getMarca();
    }
    @Override
    public String som() {
        
        return "ssssss";
    }

}

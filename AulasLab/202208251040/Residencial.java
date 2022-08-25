public class Residencial extends Imovel{
    
    private int qtdeQuartos;

    public Residencial(String localizacao) {
        super(localizacao);
    }

    public int getQtdeQuartos() {
        return qtdeQuartos;
    }
    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    @Override
    public String definicao(){
        return super.definicao()+" residencial";
    }

    @Override
    public String tocaOQue() {
        // TODO Auto-generated method stub
        return "Rock";
    }
}

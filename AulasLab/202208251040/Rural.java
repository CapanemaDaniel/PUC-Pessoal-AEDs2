public class Rural extends Imovel{
    
    private int qtdeCurral;
    private String nome;

    public Rural(String localizacao) {
        super(localizacao);
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeCurral() {
        return qtdeCurral;
    }
    public void setQtdeCurral(int qtdeCurral) {
        this.qtdeCurral = qtdeCurral;
    }
    @Override
    public String definicao(){
        return super.definicao()+" rural";
    }

    @Override
    public String tocaOQue() {
       
        return "Sertanejo";
    }

    
}

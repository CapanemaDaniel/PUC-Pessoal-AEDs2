class Programa{
    public static void main(String[] args){
        Turma computacao = new Turma();
        Aluno fernando = new Aluno("Fernando");
        Aluno natalia = new Aluno("Natalia");
        Aluno marcos = new Aluno("Marcos");
        computacao.matricular(fernando);
        computacao.matricular(natalia);
        computacao.mostrarAlunos();
    }
}
class Aluno{
    private String nome;
    private int matricula;
    private double altura;
    private boolean matriculado;
    public Aluno(String nome, int matricula){
        this.nome=nome;
        this.matricula=matricula;
        matriculado = false;
    }
    public Aluno(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String valor){
        nome = valor;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        if(matricula>0)
            this.matricula=matricula;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura>0.2&&altura<2.5)
            this.altura = altura;
        else
            System.out.println("Altura incorreta.");
    }
    String reclamar(double valor){
        return "Minha nota está errada em "+valor+" pontos";
    }
}
class Turma{
    String sala;
    int andar;
    boolean ativa;
    double temperatura;
    Aluno[] aluno = new Aluno[50];
    int qtdeAlunos=0;

    public void matricular(Aluno aluno){
        this.aluno[qtdeAlunos++] = aluno;
    }

    public void mostrarAlunos(){
        for(int i=0;i<qtdeAlunos;i++){
            System.out.println(this.aluno[i].getNome());
        }
    }

    String situacao(){
        if(temperatura>25){
            return "quente";    
        }else{
            return "fria";
        }
    }
}

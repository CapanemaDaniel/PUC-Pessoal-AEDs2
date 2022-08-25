class Principal{
    //Proposta de Eduardo Lemos
    public static void main(String[] args){
        Imovel[] imoveis = new Imovel[3];
        imoveis[0] = new Rural("Passos");
        imoveis[1] = new Residencial("Par� de Minas");
        imoveis[2] = new Residencial("BH");

        /*for(int i=0;i<imoveis.length;i++){
            System.out.println(imoveis[i].tocaOQue());
        }*/

        for(Imovel i: imoveis){
            if(i instanceof Rural)
                System.out.println(((Rural)i).getQtdeCurral());
        }

        
    }
}
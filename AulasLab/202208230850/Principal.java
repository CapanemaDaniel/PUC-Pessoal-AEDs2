class Principal{
    public static void main(String[] args){
        
        Conta[] contas = new Conta[3];

        contas[0] = new ContaCorrente();
        contas[1] = new ContaPoupanca();
        contas[2] = new ContaCorrente();

        for(int i=0;i<contas.length;i++){
            if(contas[i] instanceof ContaPoupanca)
                System.out.println(((ContaPoupanca)contas[i]).getRendimento());
        }


    }
}
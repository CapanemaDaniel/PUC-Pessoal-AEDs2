class Principal{
    public static void main(String[] args){
        Eletromestico eletros[] = new Eletromestico[3];
        eletros[0] = new Geladeira("Eletrolux", 500);
        eletros[1] = new Fogao("Dako");
        eletros[2] = new Fogao("LG");

        for(Eletromestico i : eletros){
            if(i instanceof Geladeira)
                System.out.println(((Geladeira)i).getLitros());
        }



    }
}
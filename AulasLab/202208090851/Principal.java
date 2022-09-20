class Principal{
    public static void main(String[] args){
        Aviao boing = new Aviao("JetLex");
        Aviao tecoteco = new Aviao("Teco", 4);
        
        boing.setNumAssentos(-15);
      
        MyIO.print(boing.getNumAssentos());
        //boing.comunicado(); erro pois não imprimiu a string que retorna

        System.out.println(boing.comunicado());
    }
}
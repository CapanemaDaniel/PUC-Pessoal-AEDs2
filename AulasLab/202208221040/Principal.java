public class Principal {
    public static void main(String[] args){
        Animal[] zoo = new Animal[3];

        zoo[0] = new Leao();
        zoo[1] = new Gaviao();
        zoo[2] = new Leao();

        for(Animal i : zoo){
            System.out.println(i.emitirSom());
        }
        
        
    }
}

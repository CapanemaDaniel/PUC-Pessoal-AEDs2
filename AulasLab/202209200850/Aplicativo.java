
public class Aplicativo {

    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.deposita(100);

       
        
        try {
            cc.saca(30);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
       
        
    }

}

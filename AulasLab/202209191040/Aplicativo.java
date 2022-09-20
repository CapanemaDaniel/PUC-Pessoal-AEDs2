import java.io.FileNotFoundException;

public class Aplicativo {
    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.deposita(100);


        
         try {
            cc.saca(1000);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }
       

    }
  
    
}

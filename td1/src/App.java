import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        Personne new_dude =new Personne("Clement Mellier",new Date(100,10,28),"France",a,"Etudiant" );

        new_dude.read();
        



    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Veuillez rentrer les informations de 5 personnes\n  ");
        System.out.println("Format : Nom datedenaissance Pays num_secu_sociale Metier  ");

        List<Personne> list_personne = new ArrayList<Personne>();
        for(int i = 0;i<5;i++)
        {

            System.out.println("Personne numéro 1 : ");
            Scanner scan = new  Scanner(System.in);
            String user_input = scan.nextLine();
            String[] split_input = user_input.split(" ");

            Date date = new Date();

            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(split_input[1]);
            } catch (ParseException e) {}
            
            list_personne.add(new Personne(split_input[0], date, split_input[2], ,split_input[4]));

        }


        int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        Personne new_dude =new Personne("Clement Mellier",new Date(100,10,28),"France",a,"Etudiant" );

        new_dude.write();
        



    }
}

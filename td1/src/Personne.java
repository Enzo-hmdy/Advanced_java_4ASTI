import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Personne {
    String name;
    Date date;
    String country;
    int[] social_nbr = new int[13];
    String work;


    Personne(){


    }

    
    Personne(String name,Date date,String country,int[] social_nbr,String work)
    {
        this.name = name;
        this.date = date;
        this.country = country;
        this.social_nbr = social_nbr;
        this.work = work;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int[] getSocial_nbr() {
        return this.social_nbr;
    }

    public void setSocial_nbr(int[] social_nbr) {
        this.social_nbr = social_nbr;
    }

    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", date='" + getDate() + "'" +
            ", country='" + getCountry() + "'" +
            ", social_nbr='" + getSocial_nbr() + "'" +
            ", work='" + getWork() + "'" +
            "}";
    }

    public void read(){
        System.out.println("Que voulez vous savoir sur l'utilisateur ? \n 1-Nom \n 2-Date de naissance \n 3-Pays \n 4-Securité_sociale\n5-travail");
        Scanner s = new Scanner(System.in);
        switch(s.nextInt()){

            case 1 : 
                System.out.println(getName());
            
            case 2 : 
                System.out.println(getDate().toString());

            case 3 : 
                System.out.println(getCountry());

            case 4 : 
                System.out.println(getSocial_nbr().toString());

            case 5 : 
                System.out.println(getWork());
        }
        s.close();

    }

    public void write(){
        System.out.println("Que voulez vous modifier sur l'utilisateur ? \n 1-Nom \n 2-Date de naissance \n 3-Pays \n 4-Securité_sociale\n5-travail");
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        switch(s.nextInt()){

            case 1 : 
                System.out.println("Entrer un nouveau nom");
                this.setName(s2.nextLine());
                break;
            
            case 2 : 

                System.out.println("Entrer une nouvelle Date (format jj/mm/yyyy");
                String sDate1= s.nextLine();
            Date date;

            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
                this.setDate(date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
               
                break;

            case 3 : 
                System.out.println("Entrer un pays");
                this.country =(s.nextLine());
                break;

            case 4 : 
                int[] tmp = new int[13];
                for(int i = 0;i <=13;i++)
                {
                    System.out.println("Entrer le numéro " + i + " de sécurité sociale de l'utilisateur");
                    tmp[i] = s.nextInt();
                }
                this.setSocial_nbr(tmp);
                

            case 5 : 
                System.out.println("Entrer un pays");
                this.country = s.nextLine();
                break;

            default:
                System.out.println("Invalide Argument");
        }

        s.close();
    }

    




}


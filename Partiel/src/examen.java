import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class examen {
    
    // Remarque la grosse erreur je pense de mon examen est que le chef 2 reste "bloqué" devant le four
    // et n'exécute pas d'autre tache en même temps, il aurait fallut que je lance un autre thread_chef 2 en même temps
    // Mais mon implémentation n'est pas pertinentes avec le sujet proposé 
	public static void main(String[] args) throws InterruptedException {
        String liste_action[] = {"Slice_carrot",
        "cut_mushroom",
        "cut 2 oignons",
        "cook carots",
        "prepare sauce",
        "cut potatoes",
        "put chiken in oven "
        ,"add oignon to chiken"};  // Liste des actions 
        int temps[] = {3,2,4,5,2,5,10,15}; // Liste des temps 
        List<String> order_action = new ArrayList<String>(); // Array liste pour savoir l'ordre des actions 
	Thread chef1_action1 = new Thread_chef1(temps[2],liste_action[2]);
    order_action.add(liste_action[2]);
    Thread chef2_action1 = new Thread_chef2(temps[6], liste_action[6]);
    order_action.add(liste_action[6]);
    Thread chef1_action2 = new Thread_chef1(temps[0], liste_action[0]);
    order_action.add(liste_action[0]);
    Thread chef2_action2 = new Thread_chef2(temps[7], liste_action[7]);
    order_action.add(liste_action[7]);
    Thread chef1_action3 = new Thread_chef1(temps[3],liste_action[3]);
    order_action.add(liste_action[3]);
    Thread chef1_action4 = new Thread_chef1(temps[3],liste_action[3]);
    order_action.add(liste_action[3]);
    Thread chef1_action5 = new Thread_chef1(temps[3],liste_action[3]);
    order_action.add(liste_action[3]);


    chef1_action1.start(); // On lance les oignons
    chef2_action1.start();  // on lance la cuison du poulet
    chef1_action1.join();  // On attend que le chef 1 termine sa première action
    chef1_action2.start(); // Quand elle est terminer on le chef 1 passe à la second actions


    chef2_action1.join();  // Le chef 2 doit terminer le commencer à cuire le poulet 
    chef2_action2.start(); // Avant de rajouter les oignons
    chef2_action2.join(); 

    System.out.println("Ordre des actions : ");
    for(int i = 0 ; i < order_action.size();i++)
    {
        System.out.println(order_action.get(i));
    }	
	}
}
    


class Thread_chef1 extends Thread{
	String action;
    int temps_action;
	public Thread_chef1(int temps_action, String action) {
		this.temps_action = temps_action;
		this.action =action;
	}

   public void run(){
        for(int i = 0 ;i <= this.get_temps_action();i++)
        {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "Second passed");
            
      }
      System.out.println("I have finished : " + action );
   }

    public int get_temps_action()
    {
        return this.temps_action;
    }
  
}

class Thread_chef2 extends Thread{
	String action;
    int temps_action;
	public Thread_chef2(int temps_action, String action) {
		this.temps_action = temps_action;
		this.action =action;
	}
   public void run(){
       for(int i = 0 ;i <= this.get_temps_action();i++)
        {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "Second passed");
           
      }
      System.out.println("I have finished : " + action );
     
      }
    

    public int get_temps_action()
    {
        return this.temps_action;
    }
  
}


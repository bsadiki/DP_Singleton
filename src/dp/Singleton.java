package dp;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private int compteur;
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        System.out.println("Instanciation du singleton");
    }
    public  void traiter(String taskName){
        System.out.println("Tratement "+taskName);
        for (int i=1;i<=5;i++){
            synchronized(Singleton.class){
                ++compteur;
            }
            System.out.println(".."+compteur);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin du traitement de la tsche"+taskName+" Compteur: "+compteur);
    }
}

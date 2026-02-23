public class DBconnection {
  private static DBconnection instance;//Value NULL
  private DBconnection() //Private constructor { 
     System.out.println("Database Connected!");}

    public static DBconnection createObject() {
        if (instance == null)/true
           {instance = new DBconnection();}//Object Creation
        return instance; }//Object Return

    public void executeQuery(String query) {
        System.out.println("Executing: " + query); }}

class Main {
    public static void main(String[] args) {
    DBconnection user1 = DBconnection.createObject();
    DBconnection user2 = DBconnection.createObject();

        user1.executeQuery("Application started");
        user2.executeQuery("Database connected");

        System.out.println(user1 == user2); Output: true }
}

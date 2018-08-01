package personal_project.Personal_Project;

import java.util.Timer;

public class Main {
   public static void main(String args[])
   {
	   Timer time = new Timer();
	   ServerDAO serverDAO = new ServerDAO();
	   time.schedule(serverDAO, 0, 5000);
   }
}

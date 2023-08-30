import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){

            System.out.println("/n Interns Management");
            System.out.println("1 : create, 2 : read, 3 : update, 4 : delete");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            if(choice <1 || choice>=5) break;
            switch(choice){
                case 1: System.out.println("id, name, eMail, salary");
                        int id = sc.nextInt();
                        sc.nextLine();
                        String name = sc.nextLine();
                        String eMail = sc.nextLine();
                        int salary = sc.nextInt();
                        Interns intern  = new Interns(id,name,eMail,salary);
                        //Interns intern = new Interns (7373,"Aniket","aniket@gmail.com",12000000);
                        InternsDao.CreateInterns(intern);
                        break;

                case 2 : ArrayList<Interns> List = InternsDao.readAllInterns();
                         for(Interns interns : List){
                            System.out.println(interns);

                         } 
                         break;
                         
                case 3 : System.out.println("id & name");
                         id = sc.nextInt();
                         sc.nextLine();
                         name = sc.nextLine();
                         InternsDao.updateInterns(id,name);
                         break;
                         
                case 4 :  System.out.print("id");
                          id = sc.nextInt();
                          InternsDao.deleteIntern(id);
                          break;       

            }

        }
    }
}

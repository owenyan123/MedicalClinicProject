import java.util.Scanner;

public class MedClinMain {

    static void mainRunner(){

        while(true) {
            System.out.println("**********************************************");
            System.out.println("***                                        ***");
            System.out.println("    WElCOME TO THE MEDICAL CLINIC SYSTEM");
            System.out.println("***                                        ***");
            System.out.println("**********************************************");
            DBConnector dbConnector = new DBConnector();
            dbConnector.connectToDB();
            System.out.println("You have successfully connected to the database.");
            System.out.println("\n");
            System.out.println("Please select:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 3) break;
            else if(input == 1){

                UsersClass.register();

            }
            else{



            }

        }



    }

    public static void main(String[] args) {

        mainRunner();




    }

}

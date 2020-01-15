package birthdaymanager;

import java.util.Scanner;
import java.util.ArrayList;


public class BirthdayManager {

    public static ArrayList<personDetails> detailsList = new ArrayList();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);

        try {
  
            
            
          
            System.out.println("Welcome to Birthday Manager.\nSelect...\n1 : Add a new person\n2 : Edit a person\n3 : Delete a person\n4 : To view list\n5 : Quit");
            int menuDecision = input.nextInt();

            switch (menuDecision) {

                case 1:

                    Boolean anotherAdd = true;
                    
                    
                    while (anotherAdd) {
                        System.out.println("Enter their name...");
                        String name = input.next();
                        
                        
                        System.out.println("Enter their age...");
                        int age = input.nextInt();
                       
                        
                        System.out.println("Enter their birthday...");
                        String birthday = input.next();
                       
                        
                     
                        personDetails person = new personDetails(name, age, birthday);
                        detailsList.add(person);
                        System.out.println("Add another person ?");
                        if (!input.next().equals("yes")) {
                           
                            mainMenu();
                        }
                    }
                case 2:
                    System.out.println("Enter the name of the person's details you would like to edit");
                    String editName = input.next();
                    for (int i = 0; i < detailsList.size(); i++) {
                        if (detailsList.get(i).getName().equals(editName)) {
                            System.out.println("Person found...\nEnter new details");

                            System.out.println("Name:");
                            String name = input.next();
                            detailsList.get(i).setName(name);

                            System.out.println("Age:");
                            int age = input.nextInt();
                            detailsList.get(i).setAge(age);

                            System.out.println("Birthday:");
                            String birthday = input.next();
                            detailsList.get(i).setBirthday(birthday);

                            Boolean found = true;
                        } else {
                            System.out.println("Details not found");
                        }

                        System.out.println("Editing complete");
                        mainMenu();

                    }

                case 3:
                    System.out.println("Enter the name you of the person you wish to delete");
                    String deleteName = input.next();
                    for (int i = 0; i < detailsList.size(); i++) {
                        if (detailsList.get(i).getName().equals(deleteName)) {
                            detailsList.remove(i);
                        }
                    }
                case 4:
                    System.out.println("Birtday list:\n");
                    for (int i = 0; i < detailsList.size(); i++) {
                        System.out.print("Name: " + detailsList.get(i).getName() + "   ");
                        System.out.print("Age: " + detailsList.get(i).getAge() + "   ");
                        System.out.print("Birthday: " + detailsList.get(i).getBirthday() + "   ");
                        System.out.println("\n");

                    }
                    System.out.println("\nEnter m to return to main menu");
                    String menu = input.next();
                    mainMenu();

                case 5:
                    System.exit(0);
                    

            }

        } catch (Exception e) {
            System.out.println("Please enter the correct data type.\nReturning to main menu...\n\n");
            mainMenu();
        }

    }

  

}

package pharmacy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class inventory {
    Collection<medicine> c= new ArrayList<medicine>();
    Scanner scan=new Scanner(System.in);
    public void menu(){
        int option;
        do{
            System.out.println("Enter[1]to add medicine");
            System.out.println("Enter[2]to update mediine");
            System.out.println("Enter[3]to delete medicine");
            System.out.println("Enter [4]to exit the system");
            option=scan.nextInt();
            switch(option){
                case 1:
                addMedicine();
                break;
                case 2:
                updateMedicine();
                break;
                case 3:
                deleteMedicine();
                break;
                case 4:
                System.out.println("You chose to exit system");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid option");
                break;
            }
        }while(true);
    }
    public void addMedicine(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine name");
        String name=scan.next();
        System.out.print("Enter medicine id");
        String medId=scan.nextLine();
        System.out.print("Enter medicine price");
        int price=scan.nextInt();
        System.out.print("Enter medicine quantity");
        int quantity=scan.nextInt();
        System.out.print("Enter medicine expiry date");
        LocalDate expiryDate=scan.next();
        c.add(new medicine(name, medId, price, quantity, expiryDate));

        }
        public void updateMedicine(){
            
        }
        public void searchMedicine(){
            
        }

}

       
        

    


package pharmacy;

import java.time.LocalDate;

public class medicine {
    String name;
    String medId;
    int price;
    int quantity;
    LocalDate expiryDate;
    boolean isExpired;
    //constructor
    public medicine(String name,String medId,int price,int quantity,LocalDate expiryDate){
        this.name=name;
        this.medId=medId;
        this.price=price;
        this.quantity=quantity;
        this.expiryDate=expiryDate;

    }
    //get method
    public String getName(){
        return name;
    }
    public String getMedId(){
        return medId;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    //setters
    public void setName(String name){this.name=name;}
    public void setMedId(String medId){this.medId=medId;}
    public void setPrice(int price){this.price=price;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    //checks if medicine is expired
    public void checkExpiry(){
        LocaDate currentDate=new LocalDate();
        if(expiryDate.iBefore(currentDate)){
            isExpired=true;
        }else{
            isExpired=false;
        }
        
    }
    public String toString(){

        return "Medicine Name: " + name + "\nID: " + medId + "\nPrice: " + price + 
               "\nQuantity: " + quantity + "\nExpiry Date: " + expiryDate +
               "\nIs Expired: " + isExpired;
    }
    

    
    
}

import java.io.*;
public class Q4 {
    public static void main(String[] args) {
         ResidentialSociety rs = new ResidentialSociety();
         rs.societyName = "Galaxy-Apartment";
         rs.location = " Banjara Hills, Hyderabad";
         rs.SecretoryName ="a secrotory";

         Building A = new Building();
         Building B = new Building();
         Building C = new Building();
         A.buildingName = "A";
         A.totalNumberOfApartments =10;
         B.buildingName ="B";
         B.totalNumberOfApartments = 10;
         C.buildingName="C";
         C.totalNumberOfApartments =10;
         String line ="";
         Apartment[] apartments = new Apartment [30];
         int i=0;
         try   
         {  
           BufferedReader br = new BufferedReader(new FileReader("emp.csv"));  
               while ((line = br.readLine()) != null)   
               {  
                  apartments[i] = new Apartment(line);//Split based on comma.   
                   i++;
            }  
         }   
         catch (IOException e)   
         {  
             e.printStackTrace();  
         }  
         for (Apartment apartment : apartments) {
            System.out.println(apartment.apartmentNumber+"        "+apartment.buildingName+"        "+apartment.ownerName+"        "+apartment.electricMeterNumber);
         }
    }
}

class ResidentialSociety{
    String societyName;
     String location;
     String SecretoryName;
}
class Building extends ResidentialSociety{
    String buildingName;
    int totalNumberOfApartments;
}
class Apartment extends Building{
    int apartmentNumber;
     String ownerName;
     String electricMeterNumber;
     Apartment(String str){
        String[] line = str.split(",");
        this.apartmentNumber = Integer.parseInt(line[0]);
        this.buildingName = line[1];
        this.ownerName = line[2];
        this.electricMeterNumber=line[3];
     }
}
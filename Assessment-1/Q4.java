import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Product> p_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int again = 1;
        while(again!=0){
            getCli();
            int n = sc.nextInt();
            if(n==1){
                System.out.println("the current Product list ");
                getView(p_list);
                System.out.println("do You want to continue(1/0)");
                again = sc.nextInt();
            }
            else if(n==2){
                System.out.println("the count of product list");
                System.out.println(getc(p_list));
                System.out.println("do You want to continue(1/0)");
                again = sc.nextInt();
            }
           else if (n==3){
                System.out.println("enter the id of product that you need so you can get its details");
                 int id = sc.nextInt();
                 System.out.println("the product is");
                 System.out.println(search(id, p_list));
                 System.out.println("do You want to continue(1/0)");
                  again = sc.nextInt();
           }
           else if(n==4){
            System.out.println("enter id of Product that you will edit ");
            int id = sc.nextInt();
            System.out.println("enter the new Specifications   ");
            String s = sc.next();
            System.out.println("enter the new cost  ");
            int cost = sc.nextInt();
            System.out.println("enter the new count ");
            int count = sc.nextInt();
            edit(id, p_list, s, cost, count);
            System.out.println("edited");
            System.out.println("do You want to continue(1/0)");
            again = sc.nextInt();

           }
            else if(n==5){
                System.out.println("enter id of new Product");
                int id = sc.nextInt();
                System.out.println("enter the Specifications   ");
                String s = sc.next();
                System.out.println("enter the cost  ");
                int cost = sc.nextInt();
                System.out.println("enter the count ");
                int count = sc.nextInt();
                add(p_list, id, s, cost, count);
                System.out.println("do You want to continue(1/0)");
                again = sc.nextInt();
            }
            else if(n==6){
                System.out.println("enter id of  Product that You will delete");
                int id = sc.nextInt();
                delete(p_list, id);
                System.out.println("do You want to continue(1/0)");
                again = sc.nextInt();
            }
            else if(n==7){
            System.out.println("the final list is ");
            getView(p_list);
            again=0;
            }
        }
        
   
        sc.close();
       
       
    }
    public static void getCli(){

        System.out.println("                 ");
        System.out.println("                                     the Product inventory Manager");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("enter the any options from below to execute the following operations on the existing ProductList");
        System.out.println("______________________________________________________");
        System.out.println("|        1"+"           |  " +" DisplayList  "+"       |");
        System.out.println("|        2"+"           |  " +" DisplayCount  "+"      |");
        System.out.println("|        3"+"           |  " +" GetProductDetails"+"   |");
        System.out.println("|        4"+"           |  " +" Edit a product  "+"    |");
        System.out.println("|        5"+"           |  " +" add a product  "+"     |");
        System.out.println("|        6"+"           |  " +" delete a product  "+"  |");
        System.out.println("|        7"+"           |  " +" exit from App  "+"     |");
        System.out.println("Enter Your Option");
    }
    public static void delete (ArrayList<Product> al,int id){
        if(al.isEmpty()){
            System.out.println(" sorry cannot delete from empty List");
            return ;
        }
        int ri = 0;
        for (int i = 0; i < al.size() ; i++) {
             if(al.get(i).id==id){
                ri = i;
             }
        }
        System.out.println(al.get(ri).getDetails()+" "+"is deleted");
        al.remove(ri);
        
    }
    public static void add(ArrayList<Product> al,int id,String name,int cost,int count){
            Product np = new Product(id, name, cost, count);
            al.add(np);
            System.out.println("the product with id "+id +"  whose item is  "+ name +" is added");
            return ;
    }
    public static void getView(ArrayList<Product> arr){
        System.out.println("ProductId\t\tProductCount\t\tProductCost\t\tSpecification");
        for (int i = 0; i < arr.size(); i++) {
             System.out.println(arr.get(i).id+"\t\t              "+arr.get(i).count+"                     " +arr.get(i).cost+"\t\t              "+arr.get(i).Specfications);
        }
    }
    public static int getc(ArrayList<Product> arr){
        return arr.size();
    }
    public static String search(int id,ArrayList<Product> arr){
        if(arr.isEmpty()){
            System.out.println(" sorry cannot search from empty List");
            return "";
        }
        String ans="";
        for (Product product : arr) {
            if(product.id==id)
              ans = product.getDetails();
        }
        return ans;
    }
    public static void edit(int id,ArrayList<Product> arr,String newName,int newCost,int count){
        for (Product product : arr) {
            if(product.id==id){
                product.Specfications = newName;
                product.cost = newCost;
                product.count = count;
            }
        }
        return;
    }
    
}
class Product{
      int id = 0; 
     String Specfications;
     int cost =0;
     int count =0;
     public Product(int id,String Specfications,int cost,int count){
            this.id = id;
           this.Specfications=Specfications;
           this.cost = cost;
           this.count =count;
     }
     public String getDetails(){
        return "the id is "+this.id+"  "+"   the Specifications   : "+this.Specfications+"  the cost is  "+this.cost+"  the count is "+this.count;
     }
   
}
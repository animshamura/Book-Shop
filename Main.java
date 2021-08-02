import java.util.*;
import java.io.*;
public class Main {
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    String b,a,p;
    int i;
    double r;
    Book obj [] = new Book [10];
    int k = 0;
    try {
    File f = new File("C:/Users/Sam/Desktop/books_list.txt");
    Scanner cs = new Scanner(f);
   while(cs.hasNext()){
      b = cs.nextLine();
      i = Integer.parseInt(cs.nextLine());
      a = cs.nextLine();
      p = cs.nextLine();
      r = Double.parseDouble(cs.nextLine());
      Book  bk = new Book(b,i);
      Book  bk1 = new Book(a,p,r);
      Book  bk2  = new Book(bk1,bk);
       obj[k] = bk;
       k++;
    }
    }
    catch (Exception e){
      System.out.println("File is missing.");
    }
   boolean start = true;
   while(start){
     System.out.println("Enter\n 1 to Chance Info\n 2 to Display Info\n 3 to Exit");
     int j = sc.nextInt();
     if(j==1){
       System.out.println("Enter ISBN of the book.");
       int n = sc.nextInt();
       boolean g = true;
       for(int m = 0; m <10; m++){
         if(obj[m].getIsbn()==n) {
           g = false;
           System.out.println("Enter\n 1 to Change Book Name\n 2 to Change ISBN\n 3 to Change Author\n 4 to Change Publisher\n 5 to Change Price\n 6 to Update Price");
           int w = sc.nextInt();
           String nw = null;
           if(w==1) System.out.println("Enter changed book name.");
           else if(w==2) System.out.println("Enter changed isbn.");
           else if(w==3) System.out.println("Enter changed author name.");
           else if(w==4) System.out.println("Enter changed publisher name.");
           else if(w==5) System.out.println("Enter changed price.");
           else if(w==6) {
             obj[m].update_price();
             System.out.println("Price updated.");
           }
           else System.out.println("Invalid code.");
           
           if( w >= 1 && w <= 5) {
           nw = sc.nextLine();
           nw = sc.nextLine();
           
           if(w==1) obj[m].setBook_name(nw);
           else if(w==2) obj[m].setIsbn(Integer.parseInt(nw));
           else if(w==3) obj[m].setAuthor(nw);
           else if(w==4) obj[m].setPublisher(nw);
           else if(w==5)  obj[m].setPrice(Double.parseDouble(nw));
           System.out.println("Changed/Updated Successfully.");
           }
         }
       }
         if(g) System.out.println("Invalid ISBN");
           
       }
     
         else if (j==2){
           System.out.println("Enter \n 1 to Display All\n 2 to Display One Book");
           int z = sc.nextInt();
           if(z==1){
             for(int m = 0; m < 10; m++) {
               System.out.println("Book No. #"+(m+1));
               obj[m].display();
               System.out.println();
           }
           }
            else if(z==2){
            System.out.println("Enter ISBN of the book.");
            int n = sc.nextInt();
            boolean g = true;
            for(int m = 0; m< 10; m++){
              if(obj[m].getIsbn()==n){
                g = false;
                System.out.println("Book No. #"+(m+1));
                obj[m].display();
                System.out.println();
              }
            }
            if(g) System.out.println("Invalid ISBN");
         }
         else System.out.println("Invalid code.");
         }
         else if(j==3) break;
         else System.out.println("Invalid code.");
   }
  }
} 
            
                             
                             
      
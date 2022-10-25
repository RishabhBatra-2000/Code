    import java.util.Scanner;
    class fact{  
     public static void main(String args[]){  
      int fact=1;  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to get the factorial :");
      int number = sc.nextInt();
      for(int i=1;i<=number;i++){    
          fact=fact*i;    
      }    
      System.out.println("Factorial of \n"+number+"\n is: "+fact);    
     }  
    }  

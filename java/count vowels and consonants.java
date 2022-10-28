    import java.util.Scanner;
    public class count {    
        public static void main(String[] args) {    
                 
            int vcount = 0, ccount = 0;    
            Scanner sc = new Scanner(System.in);
            String str = " "; 
            System.out.print("Give a string value :");
            str = sc.nextLine(); 
            str = str.toLowerCase();    
                
            for(int i = 0; i < str.length(); i++) {     
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {       
                    vcount++;    
                }      
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {        
                    ccount++;    
                }    
            }
            System.out.println("The given string :" + str);
            System.out.println("Number of vowels: " + vcount);    
            System.out.println("Number of consonants: " + ccount);    
        }    
    }   

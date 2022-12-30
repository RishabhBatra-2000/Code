public class StringToCharacterArrayExample {
 
  public static void main(String args[]){

    String strOrig = "Hello World";

    char[] stringArray;
    

    stringArray = strOrig.toCharArray(); 
    

    for(int index=0; index < stringArray.length; index++)
      System.out.print(stringArray[index]);
    
  }
  
}

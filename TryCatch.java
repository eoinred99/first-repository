public class TryCatch{
  public static void main(String[] args){
   int [] x = {7, 6, 11, 15, 19};

    try{
   System.out.println("Value stored in index 5 is: "+x[5]);
}catch( ArrayIndexOutOfBoundsException e){
System.out.println("There was was an ArrayIndexOutOfBoundsException");

 }
   System.out.println("End of program");
 }
}
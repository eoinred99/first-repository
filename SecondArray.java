public class SecondArray{
  public static void main(String[] args){
   int [] x = new int[5];


   //assign values to new array
   for(int i = 0; i < x.length; i++){
	   x[i] = i + 1;
   }

   System.out.println("Index\tValue\n");

	for(int i = 0; i < x.length; i++){
	  System.out.println(i+"\t"+x[i]);

   }

   System.out.println();

 }

}

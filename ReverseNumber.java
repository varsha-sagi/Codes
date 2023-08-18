/*A number n is passed as an input. the program
   must print the number in reverse form
Input:
1234
Output:
4321
*/
import java.util.*;
public class Hello
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int revno=0;
      while(n>0)
      {
         revno=revno*10;
         revno+=n%10;
         n/=10;
       }
     System.out.println(revno);
   }
}

package ghostp;

import java.util.Scanner;
import java.text.MessageFormat;

/*** Author: GhostPoltergeist::Harold Edsel Cabaluna ***/
    /*** The Arithmetic Progression Calculator ***/
      /**         an = a1 + (n-1) d           **/ 
/*
  * What is Arithmetic Progression:
  * An arithmetic progression or arithmetic sequence 
  * is a sequence of numbers such that the difference 
  * between the consecutive terms is constant.
  * 
  * SOURCE: https://en.wikipedia.org/wiki/Arithmetic_progression
  * */

/** Code **/

public class Input {
	public static void main(String[] args) {
	 Scanner value = new Scanner(System.in);
	 System.out.print("[a] The 1st Term: ");
	 int A = (value.nextInt());
	 System.out.print("[d] The Common Difference: ");
	 int D = (value.nextInt());
	 System.out.print("[an] The nth Term: ");
	 int an = (value.nextInt());
	 System.out.print("[n] Your Missing Term: ");
	 int n = (value.nextInt());
	 /* Duplicate::Prevent::LogicalError */
	 int an1 = an; 
	 /* Break */
	 String info = MessageFormat.format("The nth term defines {0} while the first term of Arith.Progression is {1} and {2} is the common difference", an, A, D);
	 System.out.print("\n");
     System.out.println(info);
	 
	                //Process
	                System.out.print("an = a1 + (n-1) d");System.out.print("\n\n");
	                
	                /** Translate::Substitution **/
	                String Sub = MessageFormat.format("{0} = {1} + ({2}-1) {3}", an, A, n, D);System.out.println(Sub);
	                /** Calculate */
	                int res1 = n - 1;
	                int res2 = A + res1;
	                int res3 = res2 * D;
	                String finalres = MessageFormat.format("The {0} Term is: {1}", an, res3);System.out.println(finalres);
	}
}
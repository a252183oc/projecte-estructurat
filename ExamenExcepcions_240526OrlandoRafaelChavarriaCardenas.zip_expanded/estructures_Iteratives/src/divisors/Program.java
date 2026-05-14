package divisors;

/*
 * Program.java				1.0 5/11/2025
 * 
 * Printa els divisors enters d'un nombre que hem escollit.
 * 
 * Orlando Rafael Chavarría Cárdenas
 * 
 * This is free sorftware, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/glp.html for more information. 
 */

import java.util.Scanner;
public class Program{
	public void writeDivisors(int num){
	/**
	 * Printa els divisors enters d'un nombre que hem escollit.
	 * 
	 * @param num es el  nombre escollit.
	 * @param i són els nombres divisors.
	 */
		int i;
		for (i = 1; i <= num; i++){
			if((num % i) == 0){
				System.out.print(i + " ");
			}
		}
	}
	public static void main (String[] args){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Escull un nombre enter ");
		num = s.nextInt();
		System.out.print("Els seus divisors enters són: ");
		Program p = new Program();
		p.writeDivisors(num);
	}
}


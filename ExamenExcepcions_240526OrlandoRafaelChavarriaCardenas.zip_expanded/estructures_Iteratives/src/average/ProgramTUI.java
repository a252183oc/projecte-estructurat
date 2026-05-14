package average;

/*
 * Program.java				1.0 10/11/2025
 * 
 * Llegeix una seqüència de nombres no negatius acabada en zero i escrigui la mitjana aritmètica dels nombres entrats.
 * 
 * Orlando Rafael Chavarría Cárdenas
 * 
 * This is free sorftware, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/glp.html for more information. 
 */
import java.util.Scanner;
public class ProgramTUI{
	public static void main (String[] args){
		int n, numeros;
		double mitjana, suma;
		n = 0;
		suma = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Escriu la teva secuencia, escriu 0 per sortir\n");
		System.out.print("Escriu un numero ");
		numeros = s.nextInt();
		while (numeros != 0){
			n++;
			suma = suma + numeros;
			System.out.print("Escriu un numero ");
			numeros = s.nextInt();
		}
		mitjana = suma / n;
		System.out.printf("La mitjana aritmetica de la teva secuencia és %.2f", mitjana); 
	}
}

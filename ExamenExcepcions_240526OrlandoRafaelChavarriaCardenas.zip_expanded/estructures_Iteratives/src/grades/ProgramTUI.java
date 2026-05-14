package grades;

/*
 * Program.java				1.0 12/11/2025
 * 
 * Llegeix una seqüència de notes obtingudes per un grup d’alumnes acabada en -1 i 
 * escriu quants alumnes han obtingut les qualificacions MD, I, S,B, N, E.
 * 
 * Orlando Rafael Chavarría Cárdenas
 * 
 * This is free sorftware, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/glp.html for more information. 
 */
import java.util.Scanner;
public class ProgramTUI{
	public static void main(String[] args){
		int md, i, s, b, n, ex;
		double nota;
		md = 0;
		i = 0;
		s = 0;
		b = 0;
		n = 0;
		ex = 0;
		Scanner sd = new Scanner(System.in);
		System.out.print("Escriu la teva secuencia, escriu -1 per sortir\n");
		System.out.print("Escriu la teva nota ");
		nota = sd.nextDouble();
		while (nota != -1.0){
			if  (nota >= 0 && nota < 3){
				md++;
			}else if (nota < 5){
				i++;
			}else if (nota < 6){
				s++;
			}else if (nota < 7){
				b++;
			}else if (nota < 9){
				n++;
			}else{
				ex++;
			}
			System.out.print("Escriu la teva nota ");
			nota = sd.nextDouble();
		}
		System.out.printf("Hi han %d MD, %d I, %d S, %d B, %d N i %d Ex", md, i, s, b, n, ex);
	}
}

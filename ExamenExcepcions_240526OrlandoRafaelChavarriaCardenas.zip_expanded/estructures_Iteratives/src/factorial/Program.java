package factorial;

/*
 * Program.java				1.0 07/11/2025
 * 
 * Printa el resultat de n factorial.
 * 
 * Orlando Rafael Chavarría Cárdenas
 * 
 * This is free sorftware, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/glp.html for more information. 
 */
public class Program{
	public void factorial (int n){
		int resultat;
		int i;
		resultat = 1;
		for (i = 1; i <= n; i++){
			resultat = resultat * i;
		}
		System.out.printf("El factorial de %d és %d", n, resultat);
	}
	public static void main (String[] args){
		Program p = new Program();
		p.factorial(7);
	}
}

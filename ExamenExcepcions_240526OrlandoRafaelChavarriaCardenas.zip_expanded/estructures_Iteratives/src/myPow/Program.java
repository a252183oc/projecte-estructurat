package myPow;

/*
 * Program.java				1.0 07/11/2025
 * 
 * Printa la potencia del nombre a elevat a b, sense usar el Math.pow.
 * 
 * Orlando Rafael Chavarría Cárdenas
 * 
 * This is free sorftware, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/glp.html for more information. 
 */
public class Program{
	public void myPow (int a, int b){
		int pow;
		pow = a;
		for (int i = 1; i < b; i++){
			pow = pow * a;
		}
		System.out.printf("la potencia del nombre és %d", pow); 
	}
	public static void main (String[] args){
		Program p = new Program();
		p.myPow(3, 9);
	}
}


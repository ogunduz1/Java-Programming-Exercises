//döngülerin recursive fonk olarak yazılması 
public class recursiveloop {
	/*Her döngü bir recursive fonksiyon,
 	* her recursive fonksiyon bir döngü 
	* olarak yazılabilir.
 	*/
	public static int f(int x) {
		if(x==10)
			return 10;
		return x+f(x+1);
	}
	/*0+f(1)
	 *1+f(2)
	 *2+f(3)
	 *..
	 *9+f(10)-->10
	 */
	public static void main(String[] args) {
		int sonucloop=0;
		for (int i=0;i<=10;i++) {
			sonucloop+=i;
		}
		System.out.println("Döngü sonucu : "+sonucloop);
		System.out.println("Recursive fonk. sonucu : "+f(0));
	}
	
	
}

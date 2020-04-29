public class loops {
	public static void main(String[] args) {
		for(int sayac=0;sayac<10;sayac++) { //sayac değişkeni loop varibledır
			System.out.println("For "+sayac);
		}
		int sayac=0;
		while(sayac<10) {
			System.out.println("While"+sayac);
			//sayac=sayac + 1;
			//sayac+=1;
			sayac++;
		}
		sayac=0;
		do {
			System.out.println("do "+ sayac);
			sayac++;
			
		}while(sayac<10);
		
	}

}

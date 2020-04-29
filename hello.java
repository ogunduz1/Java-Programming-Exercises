public class hello {
/*Aynı C deki gibi
çok satırlık kod böyle yaılır
kapatılır */
    public static void main(String[] args) {
        // Tek Satırlık Not böyle yazılır
        int x=10; //değişken tanımlama C deki gibi
        int y;
        y=5;
        float pi=(float)3.1;
        double pi2=3.14;
        String s= "deneme";
        
        System.out.println("Hello, World");
        System.out.println(x+y);
        System.out.println("Özgür Gündüz");
        System.out.println("X değeri " + x); //C deki , virgül yerine burada + kullanılıyor
        System.out.println("string değeri"+s);
        System.out.println("Pi değeri (float)"+pi);
        System.out.println("Pi2 değeri (double)"+pi2);
	
    }

}



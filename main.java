import java.util.Scanner;

public class main {
	
	public static void skorhesapla(String isim, int puan) {
		System.out.println(isim + " adli oyuncunun " + puan + " puani var");
	}
	
	public static void skorhesapla(int puan) {
		System.out.println("isimsiz oyuncunun puani:" + puan);
	}
	
	public static void skorhesapla(String isim) {
		System.out.println(isim + " adli oyuncunun puani yok");
	}
	
	public static void main(String[] args) {
 
    skorhesapla("sümeyye",1000);
    skorhesapla("kali");
    skorhesapla(1000);
		
		
		
	}

}

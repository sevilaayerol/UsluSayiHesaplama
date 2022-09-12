import java.util.Scanner;

public class usluSayi {

	public static void main(String[] args) {
		int n, k;
		Scanner input = new Scanner(System.in);
		System.out.println("Ussu alinacak sayi:");
		n = input.nextInt();
		System.out.println("Us olacak sayi:");
		k = input.nextInt();
		int total=1;
		for(int i=1; i<=k; i++) {
			total *= n;
		}
		
		System.out.println("Sonuc:"+total);
	}

}

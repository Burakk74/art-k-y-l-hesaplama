package artikyıl;

import java.util.Scanner;

public class artikYıl {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int yıl;
		System.out.print("Yılı giriniz :");
		yıl = input.nextInt();
		
		if((yıl % 4 == 0 && yıl % 100 != 0) || yıl % 400 == 0) {
			System.out.print( yıl +" yılı artık yıldır !");
		}
		else {
			System.out.print(yıl + " yılı artık yıl değildir !");
		}
	}

}

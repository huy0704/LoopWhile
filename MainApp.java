package Huy.dev;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {		
		/**
		 * 11.1 tinh tong cac so tu 1 den 100
		 */
		int	i = 0;
		int tong = 0;
			while(i <= 100) {
				tong += i;
				i++;
		}
		System.out.println("tong= " + tong);
		System.out.println("------------------------------");
		/**
		 * 11.2 viet chuong trinh nhap vao mot so tu nhien n. Tinh tong cac so chia het cho 3 be hon n 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so tu nhien n: ");
		int a = sc.nextInt();
			i = 0;
			tong = 0;
		while (i < a) {
			if (a % 3 == 0) 
				tong += i;			
			i++;
		}
		System.out.println("Tong: " + tong);
		System.out.println("------------------------------");
		/**
		 * 11.3 viet chuong trinh in ra 100 so Fibonacci dau tien
		 */
		 int first = 0, last = 1;
	        System.out.print("Chuỗi Fibonacci với 100 số là: ");
	        int j = 1;
	        while(j <= 100) {
	        System.out.print(first +" ");
	            int max = first + last;
	            	first = last;
	            	last = max;
	            	j++;
	        }
	        System.out.println();
	        System.out.println("------------------------------");
	    /**
	     * 11.4
	     */ 
	    System.out.println("nhap day so: ");
	    int n = sc.nextInt();
	    int invert = 0;
	    while(n > 0) {
	    	int mod	= n % 10;
	    	  	n = n / 10;
	    	  	invert = invert * 10 + mod;
	        }
	    System.out.println(invert);
	    System.out.println("------------------------------");
	    /**
	     * 11.5
	     */
	    int t = 100;
	    while(t <= 999) {
	    	int y = t;
	    	 	tong = 0;
	    	while(y > 0) {
	        	int mode = y % 10;
	        	 	y = y /10;
	        		tong += mode;
	        	}
	        	if(tong % 3 == 0)
	        		System.out.println(t + " la so co tong chia het cho 3");
	        	t++;
	        }
	        System.out.println("------------------------------");
	}	
}

package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch (Exception e) {
			System.out.println("Error: "+ e.getLocalizedMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}

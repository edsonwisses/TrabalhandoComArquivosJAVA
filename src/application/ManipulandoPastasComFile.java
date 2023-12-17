package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho de uma pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// listando os diretórios da pasta especificada 
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		//listando os arquivos da pasta especificada
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Criando uma pasta na pasta especificada
		boolean success = new File(strPath+"\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: "+ success);
		
		
		
		sc.close();
	}
}

package homework;

//1. Создает новую директорию и файл средствами класса File.
//2. Осуществляет запись в файл произвольного текста.
//3. Считывает строки из файла и меняет местами первое и последнее слова
//в каждой строке.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File folder = new File("newFolder");
		File file = new File("newFolder/myFile.txt");
		File readFile = new File("newFolder/changedWords.txt");
		String str = null;
		
		LinkedList<String> linList = new LinkedList<>();
		
		try {
			folder.mkdir();
			file.createNewFile();
		} catch (SecurityException e){
			System.out.println("Не удалось создать каталог или файл!");
		}
		
		System.out.println("Введите текст: ");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {				
				BufferedWriter bwr = new BufferedWriter
						(new OutputStreamWriter(new FileOutputStream(file,false)));
				for (int i=0; i<7; i++) {
					str = br.readLine();
					bwr.write(str);
					bwr.newLine();
				}
				bwr.close();
				System.out.println("Этот текст записан в файл: " + file);
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
		System.out.println();
		
		try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i=0; i<4; i++) {
				str = bufReader.readLine();
				System.out.println(str);
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		

	}

}

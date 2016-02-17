package homework;

//1. Создает новую директорию и файл средствами класса File.
//2. Осуществляет запись в файл произвольного текста.
//3. Считывает строки из файла и меняет местами первое и последнее слова
//в каждой строке.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File folder = new File("newFolder");
		File file = new File("newFolder/myFile.txt");		
		String str = null;
		
		// количество строк
		int countLines = 5;		
		
		// создаем каталог и файл
		try {
			folder.mkdir();
			file.createNewFile();
		} catch (SecurityException e){
			System.out.println("Не удалось создать каталог или файл!");
		}
		
		System.out.println("Введите " + countLines + " строк: ");
		
		// считываем из консоли и выводим в файл 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {				
				BufferedWriter bwr = new BufferedWriter
						(new OutputStreamWriter(new FileOutputStream(file,false)));
				for (int i=0; i<countLines; i++) {
					str = br.readLine();
					bwr.write(str);
					bwr.newLine();
				}
				bwr.close();
				System.out.println("Этот текст записан в файл: " + file);
				
				System.out.println();
				
				// Новый BufferedReader для считывания из файла
				try (BufferedReader bufReader = new BufferedReader(new FileReader(file))) {
					
					// для каждой строки обработка
					for (int i=0; i<countLines; i++) {
						str = bufReader.readLine();
						
						// в списке linList сохраняем считаную строку
						LinkedList<String> linList = new LinkedList<>();
						
						// в списке changedList получаем обмен первого и последнего слова строки
						LinkedList<String> changedList = new LinkedList<>();
						
						// в strTemp записываем каждое слово
						String strTemp = "";
						
						// создать список LinkedList из слов строки
						for (char c : str.toCharArray()) {
							if (c !=' ') {
								strTemp += c;								
							} else {
								linList.add(strTemp);
								strTemp = "";
							}			
						}
						// добавить в список linList последнее слово, так как цикл закончился, 
						// а strTemp еще имеет новое значение
						linList.add(strTemp);
						
						// создаем клон списка и в нем меняем местами первый и последний элемент
						changedList = (LinkedList<String>) linList.clone();
						changedList.removeFirst();
						changedList.addFirst(linList.getLast());
						changedList.removeLast();
						changedList.addLast(linList.getFirst());
						for (String s : changedList) {
							System.out.print(s + " ");
						}
						System.out.println();						
					}
				}
		} catch (IOException e) {			
			e.printStackTrace();
		}		

	}

}

package exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SuperInterImplTwo implements SuperInter{

	@Override
	public String dataString() {
		String readData = null;
		try {
			Scanner scan = new Scanner(new File("test.txt"));
			readData = scan.nextLine();
			readData = readData + scan.nextLine();
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}return readData;
	}

	@Override
	public void print() {
		System.out.println("!?!?!?!?");
		
	}

}

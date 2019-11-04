package Utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class CSV {
	//this function will read a csv file and return as a list
	public static List<String[]> read(String file) {
		LinkedList<String[]> data = new LinkedList<String[]>();
		String datarow;
		try {
			BufferedReader br = new BufferedReader (new FileReader(file));
			while ((datarow = br.readLine()) !=null){
			String[] dataRecords = datarow.split(",");
			data.add(dataRecords);
			}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;
	}
}
	
		

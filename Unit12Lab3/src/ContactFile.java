import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactFile {
	private File file;
	private Scanner read;
	private TreeMap <String,String[]> data= new <String,String[]> TreeMap();
	private String path;
	private Formatter output;
	public ContactFile(String path){
		this.path=path;
		try{
			file=new File(path);
			read=new Scanner(file);
			int x=0;
			String temp;
			while (read.hasNextLine()) {
				temp=read.nextLine();
                data.put(temp.split(",")[0].concat(" ").concat(temp.split(",")[1]), temp.split(","));
            }
			output=new Formatter(path);
		}
		catch(FileNotFoundException e){
			System.out.println("Invalid File Name");
		}
	}
	
	public String[] read(String Name){
		return data.get(Name);
	}
	
	public void add(String [] add){
		data.put((add[0]+" "+add[1]), add);
		this.rewrite();
	}
	
	public void refresh(){
		
		int x=0;
		String temp;
		while (read.hasNextLine()) {
			temp=read.nextLine();
            data.put(temp.split(",")[0].concat(" ").concat(temp.split(",")[1]), temp.split(","));
		}
	}
	public void delete(String Name){
		data.remove(Name);
	}
	public String[][] getAll(){
		String [][] output= new String[data.size()][4];
		int x=0;
		for(Map.Entry contact : data.entrySet()){
				String[] c = data.get(contact.getKey());
				output[x]=c;
				x++;
		}
		return output;
	}
	public void rewrite(){
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("uhoh");
		}
		for(Map.Entry contact : data.entrySet()){
			String[] c = data.get(contact.getKey());
			output.format("%s,%s,%s,%s%n", c[0],c[1],c[2],c[3]);
		}	
		
	}
	public void close(){
		output.flush();
		output.close();
	}
}

package Persistances;

import java.util.Scanner;

public class PerMain {
	public static void main(String[] args) {
		String  data;
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the data");
		data=sn.next();
		if(data=="FilePersistance") {
			FilePersistance obj=new FilePersistance();
			obj.persist();
		}
		else {
		DatabasePersistance obj1=new DatabasePersistance();
		obj1.persist();
	}

}
}


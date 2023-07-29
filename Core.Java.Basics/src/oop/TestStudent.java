package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestStudent {
	public static void main(String[] args) throws ParseException {
		Student s = new Student();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyy");
		s.setName("Rajat Soni");
		s.setRollNo("5468954");
		s.setAddress("indore");
		s.setDob(f.parse("30/01/1993"));
		s.setMarks(370);
		
		System.out.println("Name-> "+s.getName());
		System.out.println("Address-> "+s.getAddress());
		System.out.println("DateOfBirth-> "+f.format(s.getDob()));
		System.out.println("RollNo-> "+s.getRollNo());
		System.out.println("Marks-> "+s.getMarks());
	}

}

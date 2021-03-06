package Zad96;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Student {
	
	private String name;
	private String familyName;
	private int number;
	private HashMap<String,ArrayList<Integer>> notebook = new HashMap<String,ArrayList<Integer>>();
	
	public Student() {
		super();
	}

	public Student(String name, String familyName, int number, HashMap<String, ArrayList<Integer>> notebook) {
		super();
		this.name = name;
		this.familyName = familyName;
		this.number = number;
		this.notebook = notebook;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public HashMap<String, ArrayList<Integer>> getNotebook() {
		return notebook;
	}

	public void setNotebook(HashMap<String, ArrayList<Integer>> notebook) {
		this.notebook = notebook;
	}

	public void addSubjectMark(String subj, int mark) {
		if(notebook.containsKey(subj)) {
			notebook.get(subj).add(mark);
		} else {
			ArrayList<Integer> marks = new ArrayList<Integer>();
			marks.add(mark);
			notebook.put(subj, marks);
		}
	}
			
	public double calculateAvarageMark(String subj) {
		if(notebook.containsKey(subj)) {
			double sum = 0;
			ArrayList<Integer> marks = notebook.get(subj);
			double count = 0;
			for(Integer mark : marks) {
				sum += mark;
				count++;
			}
			sum = sum / count;
			return sum;
		} else {
			return 0;
		}
	}
	
	
	
}

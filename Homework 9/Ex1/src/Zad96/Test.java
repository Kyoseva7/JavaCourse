package Zad96;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> notebook1 = new HashMap<String, ArrayList<Integer>>();
		Student ivo = new Student ("Ivo", "Ivanov", 5, notebook1);
		notebook1. put("Math", null);
		ivo.addSubjectMark("Math", 4);
		ivo.addSubjectMark("Math", 6);
		ivo.addSubjectMark("Math", 5);
		notebook1. put("History", null);
		ivo.addSubjectMark("History", 2);
		ivo.addSubjectMark("History", 5);
		ivo.addSubjectMark("History", 3);
		notebook1. put("Sport", null);
		ivo.addSubjectMark("Sport", 6);
		ivo.addSubjectMark("Sport", 3);
		ivo.addSubjectMark("Sport", 5);
		notebook1. put("Fiction", null);
		ivo.addSubjectMark("Fiction", 4);
		ivo.addSubjectMark("Fiction", 5);
		ivo.addSubjectMark("Fiction", 3);
		notebook1. put("BEL", null);
		ivo.addSubjectMark("BEL", 3);
		ivo.addSubjectMark("BEL", 5);
		ivo.addSubjectMark("BEL", 3);
		System.out.println("BEL: " + ivo.calculateAvarageMark("Bel"));
		
		HashMap<String, ArrayList<Integer>> notebook = new HashMap<String, ArrayList<Integer>>();
		Student pepi = new Student("Peter", "Petrov", 21, notebook);
		notebook.put("Math", null);
		pepi.addSubjectMark("Math", 4);
		pepi.addSubjectMark("Math", 2);
		pepi.addSubjectMark("Math", 5);
		notebook1. put("History", null);
		pepi.addSubjectMark("History", 2);
		pepi.addSubjectMark("History", 5);
		pepi.addSubjectMark("History", 4);
		notebook1. put("Chemistry", null);
		pepi.addSubjectMark("Chemistry", 4);
		pepi.addSubjectMark("Chemistry", 6);
		pepi.addSubjectMark("Chemistry", 5);
		notebook1. put("Fiction", null);
		pepi.addSubjectMark("Fiction", 4);
		pepi.addSubjectMark("Fiction", 5);
		pepi.addSubjectMark("Fiction", 4);
		notebook1. put("BEL", null);
		pepi.addSubjectMark("BEL", 6);
		pepi.addSubjectMark("BEL", 3);
		pepi.addSubjectMark("BEL", 3);
		System.out.println("History: " + pepi.calculateAvarageMark("History"));
		
		
		
		HashMap<String, ArrayList<Integer>> notebook2 = new HashMap<String, ArrayList<Integer>>();
		Student emo = new Student ("Emil", "Stefanov", 14, notebook2);
		notebook1. put("Math", null);
		emo.addSubjectMark("Math", 4);
		emo.addSubjectMark("Math", 2);
		emo.addSubjectMark("Math", 5);
		notebook1. put("History", null);
		emo.addSubjectMark("History", 4);
		emo.addSubjectMark("History", 5);
		emo.addSubjectMark("History", 4);
		notebook1. put("Chemistry", null);
		emo.addSubjectMark("Chemistry", 4);
		emo.addSubjectMark("Chemistry", 3);
		emo.addSubjectMark("Chemistry", 5);
		notebook1. put("Fiction", null);
		emo.addSubjectMark("Fiction", 5);
		emo.addSubjectMark("Fiction", 5);
		emo.addSubjectMark("Fiction", 4);
		notebook1. put("BEL", null);
		emo.addSubjectMark("BEL", 6);
		emo.addSubjectMark("BEL", 5);
		emo.addSubjectMark("BEL", 3);
		System.out.println("Sport: " + emo.calculateAvarageMark("Sport"));
		
		
	}

}

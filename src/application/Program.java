package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> alunoA= new HashSet<>(); 
		Set<Aluno> alunoB= new HashSet<>(); 
		Set<Aluno> alunoC= new HashSet<>();
		Set<Aluno> total = new HashSet<>(alunoA);
		
		System.out.println("How many students for course A");
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			
			int code = sc.nextInt();
			Aluno studentA = new Aluno(code);
			alunoA.add(studentA);
		}
		
		for(Aluno student:alunoA) {
			System.out.println(student);
		}
		
		System.out.println("How many students for course B");
		int n1 = sc.nextInt();
		
		for(int i=0;i<n1;i++) {
			
			int code = sc.nextInt();
			Aluno studentB = new Aluno(code);
			alunoB.add(studentB);
		}
		
		for(Aluno student:alunoB) {
			System.out.println(student);
		}
		
		System.out.println("How many students for course C");
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			
			int code = sc.nextInt();
			Aluno studentC = new Aluno(code);
			alunoC.add(studentC);
		}
		
		for(Aluno student:alunoC) {
			System.out.println(student);
		}
		
		total.addAll(alunoB);
		total.addAll(alunoC);
		total.addAll(alunoA);
		
		System.out.print("Total: " + total.size());
		
		sc.close();
	}

}

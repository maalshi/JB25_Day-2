package by.epam.jb25.day2;

import java.util.Scanner;

public class Task3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		double r;
		double length;
		double square;
		
		System.out.println("������� ������ �����");
		r = sc.nextDouble();
		
		length = Math.PI*r*2;
		square = Math.PI*Math.pow(r, 2);
		
		System.out.println("����� ���������� ����� " + length + ", � ������� ����� ����� "+square);
		

	}

}

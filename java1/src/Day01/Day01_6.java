package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� : ");     String ���� = scanner.next();
		System.out.print("�ۼ��� : ");    String �ۼ��� = scanner.next();
		System.out.print("���� : ");      String ���� = scanner.next();				
		System.out.print("��¥ : ");     String ��¥ = scanner.next();
		
		System.out.println("*----------------�湮��------------*");
		System.out.println("*|����|�ۼ���|����\t\t|��¥  |");
		System.out.println("*|  " + ���� + "|" + �ۼ��� + "|" + ���� + "\t|" + ��¥ + "|");
		System.out.println("*--------------------------------*");
		
	} // m e
}  // c e

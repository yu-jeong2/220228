package Day12;

import java.io.UnsupportedEncodingException;

public class Day12_2 {
	public static void main(String[] args) {
	
		// p499. String �޼ҵ�
		// CharAt : ���ڿ����� Ư����������
		String ssn="010624-1230123";
		char sex = ssn.charAt(7);//7�� �ε����� ���ڸ� ����
		switch(sex) {//switch��� [switch(�˻���)]
		case'1'://sex ������ ���� 1�̸�
		case'3'://sex ������ ���� 3�̸� 
			System.out.println("���� �Դϴ�.");
			break;
		case'2'://sex ������ ���� 2�̸�
		case'4'://sex ������ ���� 4�̸�
			System.out.println("���� �Դϴ�.");
			break;
		}
		
		//p.501 equals() : ���ڿ� ��
			//�⺻�ڷ��� ����ϴ� ������ ������ ��� ����[==]
			//String Ŭ���� ����ϴ� ��ü�� == ��� �Ұ���[ .equals( )]
		
		//�ڹ� �޸�[JVM]
			//���� �Ÿ� : �������� ����
			//�� �޸� : ��ü ����
			//�޼ҵ� �޸�
		
		
		//���ڿ� ����
		String strVar1= new String("�Ź�ö");
		String strVar2="�Ź�ö";//��ü�� new �����ڰ� �ʼ�������, String Ŭ������ �ڵ� ��ü����
		String strVar3="�Ź�ö";
		//���ڿ� ��
		if(strVar1==strVar2) {//���ڿ�==�Ұ���[ == �޸��ּҰ� ��]
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
		
		//p.502 getBytes() : ���ڿ�->����Ʈ���� ��ȯ
		String str="�ȳ��ϼ���"; //����Ư��1����Ʈ, �ѱ�10����Ʈ
		
		byte[] bytes1=str.getBytes();//���ڿ�->����Ʈ���� ��ȯ
		System.out.println("���� 1byte �ѱ�2byte : "+bytes1.length);//�迭��.length : �迭���� �ʵ�
		
		String  str1=new String(bytes1);//����Ʈ��->���ڿ� ��ȯ
		System.out.println("����Ʈ��->���ڿ� : "+str1);
		
		
		byte[] bytes2;
		try {
			//���ڵ�Ÿ��[���ڵ�/���ڵ� : ��ȯ���]
			
			//EUC-KR : �ѱ�/���� : �ѱ� 2����Ʈ
			bytes2 = str.getBytes("EUC-KR");
			System.out.println("EUC-KR ���� : "+bytes2.length);
			String str2=new String(bytes2,"EUC-KR");
			System.out.println("����Ʈ��->���ڿ� : "+str2);
			
			//UTF-8 : �������� :�ѱ� 3����Ʈ
			byte[] bytes3= str.getBytes("UTF-8");
			System.out.println("UTF-8 ���� : "+bytes3.length);
			String str3=new String(bytes3,"UTF-8");
			System.out.println("����Ʈ��->���ڿ� : "+str3);
			
		} catch (UnsupportedEncodingException e) {}
		
System.out.println("--------------------------");
		
		//p.504 indxOf() : ���� ��ġ[�ε���]ã��
		String subject ="�ڹ� ���α׷���";
		//���ڿ� �� Ư�����ڿ� ��ġ[�ε���]ã��
		int location=subject.indexOf("���α׷���");
		System.out.println(location); //3�� �ε������� ���α׷��� ã�� ����
		//���ڿ� �� Ư�����ڿ� ��ġ[�ε���]ã�� / �ε����� 0���� ����. ���࿡ ������ -1[����]
		if(subject.indexOf("�ڹ�")!=-1) {//�ε����� 0�� ����[-1 �ε����� ����]
			System.out.println("�ڹٿ� ���õ� å");
		}else {
			System.out.println("�ڹٿ� ���� ���� å");
		}
		
		System.out.println("--------------------------");
		//p.505 length() : ���ڿ��� ����
		String ssn2="7306241230123";//���ڿ� �� ���ڼ�[���̱��ϱ�]
		int length=ssn2.length();//���࿡ ���ڿ� �� 13���� �̸�
		if(length==13) {			
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� �ƴմϴ�.");
		}
		
System.out.println("--------------------------");
		//p.506 replace("��������","���ο��") : ���ڿ� ��ġ[����]
		String oldStr="�ڹٴ� ��ü������ �Դϴ�. �ڹٴ�ǳ���� API�� �����մϴ�.";
		String newStr=oldStr.replace("�ڹ�","Java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//p.507 substring() vs split() : ���ڿ� �ڸ���
		
		//substring - �ε�������
		String ss3="880815-1234567";
		String firstNum=ss3.substring(0,6);//0��°���� 6��°����
		System.out.println("Ȯ�� : "+firstNum);// 880815
		String secondNum=ss3.substring(7);//�ε���[~����������]
		System.out.println("Ȯ�� : "+secondNum);// 1234567
		//split - ���ڱ���
		System.out.println("�պκ� : "+ss3.split("-")[0]);
								// - �� �������� 0��° �ε���
		System.out.println("�޺κ� : "+ss3.split("-")[1]);
								// - �� �������� 1��° �ε���
System.out.println("--------------------------");		
		//p.510  valueOf( ) :�⺻Ÿ��[int, double ��]-> ���ڿ��� ��ȯ 
		String st2 =String.valueOf(10);//int�� 10->String 10���� ��ȯ
		String st3 =String.valueOf(10.5);//double 10.5 ->String 10.5���� ��ȯ
		String st4 =String.valueOf(true);//boolen�� true -> String�� true
//		String st5 =10; // int���� ->String ����������[�Ұ���]
		String st6 =10+""; // 10+���� ->String ����������[����]
		



		
		
	}
}


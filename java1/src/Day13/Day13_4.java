package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	public static void main(String[] args) throws InterruptedException {
		//DecimalFormatŬ����
			//0 : �ڸ��� [���ڸ��� 0���� ä��]
			//# : �ڸ��� [���ڸ���ä���]
		double num=1234567.89;
		DecimalFormat df=new DecimalFormat("0");// -> 1234568(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0.000"); //->1234567.890
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0000000000.00000"); //->0001234567.89000
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#");// -> 1234568(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#.#");// -> 1234567.9(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("########.####");// -> 1234567.89(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#.0");// -> 1234567.9(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("+#.0");// -> +1234567.9(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("-#.0");// -> -1234567.9(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#,###.0");// -> 1,234,567.9(�ݿø�)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0.0E0");// -> 1.2E6// E : ��������
		System.out.println(df.format(num));
		
		df= new DecimalFormat("+#,###;-#,###");// -> +1,234,568
		System.out.println(df.format(num));// ���;����
		
		df= new DecimalFormat("#.#%");// -> 123456789%
		System.out.println(df.format(num));//��ǻ�ʹ� ������� ��.
				//[���� 1:100%, 0.5:50% 0.05:5%]
		
		df= new DecimalFormat("#,###��");// 1,234,568��
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#,##0��");// 0��
		System.out.println(df.format(0));
		
		df= new DecimalFormat("0,000��");// 0,000��
		System.out.println(df.format(0));
		
		df= new DecimalFormat("\u00A4 #,###");// -> �� 1,234,568
		System.out.println(df.format(num));
		
		//MessageFormat
		String id ="�ڹ�";
		String name="�ſ��";
		String tel="010-1234-5678";//{ } ������ ���� ��ġ, 0���� ������.
		String text="ȸ�� ID : {0} \nȸ���̸� : {1} \nȸ�� ��ȭ : {2}";
		String result =MessageFormat.format(text,id,name,tel);
		System.out.println(result);		  //����  {0} {1} {2}	
		//�����ͺ��̽����� ����� ����
		String sql="insert infomember valuse({0},{1},{2})";
		Object[] �迭= {id,name,tel};
		String result2=MessageFormat.format(sql,�迭);
		System.out.println(result2);
		
		
		//JAVA 7���� ���� Date, ���Ŀ��� �������� ��¥ API�߰���
		LocalDate currDate=LocalDate.now();//��¥�� ����
		System.out.println("���糯¥ : "+currDate);
		
		LocalTime currTime=LocalTime.now();//�ð��� ����
		System.out.println("����ð� : "+currTime);
		
		//Date ���糯¥/�ð� [������ �ȵǰų� �񱳱�� �����]
		
		LocalDateTime currDateTime=LocalDateTime.now();
		System.out.println("���� �ð�/��¥ : "+currDateTime);
		
		LocalDateTime targetDateTime=LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("��ǥ ��¥�� �ð� : "+targetDateTime);
		
		//Ư�� ������ Ÿ�ӽ����� ���
		Instant instant1=Instant.now();
		Thread.sleep(1000);//1�� ���[�ڵ尡 1�ʰ� ����], �Ϲݿ���.(������)
		Instant instant2=Instant.now();//1�� ���� �� ����ð�
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");//1�ʰ� �ʾ����� 1�� �� ����
		}else if(instant1.isAfter(instant2)){
			System.out.println("instant1�� �ʽ��ϴ�.");
		}else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(nanos): "+instant1.until(instant2, ChronoUnit.NANOS));
				
	
		
				
				
	}

}

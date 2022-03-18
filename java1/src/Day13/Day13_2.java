package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {
	public static void main(String[] args) {
		//Date (java.util) : �ý��� ��¥/�ð�
		Date date=new Date();
		System.out.println("���� ��¥/�ð� :"+date);
		System.out.println("��ü�����޼ҵ� : "+date.toString());
		String strNow1=date.toString();
			//SimpleDateFormat Ŭ���� : ��¥/�ð� ����(����=���)��ȯ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		//��¥�� ���� �����ϱ�[Date����->String�������� ��ȯ]
		String strNow2=sdf.format(date);//���İ�ü.format(��¥��ü)
		System.out.println(strNow2);
				
		//calender Ŭ����: �ü�� �ð����� ��¥/�ð��� ���� ����
		Calendar now=Calendar.getInstance();//Calendar Ŭ���� �� ��üȣ��
				//�̹� Calendar Ŭ���� �� ��ü�� ������(������ ��ü����X new������.)
		System.out.println("���� : "+now.get(Calendar.YEAR));
		System.out.println("�� : "+(now.get(Calendar.MONTH)+1));//0~11����, 0=1��, 11=12��
		System.out.println("�� : "+now.get(Calendar.DAY_OF_MONTH));//��
		System.out.println("���� : "+now.get(Calendar.DAY_OF_WEEK) );//����
							//1:��, 2:��, 3:ȭ, 4:��, 5:��, 6:��, 7:��
		int week=now.get(Calendar.DAY_OF_WEEK);
		String ����=null;//�ѱ� ������ ������ ���� ����� ����
		switch(week){
			case 1 : ����="�Ͽ���";break;
			case 2 : ����="������";break;
			case 3 : ����="ȭ����";break;
			case 4 : ����="������";break;
			case 5 : ����="�����";break;
			case 6 : ����="�ݿ���";break;
			case 7 : ����="�����";break;
		}
		System.out.println("����[�ѱ�] : "+����);
		
		// ����/����
		System.out.println("����/���� : "+now.get(Calendar.AM_PM));//0�̸� ����, 1�̸� ����
		int ampm=now.get(Calendar.AM_PM);
		String ��������=null;
		if(ampm==0)��������="����";
		else ��������="����";
		System.out.println("����/���� : "+��������);
				
		//�ð�
		System.out.println("�� : "+now.get(Calendar.HOUR));
		System.out.println("�� : "+now.get(Calendar.MINUTE));
		System.out.println("�� : "+now.get(Calendar.SECOND));
		
		ZonedDateTime ������=ZonedDateTime.now(ZoneId.of("UTC"));//UTC : ������
			System.out.println("������ : "+������);//�ѱ��� 9�ð� ������ -9 �ؾ���.
		������=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println("����ð� : "+������);
		������=ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println("����ð� : "+������);
		
		
		
			
	}

}

package Day05;

import java.util.Scanner;

public class Day05_3 { //c s
	public static void main(String[] args) {//m s
		
		//p.181
			//1.
			//2.
			//3.2: ��ü �񱳽�  equals �޼ҵ� ���
			//4.2: ���̰� ���� ��� �� ���� �Ұ���.
			//5.3: boolean �ʱⰪ��false
			//6.3, 5 : {1��}, {2��}, {3��} =>3
			//		   {78 83 93 87 88}=>5
			//7.
			int max=0;
			int[]array= {1,5,3,8,2};
			for(int i=0;i<array.length;i++) {
				//i��  0���� �迭�� ���̱��� 1�� ���� ���� �ݺ� ó��
				if(max<array[i]) max=array[i];
				//���࿡ max���� i��° �ε����� ���� �� ũ�� max��  i��°  �� �Է�
			}
			System.out.println("max : "+max);
			//8.
			int[][]array2= {
					{95,86},
					{83,92,96},	
					{78,83,93,87,88}
			};
			
			int sum=0; 		//�հ�
			double avg=0.0; //���
			
			int count =0;	//������ ����[ĭ����]
				//2���� �迭 �� ��� ������ȣ��
			for(int ��=0;��<array2.length;��++) {	//���� 0���� �迭�� �����[3]�̸����� 1�� ����
				for(int ��=0;��<array2[��].length;��++) {//���� 0���� �迭�� ������[2,3,5]�̸����� 1�� ����
					sum+=array2[��][��];//�����հ�
				}
				count +=array2[��].length;//�������� �����հ�
			}
			
			avg=(double)sum/count;
			
			System.out.println("sum: "+sum);
			System.out.println("avg: "+avg);
		
			
			//9.
			boolean run=true;
			int  studentNum=0;
			int[] scores=null;
			Scanner scanner=new Scanner(System.in);
			
			//while(true)
			while(run) {
				System.out.println("-----------------------------------");
				System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
				System.out.println("-----------------------------------");
				System.out.println("���� >");
				
				int selentNo=scanner.nextInt();
				if(selentNo==1) {
					System.out.println("�л���> "); studentNum=scanner.nextInt();
					//�Է¹��� �л� �� ��ŭ �迭���� ����
					scores=new int[studentNum];
				}
				else if(selentNo==2) {//�л� ���� �Է¹ޱ�
					for(int i=0;i<scores.length;i++) {//�迭 �� ��� �ε�����ŭ �ݺ�ó��
						System.out.printf("scores[%d] : ",i);
						scores[i]=scanner.nextInt();//�Է¹޾� i��° �ε����� ����
					}//for end
				}
				else if(selentNo==3) {
					for(int i=0;i<scores.length;i++) {//�л� ���� ����ϱ�
						System.out.printf("scores[%d] : %d\n",i,scores[i]);
					}
				}
				else if(selentNo==4) {
					int �ְ�����=0;
					int ���հ�=0;
					double �������=0.0;
					for(int i=0;i<scores.length;i++) {
						//�ְ����� ���ϱ�
						if(�ְ�����<scores[i])�ְ�����=scores[i];//i��° �ε����� ������ ����
						//�����հ�
						���հ� +=scores[i];
								
					}
					//����������ϱ�
					�������=(double)���հ�/scores.length;
					
					System.out.println("�ְ����� : "+�ְ�����);
					System.out.println("������� : "+�������);
				}
				else if(selentNo==5) {
					run=false;//break; �ݺ��� Ż��
				}//else if end
			}//while end
			System.out.println("���α׷� ����");
			
	}// m e

}//c e
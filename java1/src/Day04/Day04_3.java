package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {//c s
	public static void main(String[] args) {//m s
		//���������� ����.
			//1. ����ڿ��� ���� ���� �� �߿�  ����(���ڷ� �ޱ�)
			//2. ��ǻ�� ���� �߻�[0~2]
			//3. ����ڿ� ��ǻ�� �� �¸��� �Ǵ�
			//4. 3�� �����ϱ� ������ ���� ����
			//5. 3�� ���ý�
				//1. �� ���Ӽ�	��)3��
				//2. �����¸�		��)��ǻ��2 �����1
		
		 
		//�غ�
		int �÷��̾�;//����ڰ� ������  �� ����
		int ��ǻ��;//��ǻ�Ͱ������� ������ �� ����
		int ���Ӽ�=0;//�� ���������� ���� Ƚ��
		int ��ǻ�ͽ¸���=0; int �÷��̾�¸���=0;// ������ �¸� �� ����
		int ���=0;
		Scanner scanner=new Scanner(System.in);
		while(true) {//���α׷� ����[���ѷ��� ��������: 3�� �Է½ÿ�����(break)]
			System.out.println("-----��������������-----");
			System.out.println("����(0) ����(1) ��(2)      ����(3) ");
			�÷��̾�=scanner.nextInt();//�Է��� �� ����
			System.out.println("�÷��̾ �� �� : "+�÷��̾�);
			
			Random random = new Random();//���� ��ü ����
			��ǻ��=random.nextInt(3);//������ int������ ��������.
			
			//��������
			if( �÷��̾� == 3) {
				System.out.println(" �˸�)) �������� ");
				System.out.println(" �� ���� Ƚ�� : " + ���Ӽ� );
				if( �÷��̾�¸��� > ��ǻ�ͽ¸��� ) { System.out.println(" ���� �¸��� : �÷��̾�("+�÷��̾�¸���+")"); }
				else if( �÷��̾�¸��� < ��ǻ�ͽ¸��� ) { System.out.println(" ���� �¸��� : ��ǻ��("+��ǻ�ͽ¸���+")"); }
				else { System.out.println(" ���� �¸� : ���º� "); }
				
				break; // �ݺ��� ���� 
				
			}else if ( �÷��̾� >=0 && �÷��̾� <=2 ) { // �����Է� 
				// �¸� �Ǵ� 
				if( (�÷��̾�==0 && ��ǻ��==2) || (�÷��̾�==1&&��ǻ��==0) || (�÷��̾�==2&&��ǻ��==1)  ) { 
					// �÷�� �̱�� ����Ǽ�  // �÷��̾� �¸� ����Ǽ� [ 0 -> 2 / 1->0 / 2->1 ]
					System.err.println(" �˸�)) �÷��̾� �¸� ");
					�÷��̾�¸���++; // �¸��� ���� 
				}else if( (�÷��̾�==0 && ��ǻ��==0) || (�÷��̾�==1&&��ǻ��==1) || (�÷��̾�==2&&��ǻ��==2) ) { // ���� ����Ǽ� 
					System.err.println(" �˸�)) ���º� ");
				}
				else{ // �׿ܴ� ��ǻ�� �¸� 
					System.err.println(" �˸�)) ��ǻ�� �¸� ");
					��ǻ�ͽ¸���++; // �¸��� ���� 
				}
				// ���Ӽ� ���� 
				���Ӽ�++;
			}else {
				System.out.println(" �˸�)) �˼����� �ൿ�Դϴ�. ");
			}
			
		
		}//while end
		}//m e

}//c e
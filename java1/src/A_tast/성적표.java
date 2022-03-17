package A_tast;

import java.util.Scanner;

public class 성적표 {
	
	
	
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 학생[]stu=new 학생[100];
		
			while(true){
				try {
				System.out.println("---------------------------------------------------------------");
				System.out.println("                         성  적  표");
				System.out.println("---------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				int j=0;
				for(학생 temp:stu) {
					if(temp!=null) {
						int 총점 = stu[j].국어+stu[j].수학+stu[j].영어;
						double 평균=총점/3;
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d",stu[j].번호,stu[j].이름,stu[j].국어,stu[j].영어,stu[j].수학,총점,평균,j);
						System.out.println("");
					}j++;
				}
				System.out.println("메뉴 : 1.학생점수 등록 2.학생점수 삭제"); int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println(" 번호 : "); int 학생번호 = scanner.nextInt();
					System.out.println(" 이름 : "); String 이름2= scanner.next();
					System.out.println(" 국어 : "); int 국어 = scanner.nextInt();
					System.out.println(" 영어 : "); int 영어 = scanner.nextInt();
					System.out.println(" 수학 : "); int 수학 = scanner.nextInt();
					학생 학생=new 학생(이름2, 학생번호, 국어, 영어, 수학);
					for( int i=0;i<stu.length;i++) {
						if (stu[i]==null) {
							stu[i]=학생;break;	
						}i++;
					}
				}//1번 학생등록 end
				else if(ch==2) {
					System.out.println("삭제하실 이름을 입력하세요");
					System.out.println(" 이름 : "); String 이름2= scanner.next();
					for( int k=0;k<stu.length;k++) {
						if (k!=0&&stu[k].이름.equals(이름2)) {
							stu[k]=null;break;	
						}k++;
					}
				
					
				}//2번삭제 end
		
				}catch(Exception e){
					System.out.println("잘못된 입력입니다.");
					scanner =new Scanner(System.in);}
			}//while end
	
	}//m e
}//c e

package Day05;

import java.util.Scanner;

public class Day05_3 { //c s
	public static void main(String[] args) {//m s
		
		//p.181
			//1.
			//2.
			//3.2: 객체 비교시  equals 메소드 사용
			//4.2: 길이가 없을 경우 값 대입 불가함.
			//5.3: boolean 초기값은false
			//6.3, 5 : {1행}, {2행}, {3행} =>3
			//		   {78 83 93 87 88}=>5
			//7.
			int max=0;
			int[]array= {1,5,3,8,2};
			for(int i=0;i<array.length;i++) {
				//i는  0부터 배열의 길이까지 1씩 증가 실행 반복 처리
				if(max<array[i]) max=array[i];
				//만약에 max보다 i번째 인덱스의 값이 더 크면 max에  i번째  값 입력
			}
			System.out.println("max : "+max);
			//8.
			int[][]array2= {
					{95,86},
					{83,92,96},	
					{78,83,93,87,88}
			};
			
			int sum=0; 		//합계
			double avg=0.0; //평균
			
			int count =0;	//점수의 갯수[칸갯수]
				//2차원 배열 내 모든 데이터호출
			for(int 행=0;행<array2.length;행++) {	//행은 0부터 배열의 행길이[3]미만까지 1씩 증가
				for(int 열=0;열<array2[행].length;열++) {//열은 0부터 배열의 열길이[2,3,5]미만까지 1씩 증가
					sum+=array2[행][열];//누적합계
				}
				count +=array2[행].length;//열길이의 누적합계
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
				System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
				System.out.println("-----------------------------------");
				System.out.println("선택 >");
				
				int selentNo=scanner.nextInt();
				if(selentNo==1) {
					System.out.println("학생수> "); studentNum=scanner.nextInt();
					//입력받은 학생 수 만큼 배열길이 선언
					scores=new int[studentNum];
				}
				else if(selentNo==2) {//학생 점수 입력받기
					for(int i=0;i<scores.length;i++) {//배열 내 모든 인덱스만큼 반복처리
						System.out.printf("scores[%d] : ",i);
						scores[i]=scanner.nextInt();//입력받아 i번째 인덱스에 저장
					}//for end
				}
				else if(selentNo==3) {
					for(int i=0;i<scores.length;i++) {//학생 점수 출력하기
						System.out.printf("scores[%d] : %d\n",i,scores[i]);
					}
				}
				else if(selentNo==4) {
					int 최고점수=0;
					int 총합계=0;
					double 평균점수=0.0;
					for(int i=0;i<scores.length;i++) {
						//최고점수 구하기
						if(최고점수<scores[i])최고점수=scores[i];//i번째 인덱스에 데이터 대입
						//누적합계
						총합계 +=scores[i];
								
					}
					//평균점수구하기
					평균점수=(double)총합계/scores.length;
					
					System.out.println("최고점수 : "+최고점수);
					System.out.println("평균점수 : "+평균점수);
				}
				else if(selentNo==5) {
					run=false;//break; 반복문 탈출
				}//else if end
			}//while end
			System.out.println("프로그램 종료");
			
	}// m e

}//c e
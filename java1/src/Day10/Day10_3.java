package Day10;

import java.util.ArrayList;

public class Day10_3 {
	//문법
	//1. 입출력 2.변수 3.연산자 4.제어문/반복문 5.배열 6.클래스 7.인터페이스
	public static void main(String[] args) {
		
		//배열vs리스트
		//배열[인덱스 0부터 저장]
		String[] 배열이름=new String[100];		
		System.out.println("배열 : "+배열이름);//메모리주소값
		배열이름[0]="유재석";
		System.out.println("배열[0] : "+배열이름[0]);
		System.out.println("길이 : "+배열이름.length);
		//리스트[클래스기반의 배열구조]
		ArrayList<String>리스트이름 =new ArrayList<>();
		//컬렉션[수집]프레임워크[만들어진 클래스]
		//ArrayList [자동완성]
		//<자료형> : 리스트에 저장할 자료형
		//리스트명  : 아무거나
		//new : 메모리할당[객체생성시필수]
		//ArrayList<>() :생성자
		System.out.println("리스트 : "+리스트이름);//메모리목록
		리스트이름.add("유재석");// 리스트명.add(객체명) :리스트에 객체추가 메소드
		System.out.println("리스트[0] : "+리스트이름.get(0)); //리스트명.get(인덱스) : 해당 인덱스의  객체 호출 메소드
		System.out.println("길이 : "+리스트이름.size());
		
		
		//배열 : 메모리 크기는 고정[메모리효율성 떨어짐]
			//회원배열 100명->만일100명이 초과하면 불가능
			//회원배열 100개->만일1명이면 나머지 99개  메모리 null
		//리스트: 메모리 크기는 가변길이[메모리 효율성]
			//회원리스트 100개->만일100명 초과하면 길이가 추가
		//		배열(문법)		vs	리스트(클래스)
		//		추가메소드x 	vs 	추가메소드o
		//추가 : 배열명[0]=값	vs	리스트명.add(값)
		//						리스트명.add(인덱스번호,값) : 특정위치에 삽입
		//호출 : 배열명[0]		vs	리스트명.get(0)
		//삭제 : null할당		vs	리스트명.remove(0)
		//		1 null 3	vs	1 3
		//길이 : 배열명.length	vs	리스트명.size()
		
		
		
	}//m e
}//c e

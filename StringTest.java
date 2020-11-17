package com.hhh.erp;

public class StringTest {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 10;
		
		System.out.print(a==b);
		// 기본형 데이터는 == 으로 비교 가능하다.
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//"Beatles"라는 문자열을 관리하는 String 객체 생성하고//메위주를 str4에 저장하
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


		String str4 = "Beatles";
		String str5 = "BEATLES";
		
		//스펠링이 달라서 false 가 아니라 객체의 메위주가 달라서 false다.
		
		// 꼭 다음 아래와같이 비교해야된다.
		System.out.println("str4 == str5 => " + (str4==str5));
		System.out.println("str4.equals(str5)str5 => " + str4.equals(str5));

		//스펠링만 비교
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//String 객체의 equalsIgnoreCase 메소드를 사용하
		// 문자의 스펠링이 같으면 true, 다르면 false를 리턴하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("str4equalsIgnoreCase(str5) => " + str4.equalsIgnoreCase(str5));

		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//"This is a love"라는 문자열을 관리하는 String 객체 생성하고
		//메위주를 str에 저장하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		String str = "This is a love";
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// String 객체의 charAt(인덱스번호)를 메소드를 호출하여
		// 인덱스번호에 해당하는 문자를 복사하여 char형으로 리턴하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println( "str.charAt(5) => " + str.charAt(5));
		// charAt 의 리턴값은 String이 아니라 char형이다.
	
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// String 객체의 concat("붙일문자") 메소드를 호출하여
		// String 객체의 문자와 "붙일문자" 붙여 리턴하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 이해안된다 *****
		System.out.println( "str.concat(\"girl\") => " + str.concat(" girl"));
		System.out.println( "str + \"girl\" => " + (str + " girl"));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

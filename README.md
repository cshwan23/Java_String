# Java_String
String 객체 메소드 기능

문제) 자바에서 제일 많이 사용하는 자료형은 뭐에요?

> String 형이다.(문자를 관리하는 자료형)
 
 
String 클래스 객체화 하는 방법(두가지, String 객체의 이중성)
 
1. String 객참변수 = new String("문자열");
> 원래 fm대로라면 new + 생성자 안에 문자열을 집어넣어야 한다.
 
2.String 객참변수 = "문자열";
> 마치 기본형처럼 생겼지만 실제론 String 객체 안에 메위주가 들어가있는거다.
> 그 메위주는 문자열(손오공)을 관리하고있다.
>1차형 배열객체 char 형으로 문자를 쪼개서 관리하고있다. 
 
 
계속 증가되서 메모리 낭비 초래 스트링 객체 사용시 연결연산자로 데이터 누적할때 정말 누적되는게 아니라 계속 스트링객체가 생성된다. 메모리 낭비가 심하다 쓰긴 편하지만 메모리 낭비가 심하다. 솔루션 회사 -> 메모리 낭비가 심해서 잘 안쓴다.. 웹개발은 그냥 쓰고 나온다. 개발하고 빠질건데. 최대의 목적은 소스의 결과물이니 효율적이니. 카피해서 커스터마이징 하는게 낫나 새로 만드는게 낫나 절대 빠를 수가 없다. 새로만들면. 
 
 

 
public char charAt ( int n )

String s = "최승환"
=> 리턴값은 char 형 (괄호 안에 정수)
System.out.print(s.charAt(0)); -> "최"
 
 
 
public boolean contains( String s )

System.out.print(s.contains("승")); -> true(포함하고있으면 )// false(포함하고있지않으면)
 
 
public boolean endsWith( String s )

System.out.print(s.endsWith("환")); -> true (끝글자로 끝나면) // 아니면 false.
 
 
 
 
 
 
String s1 = "사오정";
String s2 = "저팔계";
 
if (s1==s2){
(String 객체의 메위주를 비교하는거다)
System.out.print("수업끝");   <-- 문자가 같지 않은게 다른게아니라 메위주가 달라서 다른것. 
}
== 으로 비교하지말고 equals로 배교해라.
if ( s1.equals(s2) ) {

System.out.print("수업끝");
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
아래 코딩의 문제점을 찾으시오? 있는지 없는지?
Xxx x = new Xxx() ;

String s1 = x.getStr( );

if ( s1.equals("최승환") ) {

System.out.print("치킨피자");

}

getStr()가 리턴값이 null일수도 있다 null과 스트링객체를 비교할 수 없다.
에러가 나올 수 있다. 
-> S1이 null 이 아니라는 가정하에 실행해야한다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
이런식으로 바꿔야 한다.
Xxx x = new Xxx( );

String s1 = x.getStr( );

if ( s1 != null ) ) {

     if ( s1.equals("최승환") ) {

          System.out.print("치킨피자");

     }

}

특히 외부에 데이터가 들어왔는데 equals 를 쓰려면 메소드가 null인지 아닌지를
꼭 확인해야한다. 
모든객체에서 메소드를 호출할때 객체 생성여부를 확인하고 메소드 호출해라.
null이 아닌지.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 
public int indexOf( char c )

내가 찾고자 하는 문자 c가 처음으로 나타난 인덱스 번호. 를 반환.
 
String xxx = "최승환";
                      0 1  2
System.out.print(xxx.indexOf( "승" ));
 
System.out.print(xxx.indexOf( "승" )<0);
이면 승만 골라낼때 사용. 
 
예1)
if ( xxx.indexOf("최")>=0 ) {
System.out.print("음하핫");
} 찾고자하는 문자열이 존재하면 print 찍으라는 소리
 
if ( xxx.indexOf("최")<=0 ) {
System.out.print("음하핫");
} 찾고자하는 문자열이 안들어있면 print 찍으라는 소리
 
예2) 성이 최씨면? 이라는 조건을 주고싶다.
if (xxx.indexOf("최")==0) {
System.out.print("음하핫)

내가찾고자하는 문자열의 존재유뮤/ 혹은 인덱스번호를 찾을때 사용
 
String.xxx = "최승환";
 
xxx.length => return 값 =3
공백도 문자열 길이에 포함이된다 "최 승환"; 이면 리턴값 4다.
 
 
public String replace( String s1, String s2)

String.xxx = "최승환";
xxx.replace("최","김");   => 리턴값 = "김승환"
ex1)
String addr = "서울특별시 금천구 가산동 1004번지";
System.out.print(
     xxx.replace("서울특별시", 서울시")
);
원본에는 훼손이 없다.  "서울시 금천구 가산동 1004번지"로 바뀌겟지만.
addr 안에는 "서울특별시 금천구 가산동 1004번지";이 그대로 들어있다.
 
소유 문자열을 복사해서 문자열을 변환. ( 고쳐서 화면에 찍을 때 )
 
특정문자 검색
contains 
endwiths
indexof
lastindexof
 
public String[] split( String s )
 
공백기준으로 토막내면 되겠네
토막낸 데이터를 어디에 담냐 배열에 담겠다 이말.
String addr = "서울특별시  금천구  가산동  1004";
 
String[] arr = addr.split(" ");
 
리턴값이 배열객체이다 배열내부의 자료형이 String이다.
 
substring(in n)
 
xxx.substring()
시작 index번호 끝 다음번호.
 
1004 를 뽑아내고싶다 14 18
String addr = "서울특별시  금천구  가산동  1004";
 
 
public static String valueOf( 기본자료형 a)
System.out.print(
String.valueOf( 5)
);
이건 5가찍히지만 이건 문자다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
(복습-자습-교재내용)
<String 클래스의 메소드>
 
1. public char charAt (int n) 

> String 객체 소유 문자열에서
> index 번호 n번째 문자를 복사해 반환
> n은 0부터 시작.
 
2. public String concat( String s) 

> String 객체 소유 문자열을 복사해
> 문자열 s를 추가하여
> 새로운 String 객체를 반환
 
3. public boolean contains( String s)

> String 객체의 소유 문자열이
> 문자열 s를 포함하면
> true 반환. 아니면 false 반환
 
4, public boolean endsWith( String s)

> String 객체의 소유 문자열이
> 문자열 s로 끝나면
> true, 아니면 false를 반환
 
5. public boolean equals( String s)

> String 객체 소유 문자열과 문자열 s의 스펠링, 대소문자가 같으면 true를 반환
> 영문은 대소문자 구분함
> == 연산자는 객체의 위치 주소를 비교
> 최상위 클래스인 Object 클래스의 equals() 메소드는 객체의 위치 주소값을 비교
> null값인지 아닌지 확인하고 메소드 호출해야한다. null이면 비교 못함.
6. public boolean equalsIgnoreCase( String s)

> String 객체 소유 문자열과 문자열 s가 스펠링이 같으면 true를 반환
> 영문은 대소문자 구분 안함
> case는 대소문자를 의미 (IgnoreCase 대문자 무시)
 
7. public int indexOf( char c )

> indexOf (매개변수 하나일 때)
> String 객체 소유 문자열에서
> 문자 c 가 처음으로 나타난
> index 번호를 반환 ( 0부터 시작 )
 
8. public int indexOf( char c, int n )

> indexOf (매개변수 두개일 때)
> String 객체 소유 문자열에서
> index번호 n부터 검색해
> 문자 c가 처음으로 나타난
> index번호를 반환
 
9. public int indexOf( String s )

> String 객체 소유 문자열을
> 앞에서부터 검색하여
> 문자열 s 가 처음으로 나타난
> index번호를 반환
 
10. public int indexOf( String s, int n )

> String 객체 소유 문자열을
> index번호 n부터 검색하여
> 문자열 s가 처음으로 나타난
> index번호를 반환
 
11. public int lastIndexOf( char c )

> String 객체 소유문자열을
> 뒤에서부터 검색하여
> 문자 c가 처음으로 나타난 
> index번호를 반환
 
12. public int lastIndexOf( char c, int n)

> String 객체 소유 문자열을
> 뒤에서부터 index번호 n번째 부터 검색하여
> 문자 c가 처음으로 나타난
> index 번호를 반환
 
13. public int lastIndexOf( String s )

> String 객체 소유 문자열을
> 뒤에서부터 검색하여
> 문자열 s가 처음으로 나타난 
> index 번호를 반환
 
14. public int lastIndexOf( String s, int n)

> String 객체 소유 문자열을
> 뒤에서부터 index번호 n번째부터 검색하여
> 문자열 s 가 처음으로 나타난
> index 번호를 반환
 
15. public int length( )

> String 객체 소유 문자열의 길이( 문자의 개수 )를 반환
> 리턴값은 문자의 개수인데(int) 공백도 글자수에 포함된다.
> xxx = "  ";
> 길이가 없는 문자얼도 있다. 그때 length 는 0이다.
> xxx = "";
 
16. public String replace( String s1, String s2 )

> String 객체 소유 문자열을 복사해서 
> 모든 문자열 s1을 문자열 s2로 바꾸어서 반환
> 원본은 그대로 유지, 변환된값만 찍음.
 
17. public String replaceFirst( String s1, String s2)

> String 객체 소유 문자열을 복사해서
> 첫번째 s1 문자열만을 s2 문자열로 바꾸어서 반환.
 
18. public boolean startsWith( String s )

> String 객체 소유 문자열이
> 문자열 s로 시작하면
> true, 아니면 false로 반환
> indexOf 로 대체 가능
 
19. public String[] split( String s )

> String 객체 소유 문자열을 복사해서
> 문자열 s로 분리하여
> 배열 객체에 담아 배열로 반환
> 이 때 s 를 분리기호라고 함.
 
20. public String substring( int n )

> String 객체 소유 문자열에서
> index번호 n부터 끝까지의 문자열을 복사해서 반환
 
21. public Stiring substring( int m, int n )

>String 객체 소유 문자열에서
> index 번호 m 부터 순서번호 n까지의 문자열을 복사해 반환
> m = 시작 index번호
> n = 마지막 index 번호 다음번호
 
22. public String toString( )

> String 객체 소유 문자열을 반환
> 그대로 변환한다.
> 새로운 String 객체로 리턴해버리는 것
 
23. public String toLowerCase( )

> String 객체 소유 문자열을 복사하여
> 소문자로 변환하여 반환
 
24. public String toUpperCase( )

> String 객체 소유 문자열을 복사하여
> 대문자로 변환하여 변환
 
25. public String trim( )

> String 객체 소유 문자열을 복사하여
> 맨 앞뒤 공백을 제거하여 반환
 
26. public static String valueOf( 기본자료형 a )

> 매개변수로 전달되는 기본형 데이터를 문자열로 변환하여 반환
> 즉 기본 자료형을 String 객체로 만드는 메소드
> 어떤 자료형이든 모두 문자로 변환시켜 준다.
 
27. public int compareTo( String s )

> String 객체 소유 문자열의 1번째 문자열 아스키코드 값에서
> 매개변수로 전달되는 문자열 s의 1번째 문자열의 아스키코드 값을 뺀 값을 리턴
> 만약 1번째 문자의 아스키 코드 값이 서로 같으면 2번째 문자열을 서로 뺀다.
> String 객체 소유 문자열이 문자열 s보다 크면 양수, 작으면 음수, 같으면 0을 반환
> 문자의 높고 낮음을 compareTo 로 나누어 정렬
 
28. public int compareToIgnoreCase( String s )

> compareTo(~) 메소드에서 처럼 비교시 스펠링이 다르면 compareTo(~)메소드와 동일
> compareTo(~) 메소드와 다른 점은 대소문자 관계없이 스펠링이 같으면 0 반환
 
 
 
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

 
 
 
 
 
 
 
 
 

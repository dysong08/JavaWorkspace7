package com.kh.chap01_list.part01_arratList.run;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arratList.model.vo.Music;
import com.kh.chap01_list.part01_arratList.model.vo.MusicTitleAscendingCompartor;

public class Run {

	
//		컬렉션(Collection)
//		자료구조가 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 프레임워크다.
//		
//		자료구조  
//		: 방대한 데이터들을 효율적으로 다룰 때 필요한 개념을 클래스로 정의한 것
//		
//		프레임워크
//		: 효율적인 기능들이 이미 정의되어 있는 틀
//		
//		데이터들이 새롭게 추가되거나 삭제되거나, 수정이 되는 기능들이 이미 정의되어 있는 틀 == 컬렉션
//		==> 다량의 데이터들을 관리하고자 할 때 배열 가지고 충분히 사용을 할 수 있었지만 
//			배열이 가진 단점들을 보완한 것이 컬렉션
//		
//		==================================================
//		
//		배열과 컬렉션의 차이점
//		- 배열의 단점
//		1. 배열을 쓰고자 할 때 먼저 크기를 지정해야 함. 한 번 지정한 크기는 변경이 불가
//			만약, 크기보다 큰 새로운 값을 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 내용들을 옮겨주는 코드를 직접 짜야 했음.
//		2. 배열 중간위치에 새로운 데이터를 추가, 삭제하는 경우 기존의 값들을 땡겨주는 코드를 직접 짜야 함.
//		3. 한 타입의 데이터들만 저장 가능.
//		
//		- 컬렉션의 장점
//		1. 크기에 제약이 없다.
//			=> 크기지정 필요 없고, 크기지정을 해도 알아서 크기가 늘어나거나 줄어드는 코드가 내부에 정의되어 있음.
//		2. 중간의 값을 추가, 삭제하는 경우 값들을 땡겨주는 코드가 이미 내부에 정의되어 있음.
//		3. 여러 타입의 데이터들을 저장할 수 있음(단, 제네릭 설정을 통해 한 타입의 데이터들만 들어올수 있게끔도 가능함)
//		
//		================================================================
//		
//		배열 --> 방대한 데이터들을 단지 담아만 두고 조회만 할 목적.
//		컬렉션 -> 방대한 데이터들이 빈번하게 추가, 삭제, 수정될 것 같을 때.
//		
//		★ 컬렉션의 3가지 분류
//		
//		List 계열 : 1) 담고자 하는 값(value)만 저장하는 자료구조 
//				   2) 값을 저장할 때 순서가 유지된다( index 개념이 있음)
//	 			   3) 중복값을 허용한다. 
//		List계열 자식클래스 : ArrayList, Vector, LinkedList => ArrayList 가 자주쓰인다.
//
//		Set 계열 : 1) 담고자하는 값(value)만 저장하는 자료구조
//				  2) 값을 저장할 때 순서를 유지하지 않는다 (index 개념이 없음)
//				  3) 중복값을 허용하지 않는다.
//		Set계열 자식클래스 : HashSet, TreeSet
//		
//		Map 계열 : 1) 담고자하는 값(value)을 키(key)에다가 저장
//				  2) 값 저장시 순서를 유지하지 않는다(index 개념이 없음)
//				  3) value값 중복을 허용하나 key값 중복은 허용하지 않는다
//		Map계열 자식클래스 : HashMap, HashTable, Properties
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void main(String[] args) {	
		
		
		//List list = new ArrayList();	// 기본값으로 크기 10짜리인 배열이 생성됨
		
		//List list = new ArrayList(3); 	// 내부적으로 크기 3짜리인 배열이 생성됨
		
		//List<Music> list = new ArrayList<Music>(3);
		
//		제네릭 (<E>)
//		별도의 제네릭 제시 없이 컬렉션 객체를 생성하면, 해당 컬렉션에는 다양한 타입의 데이터값들이 담길 수 있음.
//		
//		별도의 제네릭 설정을 <Music>으로 하게 되면 해당 컬렉션에는 Music 객체만 담을 수 있음
//		
//		제네릭 설정하는 이유
//		1. 명시한 타입의 객체만 저장 가능하도록 타입의 제한을 두기 위해 -> 안정성 확보
//		2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환해야 하는 절차를 없애기 위해 
		
		
//		System.out.println(list);		// 안에 아무것도 없는 상태(비어있음) + toString override된 상태
		
		
//		1. add(E e) : 해당 리스트의 끝에 전달된 e를 추가시켜주는 매서드
//						순서가 유지되면서 값이 추가된다.
//						크기에 제약이 없음.
//						제네릭 설정을 하지 않는다면 다양한 타입의 값 추가 가능.
		
		
		List<Music> list = new ArrayList<Music>(3);	
		// 크기를 (3)으로 지정했지만 자동으로 늘어난다.
		
		list.add(new Music ("ditto" , "뉴진스"));
		list.add(new Music ("ETA" , "강진스"));
		list.add(new Music ("hype boy" , "이진스"));
		list.add(new Music ("고백" , "장범준"));
		
		
//		List list = new ArrayList(3); 
//		
//		list.add("끝");  -> <Music> 타입 객체를 사용하지 않아 error
//		list.add(111);  -> <Music> 타입 객체를 사용하지 않아 error
		
		System.out.println(list);	
		
		
		
//		2. add(int index, E e) : 리스트에 전달되는 index값 위치에 전달되는 e를 추가시켜주는 메서드
		
		list.add(1, new Music("this love" , "빅뱅"));	 	// 1번 index 위치에 new Music()으로 추가
//		중간에 값 추가시 알아서 기존의 값들을 뒤로 땡겨저는 작업이 내부적으로 진행됨
		
		System.out.println(list);	
		
		
		
//		3. set(int index, E e) : 리스트에 해당 인덱스 값을 전달되는 e로 변경시켜주는 메서드
		
		list.set(1, new Music("바다의 왕자", "박명수"));		// 1번 index 위치에 new Music()으로 변경
		
		System.out.println(list);
		
		
		
//		4. remove(int index) : 리스트에 해당 인덱스 값을 삭제시켜주는 메서드
		
//		list.remove(1);				// 1번 index 위치의 값을 삭제
		
		System.out.println(list);
		
		System.out.println(list.remove(1));	// 삭제한 1번 index값을 반환함
		
		
		
//		5. size() : 리스트에 담겨있는 데이터의 수를 반환해주는 메서드
		
		System.out.println("리스트에 담긴 데이터의 후 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 : " + (list.size()-1) );
		
		
//		6. get(int index) : E => 리스트에서 해당 index 위치의 데이터를 반환해주는 메서드
		
		
		System.out.println(list.get(1));
		
		Music m = (Music) list.get(1);
		System.out.println( ((Music)list.get(2)).getTitle());
		
//		자바 1.6버전부터 제네릭 자동 형변환이 지원됨!
		
//		========================================================
				
		//ArrayList<Music> Iarr = new ArrayList<Music>(3);		
		ArrayList<Integer> Iarr = new ArrayList<>(3);		// 우측에 객체<> 생략가능함 
		
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		
		
		
//		7. contains(E e) : boolean => 매개변수로 넘어온 값이 현재 컬렉션에 포함되어있는지 확인
				
		System.out.println(Iarr.contains(9));	// true
		System.out.println(Iarr.contains(90));	// false
		
		
		
//		8. indexOf(E e) : int => 매개변수로 넘어온 값이 현재 컬렉션에 몇번째 index위치인지 반환. 없으면 -1 반환
				
		System.out.println(Iarr.indexOf(9));	// 1 (번 index)
		System.out.println(Iarr.indexOf(900));	// 2 (번 index)
		System.out.println(Iarr.indexOf(90));	// -1
		
		System.out.println("========================================");
		
		
		// 베이직 for문
		// 0번 인덱스 ~ 마지막 인덱스까지의 데이터 출력
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(0));	// 0번째 index값을 출력함.
			System.out.println(list.get(i));	// i번째 index값을 출력함.
			
		}
		
		
		System.out.println("========================================");
				
				
		// 향상된 반복문 : for each문
		// for( 값을 받아줄 변수 : 순차적으로 접근할 배열 또는 컬렉션 )
		
		// 제네릭 설정 전.
		for( Object o : list ) {
			
		}
		
		
		// 제네릭 설정 후.
		for( Music o : list ) {
			System.out.println(o);
		}	
				
				
				
				
		// Iterator 반복자 : 컬렉션 내부 인자들을 Iterator에 담아서 관리(String의 StringTokenzier 비슷한 녀석)
		
		Iterator<Music> iter = list.iterator();		// 컬렉션은 iterator 객체로 변환
		
		while(iter.hasNext()) {			// .hasNext() 다음 값이 있는지 확인.
			Music music = iter.next();	// 있으면 다음 값을 music 인자에 넣어
			System.out.println(music);	// music값을 출력.
		}		
				
				
				
//		9. subList(int index1, int index2) : 해당 리스트로부터 index1에서 부터 index2까지의
//											데이터 값들을 추출해서 새로운 List로 반환시켜주는 메서드
				
		list.subList(0, 2);		// <-   0 <= index < 2
		
		List<Music> sub = list.subList(0, 2);
		
		System.out.println(sub);
				
				
		
//		10. addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 통째로 추가해주는 메서드
		
		list.addAll(sub);
		System.out.println(list);
		
	//================================================================================	
		
		
//		11. isEmpty() : 해당 리스트가 비어있는지 묻는 메서드(비어있으면 true, 아니면 false 반환)
		
		System.out.println("리스트가 비어있습니까? " + list.isEmpty());	// false
		
		
//		12. clear() : 해당 리스트를 싹 비워주는 메서드
		
		//list.clear();
		
		System.out.println(list);
		System.out.println("리스트가 비어있습니까? " + list.isEmpty()); 	// true
		
		System.out.println("===========================================");
		
		
//		13. sort(List list) :  	// 컬렉스 내부의 값들을 정렬시켜주는 함수
		
		List<String> strList = new ArrayList<>();
		
		strList.add("나경민");
		strList.add("가경민");
		strList.add("라경민");
		strList.add("다경민");
		
		
		Collections.sort(strList);
		// Collections 클래스의 정렬메서드 호출
		// 사전등록순으로 오름차순 정렬
		
		System.out.println(strList);
		
		System.out.println("===========================================");
		
		
		// 역순으로 정렬
		
		Comparator<String> comp = Collections.reverseOrder();
		
		Collections.sort(strList, comp);
		System.out.println(strList);
		
				
		
//		내가 직접 정의한 객체를 정렬하기ㅐ 위해서는 "정렬기준"을 새롭게 만들어줘야 함.
//		
//		객체 정렬방법 2가지
//		
//		1. comparable 인터페이스 구현
//			기본구현(한가지 방법만 가능) 을 클래스에서 구현
//			정렬시 사용하는 compareTo메서드를 오버라이딩하는 방식
//			-> 정렬기준을 한가지만 세울 수 있다.
//			
//		2. Comparator 인터페이스
//			객체의 기본정렬 외에 추가적으로 여러개의 정렬기준을 제시하고자 할때 사용
//			ex) 가수이름 오름차순, 음악제목 오름차순, 정렬을 각각 만들고 싶을때
//			별도의 Comparator구현 클래스를 작성하면 된다,
//			compare메서드 오버라이딩
			
		
		// 1번 Comparaeble 기본정렬 : 가수이름 오름차순
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		// 2번 가수이름 내림차순
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		// 추가적인 정렬기준 생성
		// 1. 제목기준 오름차순 / 내림차순
		
// ==	MusicTitleAscendingCompartor comp2 = new MusicTitleAscendingCompartor();
		Comparator<Music> comp2 = new MusicTitleAscendingCompartor();
		
		Collections.sort(list, comp2);
		
		System.out.println(list);
		
		
		//=============================================================
		
		// 반복문을 통해 컬렉션에 담긴 요소를 체크한 후 삭제하기.
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(5);
		
		System.out.println("========================");
		System.out.println(list2);
		
		
		// 컬렉션에 담긴 요소가 1이라면 삭제
		
//	1)	
//		while(true) {
//			if(list2.contains(1)) {			// 매개변수() 의 값이 1인지 확인
//				list2.remove(list2.indexOf(1));
//			}else {
//				break;
//			}
//		}
		

//	2)
			for(int i = 0; i < list2.size(); i++ ) {
				if(list2.get(i) == 1) {
					list2.remove(i); // 삭제되는 순간 list의 size가 1작아져서 바로 다음에 오는 객체를 검사하지 못함
					i--; 	//  <- 이것으로 해결가능
				}
			}
		
		
			
// 3) 가장좋은 방법 == Iterator 사용
			
			Iterator<Integer> iter2 = list2.iterator();
			while(iter2.hasNext()) {
				int s = iter2.next();
				if(s == 1) iter2.remove();	// 현재 참조하고 있는 collection요소들을 삭제햐쥼
				
			}
			System.out.println(list2);
			
			
			
			
			
			
		// 삭제완료 후 컬렉션에 저장된 데이터 출력
		
		
		
		
//		14. Collections.shuffle(List list);
			
		Collections.shuffle(list2);
		System.out.println(list2);
		System.out.println("=================================");
		
		// equals메서드 오버라이딩 후 Music객체 비교
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println("=================================");
		
		// == 연산자를 이용한 비교
		Music smaple = new Music("ditto", "뉴진스");
		System.out.println(smaple);
		System.out.println(list.get(2) == smaple);	 // false 주소값은 다름
		System.out.println(list2.get(2).equals(smaple)); // false 필드에 초기화된 값이 동일할 경우 같은 객체로 인식
		
		
	}

}

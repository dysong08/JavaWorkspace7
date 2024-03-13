package com.kh.chap03_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_hashMap.model.vo.Snack;

public class Run {
	public static void main(String[] args) {
		// 인터페이스 계층구조를 확인해봤을 때 List나 Set계열은 Collection인터페이스를 상속받고있음.
		// ex)데이터를 추가할때 전부 동일한 add메서드를 사용한다.
		
		// 단 , Map은 다르다. 데이터 추가시 put 메서드를 사용(key + value을 세트로 추가)
		// Map의 특징
		// key ,value을 한쌍으로 요소를 구성한다.
		// key를 통해서 value에 접근해 사용.
		// key는 중복을 허용하지 않는다. value는 중복되어도 좋다.
		
		// 동일한 key로 추가 저장하면, 마지막에 추가한 value로 치환된다.
		// 동일한 key값 여부는 hashCode() 반환값으로 판단한다.
		
		// Map<K, V> : V value값으로 Snack객체만을 저장하겠다 라고 선언.
		//             K key값으로 String자료형값만을 사용하겠다고 선언.
		Map<String, Snack> hm = new HashMap<>();
		hm.put("다이제", new Snack("초코맛",1000));
		hm.put("칸초", new Snack("초코맛",600));
		hm.put("포카칩", new Snack("짠맛",500));
		hm.put("새우깡", new Snack("짠맛",500));
		System.out.println(hm); // 저장순서 유지 x,  value값이 동일하다고 하더라도 key값만 중복되지 않는다면 문제 x
		
		// 1. hm.put(1, new Snack());
		//중복된 key값으로 저장시 value값은 마지막에 등록한 값으로 치환 된다.
		hm.put("새우깡", new Snack("짠맛", 400));
		
		System.out.println(hm);
		
		// 2. get(Object key) : V => 컬렉션에서 해당 키값의 value값을 돌려주는 메서드
		System.out.println(hm.get("다이제"));
		
		// 3. size() -> 컬렉션에 담겨있는 개수
		System.out.println("size : "+hm.size());
		
		// 4. replace(K key, V value) => 컬렉션에 해당 key값을 찾아서 새로 전달된 value으로 변경시켜주는 메서드
		hm.replace("포카칩", new Snack("트리플치즈", 1000));
		System.out.println(hm);
		
		// 5. remove(Object key) : 컬렉션에서 해당 key값을 찾아서 지워주는 메서드
		//hm.remove("새우깡");
		System.out.println(hm);
		
		System.out.println("===============================================================");
		// 순차적으로 HashMap에 담겨있는 값들에 접근하고자 할 때 ? 
		// 1. keySet() : key값들을 set에 담아서 반환. ["다이제","포카칩","칸초","새우깡"]
		// 2. entrySet() : key, value한쌍을 set에 담아서 반환 [ "다이제"=Snack, "포카칩"=Snacak   ]
		
		// 향상된 반복문 사용불가. => 향상된 반복문에는 배열 , Collecion인터페이스를 구현한 클래스만 들어올수 있음.
		// for( ?  : hm)
		
		// List와 Map은 서로 다른계열이기 때문에 ArrayList에 담아줄수가 없음.
		// new ArrayList(hm); xx
		
		// iterator()는 Collecion의 추상메서드이기 때문에 사용 불가.
		
		// 따라서 반복문을 돌리기 위해서는 keySet 혹은 entrySet을 통해 Set계열로 변환을 한후 반복을 해야함.
		// 1. keySet()을 이용하는 방법
		// 1) hashMap의 Key값들만 모아서 Set에 담아서 반환해준다.
		Set<String> keySet = hm.keySet(); // ["다이제","포카칩","칸초","새우깡"]
		
		// 2) 1번과정에서 작업된 keySet을 Iterator에 담기
		//    keySet.iterator()
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반복자에 담긴것들을 순차적으로 뽑기
		while(itKey.hasNext()) {
			String key = itKey.next(); // 다이제
			Snack value = hm.get(key);
			System.out.println("key : "+ key);
			System.out.println("value : "+value);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		// 2. entrySet() 이용하는 방법
		
		// 1) hm에 있는 key + value값을 모두 묶어서 Set에 담은 후 반환.
		Iterator itEntry = hm.entrySet().iterator();
		
		// 2) 반복문을활용해서 순차적으로 값을 출력.
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			System.out.println(  "key : "   + entry.getKey());
			System.out.println(  "value : " + entry.getValue());
		}
		
//		Map<Temp, String> temp = new HashMap<>();
//		temp.put(new Temp(1 , "다이제" ), "초코맛");
//		temp.put(new Temp(1 , "다이제" ), "초코맛");
//		System.out.println(temp);
	}
}

class Temp{
	private int key1;
	private String key2;
	
	public Temp() {
		
	}
	
	public Temp(int key1, String key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key1;
		result = prime * result + ((key2 == null) ? 0 : key2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (key1 != other.key1)
			return false;
		if (key2 == null) {
			if (other.key2 != null)
				return false;
		} else if (!key2.equals(other.key2))
			return false;
		return true;
	}
	
	
}

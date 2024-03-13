package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	
	private HashMap<String, Member> map = new HashMap<>();
	
	
	
	
	public boolean joinMembership(String id, Member m) {
		// 맵에 키와 값을 저장하여 회원가입하는 메소드
		
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환

		
		if(map.containsKey(id)) {
			return false;
		} 
			map.put(id, m);
			return true;
		}
		
//(==)	if(map.get(id) == null) {
//			map.put(id, m);
//			return true;
//		} 
//			return false;
		
		
		
	
	
	public String logIn (String id, String password) {
		// 로그인 하는 메소드
		
		// 전달 받은 id가 존재하는지 확인 후 존재하면 
		// Member에 저장된 비밀번호와 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환

		
		if(map.containsKey(id)) {		// 전달받은 id가 존재하는지 확인 후 존재하면
			Member user = map.get(id); 	 	// key(id)의 값인 member(pw, name) 객체반환
			
			String userPw = user.getPassword();	// user객체 내부에 초기화된 pw
			
			return userPw.equals(password) ? user.getName() : null;
				
			}
			return null;
		}  
		
		
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 비밀번호를 변경하는 메소드
		
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가 
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환

		
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}
		return false;
		}
		
		
//		if(map.containsKey(id)) {
//			Member user = map.get(id); 	
//			String userPw = user.getPassword();
//			
//			if(userPw.equals(oldPw)) {
//				userPw = newPw;
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	public void changeName(String id, String newName) {
		// 이름을 변경하는 메소드
		
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경

		
		map.get(id).setName(newName);
		
	}
	
	
	public TreeMap<String, String> sameName (String name) {
		// 같은 이름을 가진 사람들 뽑아내는 메소드
		
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것

		Set<String> s = map.keySet();
		TreeMap<String, String> tm = new TreeMap<>();
		
		for( String key : s) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key, name);
			}
		}
		return tm;
		
	}
	
	
	
	
	
	
	
	
	
}

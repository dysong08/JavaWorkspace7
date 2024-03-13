package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {

	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();

	public boolean addNewKind(Farm f, int amount) {
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환, 존재할 경우 false 반환.

		if (hMap.containsKey(f)) {
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}

	}

	public boolean removeKind(Farm f) {
		// 전달 받은 f가 hMap 안에 key로 존재할 때 hMap에 f 삭제 후 true 반환
		// 존재하지 않을 경우 false 반환

		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		} else {
			return false;
		}
	}

	public boolean changeAmount(Farm f, int amount) {
		// 전달 받은 f가 hMap 안에 key로 존재할 때 f와 amount 저장 후 true 반환
		// 존재하지 않을 경우 false 반환

		return hMap.replace(f, hMap.get(f), amount);
	}

	public HashMap<Farm, Integer> printFarm() {
		// 농산물 데이터가 들어가있는 컬렉션 반환

		return hMap;
	}

	public boolean buyFarm(Farm f) {
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 0개 이상일 때
		// list에 f 추가, 그리고 hMap에 f의 수량 1 감소 후 true 반환
		// 존재하지 않으면 false 반환

		if (hMap.containsKey(f) && hMap.get(f) >= 0) {
			list.add(f);
			int value = hMap.get(f);
			value -= 1;

			hMap.put(f, value);

			return true;
		}

		return false;
		
//	(==)	
//		Integer amount = hMap.get(f);
//		if(amount != null && amount > 0) {
//			list.add(f);
//			hMap.put(f, --amount);
//			return true;
//		}
//		return false;
		
		
	}

	public boolean removeFarm(Farm f) {
		// 전달 받은 f가 list에 존재할 때 list에 f 삭제, 그리고 hMap에 f 수량 1 증가
		// 위 경우일 때 true 반환, 아니면 false 반환

		if (list.contains(f)) {
			list.remove(f);
			int value = hMap.get(f);
			value += 1;
			hMap.put(f, value);
			return true;
		}
		return false;
		
//		int index = list.indexOf(f);
//		if(index == -1) {	// 
//			return false;
//		}
//		Farm farm = list.remove(index);
//		hMap.remove(farm, hMap.get(farm)+1);
//		return true;
	}

	public ArrayList<Farm> printBuyFarm() {
		// 농산물 구매 데이터가 들어가있는 컬렉션 반환
		return list;
	}

}
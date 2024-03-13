package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{

	
	
	
	
	public int compare(Object o1, Object o2) {
		// 이름 오름차순
		// 번호 오름차순
		
		int result = o1.getName().compareTo(o2.getName());
		if(result == 0) {
			result = o1.getPhone().compareTo(02.getPhone());
			
		}
		
		return result;
	}
	
	

}

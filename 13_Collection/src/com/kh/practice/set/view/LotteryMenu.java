package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
			
			
			
	public void mainMenu() {
		
		
	}
	
	
	public void insertObject() {
		
		
	}
	
	
	public void deleteObject() {
		
		
	}
	
	
	public void winObject() {
		// println 메소드를 이용하여 당첨 대상자를 출력하는 메소드

		// lc에서 받아온 Set객체를 println()메소드를 통해 출력
		
		System.out.println(lc.winObject());
	}
	
	
	public void sortedWinObject() {
		// lc에서 받아온 Set객체를 Iterator를 통해 출력
		
		Iterator<Lottery> iter = lc.sortedWinObject().iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	
	public void searchWinner() {
		// 당첨자 중 특정 대상이 있는지 결과를 출력하는 메소드
		
//		검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
//		객체에 정보를 담아 lc에 객체를 보냄.
//		받은 결과에 따라 true면 “축하합니다. 당첨 목록에 존재합니다.”,
//		false면 “안타깝지만 당첨 목록에 존재하지 않습니다.” 출력
		
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("번호 : ");
		String phone = sc.nextLine();
		
		
		boolean result = lc.searchWinner(new Lottery(name, phone));
		
		if(result) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
			
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
		
		
		
	}
	
	
	
	
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.kh.chap01_list.part01_arratList.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {

	private String title;
	private String artist;
	
	public Music() {
		
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	
	// equals에서 사용한 필드들을 똑같이 이용하여 hashCode를 생성해줘야 함
	public int hashcode() {
		return Objects.hash(title, artist);
	}
	
//	두 객체간에 필드값이 동일하다면 같은 객체로 인식할 수 있도록 override을 함.
//	
//	equals메서드를 오버라이딩한다면 항상 hashCode도 함께 오버라이딩 해야 한다.
//	두 객체간에 equals결과가 true라면(같은 필드값을 가진고 있다면) hashCode로 반환된 값도 동일해야 한다.
	
	
	@Override
	public boolean equals(Object o) {
	// Object o가 Music타입인지 타입검사
		
		// 현재객체 : this
		// 상대객체 : Object o
		
		
		if(! (o instanceof Music)) {
			return false;
		}
		
		Music other = (Music) o;
		
		if(this.title.equals(other.title)) {
			return false;
		}
		if(this.artist.equals(other.artist)) {
			return false;
		}
		
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		// 매개변수의 Music객체는 현재객체와 비교하고자 하는 객체
		
		// 현재객체 : this
		// 상대객체 : Music o
		
		// 반환값이 0:동등, 1:현재객체가 더 높다, -1:상대객체가 더 높다.
		
		// artist기준 오름차순 정렬
		
		
		return this.artist.compareTo(o.artist);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

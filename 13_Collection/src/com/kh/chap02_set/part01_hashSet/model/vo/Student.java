package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		//Student.equals(비교대상 Student객체)
//		if(!(obj instanceof Student)) {
//			return false;
//		}
//		
//		Student other = (Student) obj;
//		
//		// 3가지 필드값이 모두 동일한경우 동일한 객체로 판단할 예정.
//		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score)
//			return true;
//		
//		return false;
//	}
	
	// 객체의 주소값이 아닌, 필드값을 기준으로 해시코드를 만들어서 반환하도록 정의
//	@Override
//	public int hashCode() {
//		return (name+age+score).hashCode();
//	}
	
	
	
	
	
	
	
	
}

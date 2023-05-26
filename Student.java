package com.itwill01.method;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Student {
	/*
	 * #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 */

	Student std = new Student();

	/*
	 * << 속성(멤버변수) >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 << 기능(멤버메쏘드) >>
	 * 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언

	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;

	public void BaseData(int no, String name, int kor, int eng, int math) {
		//학생 데이타 메쏘드 
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	public void PrintMethod(int no, String name, int kor, int eng, int math) {
		// 학생 데이타 출력 메쏘드
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println(this.no+this.name+this.kor+this.eng+this.math);

	}

	// 총점
	int plus(int kor, int eng, int math) {
		int result = kor + eng + math;
		return result;

	}

	// 평균
	int avg(int kor, int eng, int math) {
		int result = (kor + eng + math) / 3;
		return result;
	}

	// 평점
	double grade() {
		if (avg > 90 && avg <= 100) {
			grade = 'A';
		}

		if (avg > 80 && avg <= 90) {
			grade = 'B';
		}

		if (avg > 70 && avg <= 80) {
			grade = 'C';
		}

		if (avg > 60 && avg <= 70) {
			grade = 'D';
		}

		if (avg > 0 && avg <= 60) {
			grade = 'E';
		}
		return grade;
	}

	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */

	/*
	 * 총점계산메쏘드
	 */

	/*
	 * 평균계산메쏘드
	 */

	/*
	 * 평점계산메쏘드
	 */

	/*
	 * 출력메쏘드
	 */

}

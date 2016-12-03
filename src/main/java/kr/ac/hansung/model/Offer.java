package kr.ac.hansung.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Offer {
	private int id;
	
	@DecimalMin(value = "2017", message="수강년도 : 2017년 이후의 값 입력")
	@Digits(integer=4, fraction = 0, message="Year must be 4 integer")
	private int year;
	
	@DecimalMin(value = "1", message="학기 : 1 또는 2를 입력하세요")
	@DecimalMax(value = "2", message="학기 : 1 또는 2를 입력하세요")
	@Digits(integer=1, fraction = 0, message="Semester must be 1 integer")
	private int semester;
	
	@NotEmpty(message="The subject code cannot be empty")
	private String code;
	
	@NotEmpty(message="The subject name cannot be empty")
	private String subject;
	
	@Size(min=2, max=2, message="Classify must be 2 chars")
	private String classify;
	
	@DecimalMin(value = "1", message="학점 : 1에서 3 사이의 값을 입력하세요")
	@DecimalMax(value = "3", message="학점 : 1에서 3 사이의 값을 입력하세요")
	@Digits(integer=1, fraction = 0, message="Credit must be 1 integer")
	private int credit;

	public Offer() {

	}

	public Offer(int id, int year, int semester, String code, String subject, String classify, int credit) {
		this.id = id;
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.subject = subject;
		this.classify = classify;
		this.credit = credit;
	}

	public Offer(int year, int semester, String code, String subject, String classify, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.subject = subject;
		this.classify = classify;
		this.credit = credit;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return (code + "  " + subject + "  " + classify + "  " + credit);
	}

}

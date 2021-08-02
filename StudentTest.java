package java08_1week_1;

public class StudentTest {
	public static void main(String[] args) {
		Student studentHan = new Student("한석봉");
		System.out.println("학생 이름 : "+ studentHan.studentName + " | 학생 번호 : " + studentHan.studentID
		+ " | 카드 번호 : " + studentHan.studentCard); 
		
		Student studentKim = new Student("김민석");
		System.out.println("학생 이름 : "+ studentKim.studentName + " | 학생 번호 : " + studentKim.studentID
		+ " | 카드 번호 : " + studentKim.studentCard);
		
		Student studentPack = new Student("박씨물어온제비");
		System.out.println("학생 이름 : "+ studentPack.studentName + " | 학생 번호 : " + studentPack.studentID
		+ " | 카드 번호 : " + studentPack.studentCard);

	}
}

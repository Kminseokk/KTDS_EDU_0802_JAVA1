package java08_1week_1;

public class StudentTest {
	public static void main(String[] args) {
		Student studentHan = new Student("�Ѽ���");
		System.out.println("�л� �̸� : "+ studentHan.studentName + " | �л� ��ȣ : " + studentHan.studentID
		+ " | ī�� ��ȣ : " + studentHan.studentCard); 
		
		Student studentKim = new Student("��μ�");
		System.out.println("�л� �̸� : "+ studentKim.studentName + " | �л� ��ȣ : " + studentKim.studentID
		+ " | ī�� ��ȣ : " + studentKim.studentCard);
		
		Student studentPack = new Student("�ھ����������");
		System.out.println("�л� �̸� : "+ studentPack.studentName + " | �л� ��ȣ : " + studentPack.studentID
		+ " | ī�� ��ȣ : " + studentPack.studentCard);

	}
}

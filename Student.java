package java08_1week_1;

public class Student {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int studentCard;
	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum++; //�л��� ������ �� ���� ����
		studentID = serialNum; //������ ���� �й� �ν��Ͻ��� �ο�	
		studentCard = studentID + 100;
	}
	

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}

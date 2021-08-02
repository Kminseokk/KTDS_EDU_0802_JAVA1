package java08_1week_1;

public class Student {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int studentCard;
	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum++; //학생이 생성될 때 마다 증가
		studentID = serialNum; //증가된 값을 학번 인스턴스에 부여	
		studentCard = studentID + 100;
	}
	

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}

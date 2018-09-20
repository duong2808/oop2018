package week1;

public class StudentManagement {

	private Student arrSv[] = new Student[100];

	private int ssv = 0;

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
	private void list(Student sv) {

		if (ssv > 100)
			System.out.println("so sing vien qua lon");

		else {

			arrSv[ssv] = sv;

			ssv++;

		}
	}
private void Showlist() {

		for (int j = 0; j < ssv; j++) {

			System.out.println(arrSv[j].getName() + " ");

		}

	}
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt

	return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
	boolean A[] = new boolean[ssv];

		for (int i = 0; i < ssv; i++) {

			A[i] = true;

		}

		for (int i = 0; i < ssv; i++) {

			if (A[i]) {

				System.out.print("Sinh vien thuoc lop " + arrSv[i].getGroup() + ": ");

				for (int j = 0; j < ssv; j++) {

					if (arrSv[j] == arrSv[j]) {

						System.out.print(arrSv[j].getName() + ", ");

						A[j] = false;

					}

				}

			}

		}
        // TODO:
    }

    void removeStudent(String id) {
	for (int i = 0; i < ssv; i++) {

			if (arrSv[i].getId().equals(id)) {

				for (int j = 0; j < ssv; j++) {

					arrSv[j] = arrSv[j + 1];

				}

			}

			ssv--;

	
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
	System.out.println("\n ");
		
		Student s1 = new Student();
		
		s1.setName("Cao Thi Thuy Duong");
		
		s1.setId("17020653");
		
		s1.setGroup("INT22025");
		
		s1.setEmail("caoduong939@gmail.com");
		
		s1.getInfo();
		
		System.out.println("\n ");

		Student s2 = new Student();
		
		s2.getInfo();
		
		System.out.println("\n ");

		Student s3 = new Student("Luu Thi Thu Hoai", "17020702", "hoaidien@gmail.com");
		
		s3.getInfo();
		
		System.out.println("\n ");

		Student s5 = new Student("Thu Huong", "17020655", "thuhuong10101@gmail.com");

		Student s4 = new Student(s2);
		
		s4.getInfo();
		
		
		
		StudentManagement Danhsach = new StudentManagement();

		Danhsach.sameGroup(s3, s4);
		
		System.out.println(" \n sinh vien so 3 va so 4 cung lop");
		
		System.out.println(Danhsach.sameGroup(s3, s4));
		
		Danhsach.sameGroup(s1, s4);
		
		System.out.println(" \n sinh vien so 1 va so 4 cung lop");
		
		System.out.println(Danhsach.sameGroup(s1, s4));
		

		Danhsach.list(s1);
		
		Danhsach.list(s2);
		
		Danhsach.list(s3);
		
		Danhsach.list(s5);
		
		System.out.println(" danh sach sinh vien khi chua xao");
		
		Danhsach.Showlist();

		Danhsach.removeStudent("17020655");

		System.out.println("Danh sach sv sau khi xoa: ");

		Danhsach.Showlist();

		Danhsach.studentsByGroup();

	}//TODO

    }
}

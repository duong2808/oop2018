﻿<<<<<<< HEAD
﻿package week1;
=======
package week1;
>>>>>>> parent of c569b75... update

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
<<<<<<< HEAD
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
=======
        // TODO:
    }

    void removeStudent(String id) {
>>>>>>> parent of c569b75... update
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

		}
	
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
    }
}

private String name, id, group, email;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
	id = "000";
	group = "INT22041";
	email = "uet@gmail.com";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
              // TODO:
	name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
	id = s.id;
	group = s.group;
	email = s.email;

    }

    String getInfo() {
        // TODO:
        System.out.println("name:" + name);
	System.out.println("id:" + id);
	System.out.println("group:" + group);
	System.out.println("email:" + email);
        return null; // xóa dòng này sau khi cài đặt
    }
}

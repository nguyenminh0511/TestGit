public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name, id, email, group;
    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
        //return this;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.email = s.email;
        this.group = s.group;
        this.id = s.id;
        //return this;
    }
    String getInfo() {
        // TODO:
        return name + " - " + id + " - " + group + " - " + email;
        //return null; // xoa dong nay sau khi cai dat
    }
}
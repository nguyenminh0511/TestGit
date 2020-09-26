public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    private Student[] students = new Student[100];
    private int n = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
        //return false; // xoa dong nay sau khi cai dat
    }

    public void addStudent(Student newStudent){
        // TODO:
        if(n < 100)
        {
            students[n] = newStudent;
            n++;
        }
    }


    public String studentsByGroup(){
        String ans = "";
        String checkGroup[] = new String[100];
        int recentGroup = 0;
        for(int i = 0 ; i < n ; ++i)
        {
            boolean check = false;
            for(int j = 0 ; j < n ; ++j)
            {
                if(students[i].getGroup().equals(checkGroup[j]))
                {
                    check = true;
                    break;
                }
            }
            if(!check)
            {
                ans = ans + students[i].getGroup() + "\n";
                for(int j = 0 ; j < n ; ++j)
                {
                    if(sameGroup(students[i], students[j]))
                    {
                        ans = ans + students[j].getInfo() + "\n";
                    }
                }
                checkGroup[recentGroup] = students[i].getGroup();
                recentGroup++;
            }
        }
        return ans;
    }

    public void removeStudent(String id) {
        // TODO;
        for(int i = 0; i < n ; ++i)
        {
            if(students[i].getId().equals(id))
            {
                for(int j = i ; j < n-1 ; ++j)
                {
                    students[j] = students[j+1];
                }
                n--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student();
        Student s2 = new Student("Nguyen Van B", "17020002", "1702002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "1702003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "1702004@vnu.edu.vn");

        //    System.out.println(s1.getInfo());

        s1.setName("Nguyen Van An");
        s1.setId("17020001");
        s1.setGroup("K62CC");
        s1.setEmail("17020001@vnu.edu.vn");
        s2.setGroup("K62CC");

        StudentManagement S = new StudentManagement();
        S.addStudent(s1);
        S.addStudent(s3);
        S.addStudent(s4);
        S.addStudent(s2);
        S.removeStudent("17020002");
        System.out.println(S.studentsByGroup());
    }


}
public class Student_Mahajan {
    private int id;
    private String firstName;
    private String lastName;
    public Student_Mahajan(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean equals(Student_Mahajan student1, Student_Mahajan student2) {
        return student1.getId() == student2.getId();
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

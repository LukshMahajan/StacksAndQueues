public class BathroomChallenge_Mahajan {
    public static void main(String[] args) {
        Bathroom_Mahajan bathroom1 = new Bathroom_Mahajan(3);
        Bathroom_Mahajan bathroom2 = new Bathroom_Mahajan(2);

        Student_Mahajan student1 = new Student_Mahajan(1, "James", "Washington");
        Student_Mahajan student2 = new Student_Mahajan(2, "David", "Monte");
        Student_Mahajan student3 = new Student_Mahajan(3, "Charlie", "Jackson");
        Student_Mahajan student4 = new Student_Mahajan(4, "Johnny", "Johnson");
        Student_Mahajan student5 = new Student_Mahajan(5, "Davis", "Davidson");
        Student_Mahajan student6 = new Student_Mahajan(6, "Rachel", "Bobson");
        Student_Mahajan student7 = new Student_Mahajan(7, "Chuck", "Gary");
        Student_Mahajan student8 = new Student_Mahajan(8, "John", "Smith");
        Student_Mahajan student9 = new Student_Mahajan(9, "John", "Doe");
        Student_Mahajan student10 = new Student_Mahajan(10, "Jane", "Doe");
        Student_Mahajan student11 = new Student_Mahajan(11, "Janette", "Reed");
        Student_Mahajan student12 = new Student_Mahajan(12, "Michele", "Mickey");

        bathroom1.addStudentToBathroom(student1);
        bathroom1.addStudentToBathroom(student2);
        bathroom1.addStudentToBathroom(student9);
        bathroom1.addStudentToBathroom(student8);
        bathroom1.addStudentToBathroom(student7);

        bathroom2.addStudentToBathroom(student11);
        bathroom2.addStudentToBathroom(student10);
        bathroom2.addStudentToBathroom(student6);
        bathroom2.addStudentToBathroom(student12);

        bathroom1.getInBathroom();
        bathroom2.getInBathroom();

        bathroom1.searchForStudent(student1);
        bathroom1.searchForStudent(student7);
        bathroom2.searchForStudent(student1);
        bathroom1.searchForStudent(student5);

        bathroom1.removeFromBathroom(student1);
        bathroom2.removeFromBathroom(student10);

        bathroom1.getInBathroom();

        bathroom1.test();
        bathroom2.test();

        bathroom1.clearData();

        bathroom1.test();

        bathroom1.setPeopleAllowed(15);
    }
}

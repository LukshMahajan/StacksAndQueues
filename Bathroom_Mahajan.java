import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.*;
public class Bathroom_Mahajan{
    private LinkedTransferQueue<Student_Mahajan> bathroomLine = new LinkedTransferQueue<Student_Mahajan>();
    private ArrayList<Student_Mahajan> inBathroom = new ArrayList<Student_Mahajan>();
    private ArrayList<Student_Mahajan> recentlyInBathroom = new ArrayList<Student_Mahajan>();
    private int peopleAllowed;
    public Bathroom_Mahajan(int peopleAllowed){
        this.peopleAllowed = peopleAllowed;
    }

    public void clearInBathroom(){
        inBathroom.clear();
    }
    public void clearBathroomLine(){
        bathroomLine.clear();
    }
    public void clearRecentlyInBathroom(){
        recentlyInBathroom.clear();
    }
    public void clearData(){
        clearInBathroom();
        clearBathroomLine();
        clearRecentlyInBathroom();
    }
    public int getPeopleAllowed(){
        return peopleAllowed;
    }
    public void setPeopleAllowed(int peopleAllowed){
        int diff = peopleAllowed - this.peopleAllowed;
        this.peopleAllowed = peopleAllowed;
        if (diff>0){
            int i = 0;
            while (!bathroomLine.isEmpty() && i < diff){
                inBathroom.add(bathroomLine.poll());
                i++;
            }
        }
    }
    public void getInBathroom(){
        inBathroom.trimToSize();
        if (inBathroom.isEmpty()){
            System.out.println("The bathroom is empty.");
        }
        else if (inBathroom.size() == 1){
            System.out.println("The person in the bathroom is: " + inBathroom.getFirst().getFirstName() + " " + inBathroom.getFirst().getLastName());
        } else if (inBathroom.size() == 2) {
            System.out.println("The people in the bathroom are: " + inBathroom.getFirst().getFirstName() + " " + inBathroom.getFirst().getLastName() + " and " + inBathroom.get(1).getFirstName() + " " + inBathroom.get(1).getLastName());

        } else{
            System.out.print("The people in the bathroom are: ");
            for (int i = 0; i < inBathroom.size() -1; i++){
                System.out.print(inBathroom.get(i).getFirstName() + " " + inBathroom.get(i).getLastName() + ", ");
            }
            System.out.println("and " + inBathroom.getLast().getFirstName() + " " + inBathroom.getLast().getLastName());
        }
    }
    public void addStudentToBathroom(Student_Mahajan student){
        if (recentlyInBathroom.contains(student)){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is not allowed in the bathroom as they went to the bathroom recently.");
            return;
        }
        if (inBathroom.size() < peopleAllowed){
            inBathroom.add(student);
        }
        else{
            bathroomLine.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " will have to wait in the bathroom line.");
        }
    }
    public void removeFromBathroom(Student_Mahajan student){
        if (!inBathroom.contains(student)){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is not in the bathroom.");
            return;
        }
        inBathroom.remove(student);
        recentlyInBathroom.add(student);
        if (!bathroomLine.isEmpty()){
            inBathroom.add(bathroomLine.poll());
        }
    }
    public int getBathroomLineLength(){
        return bathroomLine.size();
    }
    public void searchForStudent(Student_Mahajan student){
        if (inBathroom.contains(student)){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is in the bathroom.");
        }
        else if(bathroomLine.contains(student)){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is in the bathroom line.");
        }
        else if (recentlyInBathroom.contains(student)){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " was recently in the bathroom but has left.");
        }
        else{
            System.out.println(student.getFirstName() + " " + student.getLastName() + " not found");
        }
    }
    public void test(){
        return;
    }


}

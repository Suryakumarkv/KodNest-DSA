import java.util.Objects;

public class studentSet implements Comparable<studentSet>{

    int rollNo;
    String name;

    studentSet(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "studentSet{" + "rollNo=" + rollNo + ", name=" + name + '}';
    }

    //Compare current student with the student o and return integetr
    @Override
    public int compareTo(studentSet o) {
        return this.rollNo - o.rollNo;         //current roll no compare to
                                               //o student
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) return true;
//        if(obj == null || getClass() != obj.getClass()) return false;
//        studentSet other = (studentSet) obj;
//        return rollNo == other.rollNo;
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(rollNo);
//    }

}

package ComparatorImpl;

import java.util.Comparator;

public class ComparatorCls implements Comparator<Student> {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks() > o2.getMarks())
            return 1;
        else if(o1.getMarks() < o2.getMarks())
            return -1;
        else
            if(o1.getName().compareTo(o2.getName()) > 0)
                return 1;
            else
                return -1;
    }
}

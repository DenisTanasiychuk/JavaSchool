package HomeTask2.HT_2_2;

import java.util.Comparator;

public class LineComparator implements Comparator {


    @Override
    public int compare(Object line1, Object line2) {
        return line1.toString().length()-line2.toString().length();
    }
}

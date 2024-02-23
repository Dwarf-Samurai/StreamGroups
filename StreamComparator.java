package Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Groups> {
    @Override
    public int compare(Groups o1, Groups o2) {
        int resultComparator = o1.nameGroup.compareTo(o2.nameGroup);
        if (resultComparator == 0){
            return resultComparator = o1.direction.compareTo(o2.direction);
        } else {
            return resultComparator;
        }
    }
}

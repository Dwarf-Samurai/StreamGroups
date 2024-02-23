package Stream;

import java.util.Iterator;
import java.util.List;

public class StreamGroups implements Iterable<Groups>{
    public List<Groups> groupsList;

    public StreamGroups(List<Groups> groupsList) {
        this.groupsList = groupsList;
    }

    @Override
    public Iterator<Groups> iterator() {
        return new GroupsIterator(this);
    }
}

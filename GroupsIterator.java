package Stream;

import java.util.Iterator;
import java.util.List;

public class GroupsIterator implements Iterator<Groups> {

    private List<Groups> groupsList;
    int count = 0;

    public GroupsIterator(StreamGroups streamGroups) {
        this.groupsList = streamGroups.groupsList;
    }

    @Override
    public boolean hasNext() {
        return count < groupsList.size();
    }

    @Override
    public Groups next() {
        if (!hasNext()) {
            return null;
        }
        return groupsList.get(count);
    }

    @Override
    public void remove() {
        groupsList.remove(--count);
    }
}

package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    StreamGroups streamGroups;

    public StreamService(StreamGroups streamGroups) {
        this.streamGroups = streamGroups;
    }

    public List<Groups> getStreamService(){
        List<Groups> groupsList = new ArrayList<>(streamGroups.groupsList);
        Collections.sort(groupsList);
        return groupsList;
    }
    public void soutList(List<Groups> groupsList){
        for(Groups s : groupsList){
            System.out.println(s);
        }
    }
}

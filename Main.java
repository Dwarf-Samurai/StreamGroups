package Stream;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StreamGroups streamGroups = new StreamGroups(new ArrayList<>());
        streamGroups.groupsList.add(new Groups(1L, "Группа 1303", "Агрономы"));
        streamGroups.groupsList.add(new Groups(4L, "Группа 1308", "Биология"));
        streamGroups.groupsList.add(new Groups(3L, "Группа 1301", "Лесники"));
        streamGroups.groupsList.add(new Groups(2L, "Группа 1306", "Защита растений"));

        StreamService service = new StreamService(streamGroups);
        service.soutList(streamGroups.groupsList);
        System.out.println();
        service.soutList(service.getStreamService());
    }
}

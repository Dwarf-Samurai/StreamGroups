package Stream;

public class Groups implements Comparable<Groups> {
    public Long idGroup;
    public String nameGroup;
    public String direction;

    public Groups(Long idGroup, String nameGroup, String direction) {
        this.idGroup = idGroup;
        this.nameGroup = nameGroup;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Группы на потоке{" +
                "Ид группы = " + idGroup +
                ", Номер группы = '" + nameGroup + '\'' +
                ", Направление = '" + direction + '\'' +
                '}';
    }

    @Override
    public int compareTo(Groups o) {
        if (this.idGroup > o.idGroup)
            return 1;
        else if(this.idGroup < o.idGroup)
            return -1;
        else return 0;
    }
}

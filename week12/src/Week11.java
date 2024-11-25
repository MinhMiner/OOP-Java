import java.util.List;

public class Week11 {
    /** Sort a list of Comparable objects. */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}

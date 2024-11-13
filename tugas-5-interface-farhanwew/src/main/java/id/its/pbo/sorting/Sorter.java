package id.its.pbo.sorting;

public class Sorter {
    public static Sortable[] sortItems(Sortable[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i; j < items.length - 1 - i; j++) {
                if (items[j].compare(items[j + 1]) > 0) {
                   
                    Sortable temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }
}

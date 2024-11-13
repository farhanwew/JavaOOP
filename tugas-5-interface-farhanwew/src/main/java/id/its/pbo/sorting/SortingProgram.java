package id.its.pbo.sorting;

public class SortingProgram {

	public static void main(String[] args) {
		
        Buku buku1 = new Buku("Buku A", 100);
        Buku buku2 = new Buku("Buku B", 150);
        Sepatu sepatu1 = new Sepatu("Sepatu A", 42);
        Sepatu sepatu2 = new Sepatu("Sepatu B", 40);
        
        Sortable[] items = {buku2, buku1, sepatu2, sepatu1};
        Sortable[] sortedItems = Sorter.sortItems(items);
        
        for (Sortable item: sortedItems) {
        	System.out.println(item);
        }

	}

}

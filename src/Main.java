import sorting.*;

public class Main {
    public static void main(String[] args) {
        SortingInterface bubbleSort = new BubbleSort();
        SortingInterface insertionSort = new InsertionSort();
        SortingInterface quickSort = new QuickSort();
        SortingManager sortingManager = new SortingManager();
        sortingManager.sort(bubbleSort, "BubbleSort");
        sortingManager.sort(insertionSort, "InsertionSort");
        sortingManager.sort(quickSort, "QuickSort");
    }
}
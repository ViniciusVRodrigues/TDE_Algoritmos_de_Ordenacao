package sorting;

import report.ReportManager;

import java.util.Arrays;

public abstract class AbstractSort extends ReportManager implements SortingInterface {
    private int[] arr;
    private String sortName;
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        this.swapCount++;
    }

    @Override
    public void sort(int[] arr, String sortName) {
        this.swapCount = 0;
        this.arr = arr;
        this.sortName = sortName;
        startTimer();
        sortArray(this.arr);
        endTimer();
        print();
    }

    protected abstract void sortArray(int[] arr);

    public void print(){
        System.out.println(" ------ "+ this.sortName+" ------ ");
        report();
        System.out.println(" ------ ------ ------ ");
    }
}

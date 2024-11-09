package report;

public class ReportManager {
    protected int swapCount;
    private long startTime;
    private long endTime;
    protected long sortTime;

    public void startTimer() {
        this.startTime = System.nanoTime();
    }

    public void endTimer() {
        this.endTime = System.nanoTime();
        this.sortTime = this.endTime - this.startTime;
    }

    public void report() {
        System.out.println("Number of swaps: " + this.swapCount);
        System.out.println("Time taken to sort: " + this.sortTime + " ns");
    }
}

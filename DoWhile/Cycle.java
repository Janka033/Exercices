package DoWhile;

public class Cycle {
    public int start;
    public int finish;
    public void showCycle(){
        do {
            System.out.println(start);
            start++;
        }while (start<=finish);
    }
}

/**
 * Created by lanqingy on 6/4/17.
 */
public class SpeedTestAList {
    public static void main(String[] args) {
        AList test = new AList();
        int i = 0;
        while (i < 10000) {
            test.addLast(i);
            i += 1;
        }
    }
}

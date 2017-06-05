import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lanqingy on 6/4/17.
 */
class AListTest {
    @®Test
    public void getLast() throws Exception {
        AList lst = new AList();
        lst.addLast(1);
        lst.addLast(10);
        int expected = 10;
        int actual = lst.getLast();
        org.junit.Assert.assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        getLast();
    }

}
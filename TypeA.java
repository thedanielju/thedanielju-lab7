import java.util.Random;

public class TypeA extends Thing {
    public static Random rand = new Random(System.currentTimeMillis());

    public TypeA(int row, int col) {
        super(row, col, 'r');
    }
}

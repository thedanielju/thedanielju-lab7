import java.util.Random;

public class TypeB extends Thing {
    public static Random rand = new Random(System.currentTimeMillis());
    private int timeSinceLast;

    public TypeB(int row, int col) {
        super(row, col, 'r');
        this.timeSinceLast = 0;
    }

    @Override
    public void maybeTurn() {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) rightTurn();
            if (i == 2) leftTurn();
        }
    }

    private void rightTurn() {
        setDir((getDir() +1) % 4);
    }

    private void leftTurn() {
       setDir((getDir() + 3) % 4);
    }   

}

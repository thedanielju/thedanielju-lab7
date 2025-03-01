  /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   *
   * A STATIC CLASS? OH NO! GET IT OUT OF HERE!
   */
public class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    private int row, col, dir, timeSinceLast;
    private char lab = 'r';
    private boolean isTypeB; //might remove and keep in Type B

    public Thing(int row, int col, char lab, int timeSinceLast) {
        this.row = row;
        this.col = col;
        this.dir = 0; // default to North
        this.lab = lab;
        this.timeSinceLast = timeSinceLast;
    }

    //Getter methods

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getDir() {
        return dir;
    }

    public int getTimeSinceLast() { //probably going to be in just B
        return timeSinceLast;
    }

    public char getLabel() {
        return lab;
    }

    public boolean getIsTypeB() {
        return isTypeB;
    }

    // Setter methods
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setLabel(char lab) {
        this.lab = lab;
    }
    
    public void setDir(int dir) {
        this.dir = dir;
    }    

}

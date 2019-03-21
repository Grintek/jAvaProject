package KinghtMove;

import java.security.Signature;

public class ChessBorder {
  private int SIZE;

  int max = SIZE * SIZE;
// координаты хода коня
   // края доски
  private int left = 0;
  private int right = 0;
  private int top = 0;
  private int bottom = 0;


  int[][] bord;

  public ChessBorder(int SIZE){
      this.SIZE = SIZE;
      this.right = SIZE -1;
      this.bottom = SIZE - 1;
      bord = new int[SIZE][SIZE];
  }

    public void setSIZE(int SIZE)
    {
        this.SIZE = SIZE;
    }

    public int getSIZE() {
        return SIZE;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int[][] getBord() {
        return bord;
    }

    public void setBord(int[][] bord) {
        this.bord = bord;
    }

    public void border(int x, int y, int i){
          bord[x][y] = i;
  }
    //вывод доски в консоль
    void conclusion(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                System.out.format("%3d",bord[i][j]);
            }
            System.out.println();
        }
    }
}

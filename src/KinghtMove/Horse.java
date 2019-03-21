package KinghtMove;

public class Horse {

    private int y = 0;
    private int x = 0;



    public Horse(int SIZE){
//вписываем рандомные координаты где находится конь
        x = x + (int) (Math.random() * SIZE);
        y = y + (int) (Math.random() * SIZE);

    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void move(int left, int right, int top, int bottom, int[][] bord){
        //реализация хода коня, будет сравниваться с доской bord если данные кординаты = 0 то можно ходить, если нет то искать другой маршрут
        int x = this.x;
        int y = this.y;
        //выбираем координаты следующего шага коня


          if(x + 2 <= right){
              x += 2;
          }else if(x - 2 >= left){
              x -= 2;
          }
          if(y - 1 <=top && bord[x][y + 1] == 0){
            y += 1;
          }else if(y + 1 >= bottom && bord[x][y - 1] == 0){
            y -= 1;
          }


        if(y + 2 <= bottom){
            y += 2;
        }else if(y - 2 >= top){
            y -= 2;
        }
        if(x - 1 <=left && bord[x + 1][y] == 0){
            x += 1;
        }else if(x + 1 >= right && bord[x - 1][y] == 0){
            x -=1;
        }

        this.x = x;
        this.y = y;
    }
}

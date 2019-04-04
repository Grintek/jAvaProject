package KinghtMove;

public class Horse {

    private int y = 0;
    private int x = 0;
    private int left;
    private int right;
    private int top;
    private int bottom;
    int [][] bord;
    private int SIZE;



    public Horse(int SIZE, int left, int right, int top, int bottom, int[][] bord){
//вписываем рандомные координаты где находится конь
        x = x + (int) (Math.random() * SIZE);
        y = y + (int) (Math.random() * SIZE);

        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.bord = bord;
        this.SIZE = SIZE;

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

    public void move(){
        //реализация хода коня, будет сравниваться с доской bord если данные кординаты = 0 то можно ходить, если нет то искать другой маршрут
        int y = this.y;
        int x = this.x;
        //выбираем координаты следующего шага коня

        if (x + 2 <= right) {
            x += 2;
        } else if (x - 2 >= left) {
            x -= 2;
        }

        if (y - 1 >= top && bord[y - 1][x] == 0) {
            if(x != this.x)
                y -= 1;
        } else if (y + 1 <= bottom && bord[y + 1][x] == 0) {
            if(x != this.x)
                y += 1;
        }else{
            x = this.x;
        }


//            if (y + 2 <= bottom && bord[y + 2][x] == 0) {
//                y += 2;
//            } else if (y - 2 >= top && bord[y - 2][x] == 0) {
//                y -= 2;
//            }
//            if (x - 1 <= left && bord[x + 1][y] == 0) {
//                x += 1;
//            } else if (x + 1 >= right && bord[x - 1][y] == 0) {
//                x -= 1;
//            }
        this.y = y;
        this.x = x;

    }

    private int[] wayXright(int y, int x){
        int ys = 1;
        if (x + 2 <= right) {
            x += 2;
            return wayY(y, x, ys);
        }
        return null;
    }
    private int[] wayXrightUP(int y, int x){
        int ys = 2;
        if (x + 2 <= right) {
            x += 2;
            return wayY(y, x, ys);
        }
        return null;
    }

    private int[] wayXleft(int y, int x) {
        int ys = 1;
        if (x - 2 >= left) {
            x -= 2;
            return wayY(y, x, ys);
        }
        return null;
    }
    private int[] wayXleftUP(int y, int x) {
        int ys = 2;
        if (x - 2 >= left) {
            x -= 2;
            return wayY(y, x, ys);
        }
        return null;
    }
    ///////////////////////////////////////
    private int[] wayYtop(int y, int x){
        int ys = 1;
        if (y - 2 >= top){
            y -= 2;
            return wayX(y, x, ys);
        }
        return null;
    }
    private int[] wayYtopUP(int y, int x){
        int ys = 2;
        if (y - 2 >= top){
            y -= 2;
            return wayX(y, x, ys);
        }
        return null;
    }

    private int[] wayYbottom(int y, int x){
        int ys = 1;
        if (y + 2 <= bottom){
            y += 2;
            return wayX(y, x, ys);
        }
        return null;
    }
    private int[] wayYbottomUP(int y, int x){
        int ys = 2;
        if (y + 2 <= bottom){
            y += 2;
            return wayX(y, x, ys);
        }
        return null;
    }

    //метод получает "х" и проверяет "y" и добовляет их в массив, //
    private int[] wayY(int y, int x, int ys){                                    //
                                                                  //
                                                                  //
        int [] arr = new int[2];                                  //
                                                                  //
        if (y - 1 >= top && bord[y - 1][x] == 0 && ys == 1 && x != this.x) {

            y -= 1;
        } else if (y + 1 <= bottom && bord[y + 1][x] == 0 && ys == 2 && x != this.x) {

            y += 1;                                               //
        }else{                                                    //
            arr = null;                                           //
        }                                                         //
        if(arr != null) {                                         //
            arr[0] = y;                                           //
            arr[1] = x;                                           //
        }                                                         //
        return arr;                                               //
    }                                                             //
    //метод получает "y" и проверяет "x" и добовляет их в массив, //
    private int[] wayX(int y, int x, int ys){

        int [] arr = new int[2];

        if (x - 1 >= left && bord[y][x - 1] == 0 && ys == 1 && y != this.y) {

            x -= 1;
        } else if (x + 1 <= right && bord[y][x + 1] == 0 && ys == 2 && y != this.y) {

            x += 1;
        }else{
            arr = null;
        }
        if(arr != null) {
            arr[0] = y;
            arr[1] = x;
        }
        return arr;
    }

//финал поиска пути коня
    public int[] semiFinal(){
        int[] arr  = new int[8];
//ходы коня
        int[] xLeft = wayXleft(this.y, this.x);           //0
        int[] xLeftUp = wayXleftUP(this.y, this.x);       //1
        int[] xRight = wayXright(this.y, this.x);         //2
        int[] xRightUp = wayXrightUP(this.y, this.x);     //3
        int[] yTop = wayYtop(this.y, this.x);             //4
        int[] yTopUp = wayYtopUP(this.y, this.x);         //5
        int[] yBottom = wayYbottom(this.y, this.x);       //6
        int[] yBottomUp = wayYbottomUP(this.y, this.x);   //7
// смотрим куда может пойти конь
        if (xLeft != null){
            int size = 1;
            int y = xLeft[0];
            int x = xLeft[1];
            size = finSum(y, x, size); // подщет ходов куда может сходить конь
            arr[0] = size;
        }
        if (xLeftUp != null){
            int size = 1;
            int y = xLeftUp[0];
            int x = xLeftUp[1];
            size = finSum(y, x, size); // подщет ходов куда может сходить конь
            arr[1] = size;
        }
        if (xRight != null){
           int size = 1;
            int y = xRight[0];
            int x = xRight[1];
            size = finSum(y, x, size);
            arr[2] = size;
        }
        if (xRightUp != null){
           int size = 1;
            int y = xRightUp[0];
            int x = xRightUp[1];
            size = finSum(y, x, size);
            arr[3] = size;
        }
        if (yTop != null){
           int size = 1;
            int y = yTop[0];
            int x = yTop[1];
            size = finSum(y, x, size);
            arr[4] = size;
        }
        if (yTopUp != null){
           int size = 1;
            int y = yTopUp[0];
            int x = yTopUp[1];
            size = finSum(y, x, size);
            arr[5] = size;
        }
        if (yBottom != null){
           int size = 1;
            int y = yBottom[0];
            int x = yBottom[1];
            size = finSum(y, x, size);
            arr[6] = size;
        }
        if (yBottomUp != null){
           int size = 1;
            int y = yBottomUp[0];
            int x = yBottomUp[1];
            size = finSum(y, x, size);
            arr[7] = size;
        }
        int ar = SIZE;
        for( int a : arr){
            if(ar > a && a != 0)
            ar = a;
        }

        //////////////
        if(arr[0] == ar && ar != 0){
            assert xLeft != null;
            this.y = xLeft[0];
            this.x = xLeft[1];
        }else
            if(arr[1] == ar && ar != 0){
            assert xLeftUp != null;
            this.y = xLeftUp[0];
            this.x = xLeftUp[1];
        }else
            if(arr[2] == ar && ar != 0){
            assert xRight != null;
            this.y = xRight[0];
            this.x = xRight[1];
        }else
            if(arr[3] == ar && ar != 0){
            assert xRightUp != null;
            this.y = xRightUp[0];
            this.x = xRightUp[1];
        }else
            if(arr[4] == ar && ar != 0){
            assert yTop != null;
            this.y = yTop[0];
            this.x = yTop[1];
        }else
            if(arr[5] == ar && ar != 0){
            assert yTopUp != null;
            this.y = yTopUp[0];
            this.x = yTopUp[1];
        }else
            if(arr[6] == ar && ar != 0){
            assert yBottom != null;
            this.y = yBottom[0];
            this.x = yBottom[1];
        }else
            if(arr[7] == ar && ar != 0){
            assert yBottomUp != null;
            this.y = yBottomUp[0];
            this.x = yBottomUp[1];
        }
        return arr;
    }

    // подщет ходов куда может сходить конь
    private int finSum(int y, int x, int size){
        if(wayXleft(y, x) != null){
            size++;
        }
        if(wayXleftUP(y, x) != null){
            size++;
        }
        if(wayXright(y, x) != null){
            size++;
        }
        if(wayXrightUP(y, x) != null){
            size++;
        }
        if (wayYtop(y, x) != null){
            size++;
        }
        if (wayYtopUP(y, x) != null){
            size++;
        }
        if (wayYbottom(y, x) != null){
            size++;
        }
        if (wayYbottomUP(y, x) != null){
            size++;
        }
        return size;
    }

}

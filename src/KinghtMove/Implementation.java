package KinghtMove;

public class Implementation {
    public static void main(String[] args){
        // размер
        int SIZE = 4;
        int max = SIZE * SIZE;
        ChessBorder chessBorder = new ChessBorder(SIZE);
        chessBorder.setSIZE(SIZE);
        Horse horse = new Horse(SIZE);

        for(int i = 0; i < max; i++ ){
            horse.move(chessBorder.getLeft(), chessBorder.getRight(), chessBorder.getTop(), chessBorder.getBottom(), chessBorder.getBord());
            chessBorder.border(horse.getX(), horse.getY(), i + 1);
        }


        chessBorder.conclusion();
        System.out.println(horse.getX() + " " + horse.getY());

    }
}

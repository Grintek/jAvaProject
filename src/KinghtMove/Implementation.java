package KinghtMove;

public class Implementation {
    public static void main(String[] args){
        // размер
        int SIZE = 6;
        int max = SIZE * SIZE;
        ChessBorder chessBorder = new ChessBorder(SIZE);
        chessBorder.setSIZE(SIZE);
        Horse horse = new Horse(SIZE, chessBorder.getLeft(), chessBorder.getRight(), chessBorder.getTop(), chessBorder.getBottom(), chessBorder.getBord());

        for(int i = 0; i < max; i++ ){
            System.out.println("y: " + horse.getY() + "\n" + "x: " + horse.getX());

            chessBorder.border(horse.getX(), horse.getY(), i + 1);

//            horse.move();
            System.out.println();
            for (int j : horse.semiFinal()){
                System.out.println(j);
            }

            chessBorder.conclusion();
            System.out.println();
        }

    }
}

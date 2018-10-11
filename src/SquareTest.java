import java.util.ArrayList;

public class SquareTest {
    public static void main(String[] args) {
        ArrayList<Square> square = new ArrayList<>();
        Square square1 = new Square(2.3);
        Square square2 = new Square(5.8, "yellow", true);
        square.add(square1);
        square.add(square2);
        for (Square a : square){
            System.out.println(a);
            a.howToColor();
        }
    }
}
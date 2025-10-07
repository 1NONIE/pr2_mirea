package Pr2_2;

public class TestBall {

    public static void main(String[] args) {
        Ball ball1 = new Ball(1.0, 2.0);
        System.out.println(ball1);

        ball1.move(3.0, 4.0);
        System.out.println("После движения: " + ball1);

        ball1.setXY(0.0, 0.0);
        System.out.println("После setXY: " + ball1);
    }
}
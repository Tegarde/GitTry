package pt.upskill;
import java.util.Scanner;

    public class Point {
        private int x;
        private int y;



        public Point(int x, int y) {
            setX(x);
            setY(y);
        }

        public Point() {
            setX();
            setY();
        }


        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
        public void setY() {
            Scanner read= new Scanner(System.in);
            System.out.println("Enter Y coordinate: (int) ");
            this.y = read.nextInt();
        }

        public void setX(int x) {
            this.x = x;
        }
        public void setX() {
            Scanner read= new Scanner(System.in);
            System.out.println("Enter X coordinate: (int) ");
            this.x = read.nextInt();
        }

        @Override
        public boolean equals(Object p) {
            if (!(p instanceof Point point)) return false;
            return x == point.x && y == point.y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }


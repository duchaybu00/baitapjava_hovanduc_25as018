package ex63;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo một điểm MovablePoint tại tọa độ (0, 0) với tốc độ (5, 5)
        MovablePoint p1 = new MovablePoint(0, 0, 5, 10);
        System.out.println("Trạng thái ban đầu: " + p1);

        // Thử di chuyển lên trên và sang phải
        p1.moveUp();
        p1.moveRight();
        System.out.println("Sau khi moveUp và moveRight: " + p1);

        // Thử di chuyển xuống và sang trái
        p1.moveDown();
        p1.moveDown(); // di chuyển xuống 2 lần
        p1.moveLeft();
        System.out.println("Sau khi moveDown(x2) và moveLeft: " + p1);
    }
}

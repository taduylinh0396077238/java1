public class TestCircle {
    public static void main(String[] args) {
        // Khai báo một thể hiện của lớp Circle được gọi là c1.
        // Xây dựng thể hiện c1 bằng cách gọi hàm tạo "mặc định"
        // đặt bán kính và màu sắc của nó thành giá trị mặc định của chúng.
        Circle c1 = new Circle();
        // Gọi các phương thức công khai trên cá thể c1, thông qua toán tử dot.
        System.out.println("The circle has radius of" + c1.getRadius() + " and area of " + c1.getArea());

        // Khai báo một thể hiện của class circle có tên là c2.
        // Xây dựng thể hiện c2 bằng cách gọi hàm tạo thứ hai
        // với bán kính và màu mặc định đã cho.
        Circle c2 = new Circle(2.0);

        // Gọi các phương thức công khai trên cá thể c2, thông qua toán tử dot.
        System.out.println("The circle has radius of" + c2.getRadius() + " and area of " + c2.getArea());
    }
}

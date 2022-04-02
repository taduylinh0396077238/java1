public class Circle {
        private double radius;
        private String color;
        //constructor
        public Circle(){
            radius = 1.0;
            color = "red";
        }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //constructor
        public Circle(double r) {
            radius = r;
            color= "red";
        }

    // Một phương thức công khai để truy xuất bán kính
        public double getRadius() {
            return radius;
        } // phương thức

        // Một phương thức công khai để tính diện tích hình tròn
        public double getArea(){
            return radius*radius*Math.PI;
        }

    public static void main(String[] args) {
        Circle ht = new Circle(2.0);
        System.out.println(ht.getRadius());
        System.out.println(ht);
    }
}

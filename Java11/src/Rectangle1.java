public class Rectangle1 {
    private float width;
    private float length;

    public Rectangle1(){
        width = 1.0f;
        length = 1.0f;
    }
    public Rectangle1(float width, float length){
        this.width = width;
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }
    public double getArea(){
        return length*width;
    }
    public double getHalf(){
        return length+width;
    }
    public double getPerimetere(){
        return 2*this.getHalf();
    }

    @Override
    public String toString() {
        return "Rectangle1[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
    //toString trả về 1 chuỗi mô ta về đối tượng khi ta in ra đối tượng chuỗi mô ta đối tượng trả về giá trị mà ta mong muốn

    public static void main(String[] args) {
        Rectangle1 hcn1 = new Rectangle1();
        System.out.println(hcn1.getHalf());
        System.out.println(hcn1.getPerimetere());
    }
}

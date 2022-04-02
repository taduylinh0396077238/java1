import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Rectangle {
        private float width;
        private float length;


         public Rectangle(){
                 width = 1.0f;
                 length = 1.0f;
         }
    public Rectangle(float width, float length){
        this.width= width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea() {
       return width*length;
    }
    public float getPerimeter(){
             return 2*(width+length);
    }


    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(2.7f,3.2f);
        System.out.println("dien tich là :" + hcn1.getArea());
        System.out.printf("chu vi la: " + hcn1.getPerimeter());
    }
}

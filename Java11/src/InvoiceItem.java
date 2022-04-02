public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;


    public InvoiceItem(){
        id = "10";
        desc = "Linh ";
        qty = 10;
        unitPrice = 100;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }

    public static void main(String[] args) {
        InvoiceItem Vd1 = new InvoiceItem();
        System.out.println("Id = " + Vd1.id);
        System.out.println("desc = " + Vd1.desc);
        System.out.println("qty = " + Vd1.qty);
        System.out.println("unitPrice = " + Vd1.unitPrice);
    }

}


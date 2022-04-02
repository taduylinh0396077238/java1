public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day,int month,int year) {
        this.day = day;
        this.year=year;
        this.month=month;
    }

    @Override
    public String toString() {
        return "Date[" +
                "day=" + day + '/' +
                ", month=" + month + "/" +
                ", year=" + year + "/" +
                ']';
    }

    public static void main(String[] args) {
        Date Lich = new Date(1, 4, 2022);
        System.out.printf("" + Lich.day);
        System.out.printf("/" + Lich.month);
        System.out.printf("/" + Lich.year);

    }
}

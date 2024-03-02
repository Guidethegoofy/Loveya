public class Data {
    private int month;
    private int day;
    private int year;
    public Data(int m,int d,int y){
        if(m>=1&&m<=12){
            month = m;
        }else{
            month = 1;
        }
        if(d>=1&&d<=31&&m!=2){
            day=d;
        }else if(m==2 && d>=1 && d<=29){
            day =d;
        }else{
            day=1;
        }
        if(y>=1900&&y<=2013){
            year=y;
        }else{
            y=1900;
        }
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
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void displayeDate(){
        System.out.printf("%d/%d/%d",day,month,year);
    }
    

}

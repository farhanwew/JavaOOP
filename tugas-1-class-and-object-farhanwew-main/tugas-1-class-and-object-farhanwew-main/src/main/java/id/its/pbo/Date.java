package id.its.pbo;

public class Date {
    
    //  variabel instance
    private int month;
    private int day;
    private  int year;

    // membuat constructor
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // setter month
    public void setMonth(int month){
        if (month<= 12 && month >= 1){
            this.month = month;
        }
        else{
            this.month = 1;
        }
    }
    
    // getter month
    public int getMonth(){
        if (this.month<= 12 && month >= 1){
            return this.month;
        }
        else{
            return 1;
        }
    }
    
    // mengecek tahun kabisat
    public boolean checkLeapYear(){
        return this.year % 4 == 0 & this.year % 100 != 0 | this.year % 400 == 0;
    }

    // setter day
    public void setDay(int day){
        if (day < 1 || day >31){
            this.day = 1;
        }
        else{
            if (this.month == 2){
                if (day>29){
                this.day =  1;
                }
                else{
                    if (day == 29 && !this.checkLeapYear()){
                        this.day = 1;
                    }
                    else{
                        this.day = day;
                    }
                }
            }
            else{
                if (day == 31 && (this.month == 4 || this.month == 6 ||this.month == 9 || this.month == 1)){
                    this.day = 1;
                }
                else{
                    this.day = day;
                }
            }
        }
    }
    
    // getter day
    public int getDay() {
        if (this.day < 1 || this.day > 31) {
            return 1;
        }
    
        if (this.month == 2) {
            if (this.day == 29 && !this.checkLeapYear()) {
                return 1;
            } else if (this.day > 28 && !this.checkLeapYear()) {
                return 1;
            }
        }
    
        if ((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && this.day == 31) {
            return 1;
        }
    
        return this.day;
    }
    

    // setter year
    public void setYear(int year){
        if (this.year < 0){
            this.year = 0;
        }
        else{
            this.year = year;
        }
    }

    // getter year
    public int getYear(){
        if (this.year > 0 ){
            return this.year;
        }
        else{
            return 0;
        }
    }

    //  menampilkan string date
    public String displayDate(){
        return this.month + "/" +  this.day + "/"+  this.year;
    }
}

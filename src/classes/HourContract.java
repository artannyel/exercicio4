package classes;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private Integer hour;

    public HourContract() {
        this.date = new Date();
        this.valuePerHour = 0;
        this.hour = 0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    
}

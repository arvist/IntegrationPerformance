package lv.lu.df.java.integration.model.dto;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class Serie {

    @Id
    @GeneratedValue
    private int seriesId;
    @Column
    private float min;
    @Column
    private float max;
    @Column
    private float average;
    @Column
    private Date date;
    @Column
    private int companyId;

    public Serie(float min, float max, float average, Date date) {
        this.min = min;
        this.max = max;
        this.average = average;
        this.date = date;
    }

    public Serie() {
    }


    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "min=" + min +
                ", max=" + max +
                ", average=" + average +
                ", date=" + date +
                '}';
    }
}

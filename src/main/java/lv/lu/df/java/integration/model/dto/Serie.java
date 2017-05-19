package lv.lu.df.java.integration.model.dto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table
public class Serie {

    @Id
    @GeneratedValue
    private Integer seriesId;
    @Column
    private BigDecimal min;
    @Column
    private BigDecimal max;
    @Column
    private BigDecimal average;
    @Column
    private Date date;
    @Column
    private Integer companyId;

    public Serie(BigDecimal min, BigDecimal max, BigDecimal average, Date date) {
        this.min = min;
        this.max = max;
        this.average = average;
        this.date = date;
    }

    public Serie() {
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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

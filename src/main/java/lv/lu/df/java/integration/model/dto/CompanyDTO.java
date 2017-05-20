package lv.lu.df.java.integration.model.dto;


import javax.persistence.*;
import java.util.List;

@Table
@Entity(name = "CompanyDTO")
public class CompanyDTO {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Transient
    private List<Serie> series;
    @Column
    private String symbol;
    @Column
    private boolean isActive;
    @Transient
    private boolean isActiveSet = false;

    public CompanyDTO() {
    }

    public CompanyDTO(String name, List<Serie> series, String symbol, boolean isActive) {
        this.name = name;
        this.series = series;
        this.symbol = symbol;
        this.isActive = isActive;
        this.isActiveSet = true;
    }

    public CompanyDTO(String name, List<Serie> series, String symbol) {
        this.name = name;
        this.series = series;
        this.symbol = symbol;
        this.isActiveSet = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
        isActiveSet = true;
    }

    public boolean isActiveSet() { return isActiveSet; }

    public void setActiveSet(boolean activeSet) { isActiveSet = activeSet; }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", symbol='" + symbol + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

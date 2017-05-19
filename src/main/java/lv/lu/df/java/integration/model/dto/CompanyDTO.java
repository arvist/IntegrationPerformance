package lv.lu.df.java.integration.model.dto;


import javax.persistence.*;
import java.util.List;

@Table
@Entity(name = "CompanyDTO")
public class CompanyDTO {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Transient
    private List<Serie> series;
    @Column
    private String symbol;
    @Column
    private Boolean isActive;

    public CompanyDTO() {
    }

    public CompanyDTO(String name, List<Serie> series, String symbol, Boolean isActive) {
        this.name = name;
        this.series = series;
        this.symbol = symbol;
        this.isActive = isActive;
    }

    public CompanyDTO(String name, List<Serie> series, String symbol) {
        this.name = name;
        this.series = series;
        this.symbol = symbol;
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

    public Boolean getActive() { return isActive; }

    public void setActive(Boolean active) { isActive = active; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

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

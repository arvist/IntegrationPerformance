package lv.lu.df.java.integration.model.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected         content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Series"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="close"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="values"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="high"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="values"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="low"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="values"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="open"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="values"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SeriesDates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SeriesDuration" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="SeriesLabelCoordinates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SeriesLabels"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="x"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dates"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="pos"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="priorities"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="text"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="utcDates"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "series",
        "seriesDates",
        "seriesDuration",
        "seriesLabelCoordinates",
        "seriesLabels",
        "symbol"
})
@XmlRootElement(name = "company")
public class Company {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Series", required = true)
    protected Series series;
    @XmlElement(name = "SeriesDates", required = true)
    protected SeriesDates seriesDates;
    @XmlElement(name = "SeriesDuration")
    protected short seriesDuration;
    @XmlElement(name = "SeriesLabelCoordinates", required = true)
    protected SeriesLabelCoordinates seriesLabelCoordinates;
    @XmlElement(name = "SeriesLabels", required = true)
    protected SeriesLabels seriesLabels;
    @XmlElement(name = "Symbol", required = true)
    protected String symbol;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the series property.
     *
     * @return
     *     possible object is
     *     {@link Series }
     *
     */
    public Series getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     *
     * @param value
     *     allowed object is
     *     {@link Series }
     *
     */
    public void setSeries(Series value) {
        this.series = value;
    }

    /**
     * Gets the value of the seriesDates property.
     *
     * @return
     *     possible object is
     *     {@link SeriesDates }
     *
     */
    public SeriesDates getSeriesDates() {
        return seriesDates;
    }

    /**
     * Sets the value of the seriesDates property.
     *
     * @param value
     *     allowed object is
     *     {@link SeriesDates }
     *
     */
    public void setSeriesDates(SeriesDates value) {
        this.seriesDates = value;
    }

    /**
     * Gets the value of the seriesDuration property.
     *
     */
    public short getSeriesDuration() {
        return seriesDuration;
    }

    /**
     * Sets the value of the seriesDuration property.
     *
     */
    public void setSeriesDuration(short value) {
        this.seriesDuration = value;
    }

    /**
     * Gets the value of the seriesLabelCoordinates property.
     *
     * @return
     *     possible object is
     *     {@link SeriesLabelCoordinates }
     *
     */
    public SeriesLabelCoordinates getSeriesLabelCoordinates() {
        return seriesLabelCoordinates;
    }

    /**
     * Sets the value of the seriesLabelCoordinates property.
     *
     * @param value
     *     allowed object is
     *     {@link SeriesLabelCoordinates }
     *
     */
    public void setSeriesLabelCoordinates(SeriesLabelCoordinates value) {
        this.seriesLabelCoordinates = value;
    }

    /**
     * Gets the value of the seriesLabels property.
     *
     * @return
     *     possible object is
     *     {@link SeriesLabels }
     *
     */
    public SeriesLabels getSeriesLabels() {
        return seriesLabels;
    }

    /**
     * Sets the value of the seriesLabels property.
     *
     * @param value
     *     allowed object is
     *     {@link SeriesLabels }
     *
     */
    public void setSeriesLabels(SeriesLabels value) {
        this.seriesLabels = value;
    }

    /**
     * Gets the value of the symbol property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected         content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="close"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="values"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="high"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="values"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="low"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="values"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="open"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="values"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "close",
            "high",
            "low",
            "open"
    })
    public static class Series {

        @XmlElement(required = true)
        protected Close close;
        @XmlElement(required = true)
        protected High high;
        @XmlElement(required = true)
        protected Low low;
        @XmlElement(required = true)
        protected Open open;

        /**
         * Gets the value of the close property.
         *
         * @return
         *     possible object is
         *     {@link Close }
         *
         */
        public Close getClose() {
            return close;
        }

        /**
         * Sets the value of the close property.
         *
         * @param value
         *     allowed object is
         *     {@link Close }
         *
         */
        public void setClose(Close value) {
            this.close = value;
        }

        /**
         * Gets the value of the high property.
         *
         * @return
         *     possible object is
         *     {@link High }
         *
         */
        public High getHigh() {
            return high;
        }

        /**
         * Sets the value of the high property.
         *
         * @param value
         *     allowed object is
         *     {@link High }
         *
         */
        public void setHigh(High value) {
            this.high = value;
        }

        /**
         * Gets the value of the low property.
         *
         * @return
         *     possible object is
         *     {@link Low }
         *
         */
        public Low getLow() {
            return low;
        }

        /**
         * Sets the value of the low property.
         *
         * @param value
         *     allowed object is
         *     {@link Low }
         *
         */
        public void setLow(Low value) {
            this.low = value;
        }

        /**
         * Gets the value of the open property.
         *
         * @return
         *     possible object is
         *     {@link Open }
         *
         */
        public Open getOpen() {
            return open;
        }

        /**
         * Sets the value of the open property.
         *
         * @param value
         *     allowed object is
         *     {@link Open }
         *
         */
        public void setOpen(Open value) {
            this.open = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected         content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="values"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "max",
                "maxDate",
                "min",
                "minDate",
                "values"
        })
        public static class Close {

            protected float max;
            protected int maxDate;
            protected float min;
            protected int minDate;
            @XmlElement(required = true)
            protected Values values;

            /**
             * Gets the value of the max property.
             *
             */
            public float getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             *
             */
            public void setMax(float value) {
                this.max = value;
            }

            /**
             * Gets the value of the maxDate property.
             *
             */
            public int getMaxDate() {
                return maxDate;
            }

            /**
             * Sets the value of the maxDate property.
             *
             */
            public void setMaxDate(int value) {
                this.maxDate = value;
            }

            /**
             * Gets the value of the min property.
             *
             */
            public float getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             *
             */
            public void setMin(float value) {
                this.min = value;
            }

            /**
             * Gets the value of the minDate property.
             *
             */
            public int getMinDate() {
                return minDate;
            }

            /**
             * Sets the value of the minDate property.
             *
             */
            public void setMinDate(int value) {
                this.minDate = value;
            }

            /**
             * Gets the value of the values property.
             *
             * @return
             *     possible object is
             *     {@link Values }
             *
             */
            public Values getValues() {
                return values;
            }

            /**
             * Sets the value of the values property.
             *
             * @param value
             *     allowed object is
             *     {@link Values }
             *
             */
            public void setValues(Values value) {
                this.values = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Values {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected         content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="values"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "max",
                "maxDate",
                "min",
                "minDate",
                "values"
        })
        public static class High {

            protected float max;
            protected int maxDate;
            protected float min;
            protected int minDate;
            @XmlElement(required = true)
            protected Values values;

            /**
             * Gets the value of the max property.
             *
             */
            public float getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             *
             */
            public void setMax(float value) {
                this.max = value;
            }

            /**
             * Gets the value of the maxDate property.
             *
             */
            public int getMaxDate() {
                return maxDate;
            }

            /**
             * Sets the value of the maxDate property.
             *
             */
            public void setMaxDate(int value) {
                this.maxDate = value;
            }

            /**
             * Gets the value of the min property.
             *
             */
            public float getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             *
             */
            public void setMin(float value) {
                this.min = value;
            }

            /**
             * Gets the value of the minDate property.
             *
             */
            public int getMinDate() {
                return minDate;
            }

            /**
             * Sets the value of the minDate property.
             *
             */
            public void setMinDate(int value) {
                this.minDate = value;
            }

            /**
             * Gets the value of the values property.
             *
             * @return
             *     possible object is
             *     {@link Values }
             *
             */
            public Values getValues() {
                return values;
            }

            /**
             * Sets the value of the values property.
             *
             * @param value
             *     allowed object is
             *     {@link Values }
             *
             */
            public void setValues(Values value) {
                this.values = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Values {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected         content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="values"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "max",
                "maxDate",
                "min",
                "minDate",
                "values"
        })
        public static class Low {

            protected float max;
            protected int maxDate;
            protected float min;
            protected int minDate;
            @XmlElement(required = true)
            protected Values values;

            /**
             * Gets the value of the max property.
             *
             */
            public float getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             *
             */
            public void setMax(float value) {
                this.max = value;
            }

            /**
             * Gets the value of the maxDate property.
             *
             */
            public int getMaxDate() {
                return maxDate;
            }

            /**
             * Sets the value of the maxDate property.
             *
             */
            public void setMaxDate(int value) {
                this.maxDate = value;
            }

            /**
             * Gets the value of the min property.
             *
             */
            public float getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             *
             */
            public void setMin(float value) {
                this.min = value;
            }

            /**
             * Gets the value of the minDate property.
             *
             */
            public int getMinDate() {
                return minDate;
            }

            /**
             * Sets the value of the minDate property.
             *
             */
            public void setMinDate(int value) {
                this.minDate = value;
            }

            /**
             * Gets the value of the values property.
             *
             * @return
             *     possible object is
             *     {@link Values }
             *
             */
            public Values getValues() {
                return values;
            }

            /**
             * Sets the value of the values property.
             *
             * @param value
             *     allowed object is
             *     {@link Values }
             *
             */
            public void setValues(Values value) {
                this.values = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Values {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected         content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="maxDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="minDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="values"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "max",
                "maxDate",
                "min",
                "minDate",
                "values"
        })
        public static class Open {

            protected float max;
            protected int maxDate;
            protected float min;
            protected int minDate;
            @XmlElement(required = true)
            protected Values values;

            /**
             * Gets the value of the max property.
             *
             */
            public float getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             *
             */
            public void setMax(float value) {
                this.max = value;
            }

            /**
             * Gets the value of the maxDate property.
             *
             */
            public int getMaxDate() {
                return maxDate;
            }

            /**
             * Sets the value of the maxDate property.
             *
             */
            public void setMaxDate(int value) {
                this.maxDate = value;
            }

            /**
             * Gets the value of the min property.
             *
             */
            public float getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             *
             */
            public void setMin(float value) {
                this.min = value;
            }

            /**
             * Gets the value of the minDate property.
             *
             */
            public int getMinDate() {
                return minDate;
            }

            /**
             * Sets the value of the minDate property.
             *
             */
            public void setMinDate(int value) {
                this.minDate = value;
            }

            /**
             * Gets the value of the values property.
             *
             * @return
             *     possible object is
             *     {@link Values }
             *
             */
            public Values getValues() {
                return values;
            }

            /**
             * Sets the value of the values property.
             *
             * @param value
             *     allowed object is
             *     {@link Values }
             *
             */
            public void setValues(Values value) {
                this.values = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Values {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected         content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "element"
    })
    public static class SeriesDates {

        protected List<String> element;

        /**
         * Gets the value of the element property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getElement() {
            if (element == null) {
                element = new ArrayList<String>();
            }
            return this.element;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected         content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "element"
    })
    public static class SeriesLabelCoordinates {

        @XmlElement(type = Float.class)
        protected List<Float> element;

        /**
         * Gets the value of the element property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Float }
         *
         *
         */
        public List<Float> getElement() {
            if (element == null) {
                element = new ArrayList<Float>();
            }
            return this.element;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected         content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="x"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dates"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="pos"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="priorities"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="text"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="utcDates"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "x"
    })
    public static class SeriesLabels {

        @XmlElement(required = true)
        protected X x;

        /**
         * Gets the value of the x property.
         *
         * @return
         *     possible object is
         *     {@link X }
         *
         */
        public X getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         *
         * @param value
         *     allowed object is
         *     {@link X }
         *
         */
        public void setX(X value) {
            this.x = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected         content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="dates"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="pos"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="priorities"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="text"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="utcDates"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "dates",
                "pos",
                "priorities",
                "text",
                "utcDates"
        })
        public static class X {

            @XmlElement(required = true)
            protected Dates dates;
            @XmlElement(required = true)
            protected Pos pos;
            @XmlElement(required = true)
            protected Priorities priorities;
            @XmlElement(required = true)
            protected Text text;
            @XmlElement(required = true)
            protected UtcDates utcDates;

            /**
             * Gets the value of the dates property.
             *
             * @return
             *     possible object is
             *     {@link Dates }
             *
             */
            public Dates getDates() {
                return dates;
            }

            /**
             * Sets the value of the dates property.
             *
             * @param value
             *     allowed object is
             *     {@link Dates }
             *
             */
            public void setDates(Dates value) {
                this.dates = value;
            }

            /**
             * Gets the value of the pos property.
             *
             * @return
             *     possible object is
             *     {@link Pos }
             *
             */
            public Pos getPos() {
                return pos;
            }

            /**
             * Sets the value of the pos property.
             *
             * @param value
             *     allowed object is
             *     {@link Pos }
             *
             */
            public void setPos(Pos value) {
                this.pos = value;
            }

            /**
             * Gets the value of the priorities property.
             *
             * @return
             *     possible object is
             *     {@link Priorities }
             *
             */
            public Priorities getPriorities() {
                return priorities;
            }

            /**
             * Sets the value of the priorities property.
             *
             * @param value
             *     allowed object is
             *     {@link Priorities }
             *
             */
            public void setPriorities(Priorities value) {
                this.priorities = value;
            }

            /**
             * Gets the value of the text property.
             *
             * @return
             *     possible object is
             *     {@link Text }
             *
             */
            public Text getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             *
             * @param value
             *     allowed object is
             *     {@link Text }
             *
             */
            public void setText(Text value) {
                this.text = value;
            }

            /**
             * Gets the value of the utcDates property.
             *
             * @return
             *     possible object is
             *     {@link UtcDates }
             *
             */
            public UtcDates getUtcDates() {
                return utcDates;
            }

            /**
             * Sets the value of the utcDates property.
             *
             * @param value
             *     allowed object is
             *     {@link UtcDates }
             *
             */
            public void setUtcDates(UtcDates value) {
                this.utcDates = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Dates {

                @XmlElement(type = Integer.class)
                protected List<Integer> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 *
                 *
                 */
                public List<Integer> getElement() {
                    if (element == null) {
                        element = new ArrayList<Integer>();
                    }
                    return this.element;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Pos {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Priorities {

                @XmlElement(type = Float.class)
                protected List<Float> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Float }
                 *
                 *
                 */
                public List<Float> getElement() {
                    if (element == null) {
                        element = new ArrayList<Float>();
                    }
                    return this.element;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class Text {

                protected List<String> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 *
                 *
                 */
                public List<String> getElement() {
                    if (element == null) {
                        element = new ArrayList<String>();
                    }
                    return this.element;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected         content contained within this class.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "element"
            })
            public static class UtcDates {

                @XmlElement(type = Integer.class)
                protected List<Integer> element;

                /**
                 * Gets the value of the element property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the element property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getElement().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 *
                 *
                 */
                public List<Integer> getElement() {
                    if (element == null) {
                        element = new ArrayList<Integer>();
                    }
                    return this.element;
                }

            }

        }

    }

}
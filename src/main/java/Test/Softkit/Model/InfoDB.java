package Test.Softkit.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
//@Entity
//@Table(name = "allinfo")
public class InfoDB  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "primaryExchange")
    private String primaryExchange;
    @Column(name = "calculationPrice")
    private String calculationPrice;
    @Column(name = "open")
    private long open;
    @Column(name = "openTime")
    private long openTime = System.currentTimeMillis();
    @Column(name = "close")
    private double close;
    @Column(name = "closeTime")
    private long closeTime = System.currentTimeMillis();
    @Column(name = "high")
    private double high;
    @Column(name = "low")
    private double low;
    @Column(name = "latestPrice")
    private double latestPrice;
    @Column(name = "latestTime")
    private String latestTime;
    @Column(name = "latestUpdate")
    private long latestUpdate = System.currentTimeMillis();
    @Column(name = "latestVolume")
    private long latestVolume;
    @Column(name = "iexRealtimePrice")
    private double iexRealtimePrice;
    @Column(name = "iexRealtimeSize")
    private int iexRealtimeSize;
    @Column(name = "iexLastUpdated")
    private Date iexLastUpdated;
    @Column(name = "delayedPrice")
    private double delayedPrice;
    @Column(name = "delayedPriceTime")
    private long delayedPriceTime = System.currentTimeMillis();
    @Column(name = "extendedPrice")
    private double extendedPrice;
    @Column(name = "extendedChange")
    private int extendedChange;
    @Column(name = "extendedChangePercent")
    private double extendedChangePercent;
    @Column(name = "extendedPriceTime")
    private long extendedPriceTime = System.currentTimeMillis();
    @Column(name = "previousClose")
    private double previousClose;
    @Column(name = "previousVolume")
    private long previousVolume;
    @Column(name = "cha_nge")
    private double change;
    @Column(name = "changePercent")
    private double changePercent;
    @Column(name = "volume")
    private long volume;
    @Column(name = "iexMarketPercent")
    private double iexMarketPercent;
    @Column(name = "iexVolume")
    private long iexVolume;
    @Column(name = "avgTotalVolume")
    private long avgTotalVolume;
    @Column(name = "iexBidPrice")
    private int iexBidPrice;
    @Column(name = "iexBidSize")
    private int iexBidSize;
    @Column(name = "iexAskPrice")
    private int iexAskPrice;
    @Column(name = "iexAskSize")
    private int iexAskSize;
    @Column(name = "marketCap")
    private long marketCap;
    @Column(name = "peRatio")
    private double peRatio;
    @Column(name = "week52High")
    private double week52High;
    @Column(name = "week52Low")
    private double week52Low;
    @Column(name = "ytdChange")
    private double ytdChange;
    @Column(name = "lastTradeTime")
    private long lastTradeTime = System.currentTimeMillis();
    @Column(name = "isUSMarketOpen")
    private boolean isUSMarketOpen;


}

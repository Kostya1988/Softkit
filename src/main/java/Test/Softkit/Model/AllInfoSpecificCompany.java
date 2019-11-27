package Test.Softkit.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "allinfo")
@Data
public class AllInfoSpecificCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(value = "symbol")
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "company_name")
    @JsonProperty(value = "companyName")
    private String companyName;
    @Column(name = "primary_exchange")
    @JsonProperty(value = "primaryExchange")
    private String primaryExchange;
    @Column(name = "calculation_price")
    @JsonProperty(value = "calculationPrice")
    private String calculationPrice;
    @Column(name = "open")
    @JsonProperty(value = "open")
    private long open;
    @Column(name = "open_time")
    @JsonProperty(value = "openTime")
    private long openTime = System.currentTimeMillis();
    @Column(name = "close")
    @JsonProperty(value = "close")
    private double close;
    @Column(name = "close_time")
    @JsonProperty(value = "closeTime")
    private long closeTime = System.currentTimeMillis();
    @Column(name = "high")
    @JsonProperty(value = "high")
    private double high;
    @Column(name = "low")
    @JsonProperty(value = "low")
    private double low;
    @Column(name = "latest_price")
    @JsonProperty(value = "latestPrice")
    private double latestPrice;
    @Column(name = "latest_source")
    @JsonProperty(value = "latestSource")
    private String latestSource;
    @Column(name = "latest_time")
    @JsonProperty(value = "latestTime")
    private String latestTime;
    @Column(name = "latest_update")
    @JsonProperty(value = "latestUpdate")
    private long latestUpdate = System.currentTimeMillis();
    @Column(name = "latest_volume")
    @JsonProperty(value = "latestVolume")
    private long latestVolume;
    @Column(name = "iex_real_time_price")
    @JsonProperty(value = "iexRealtimePrice")
    private double iexRealtimePrice;
    @Column(name = "iex_real_time_size")
    @JsonProperty(value = "iexRealtimeSize")
    private int iexRealtimeSize;
    @Column(name = "iex_last_updated")
    @JsonProperty(value = "iexLastUpdated")
    private Date iexLastUpdated;
    @Column(name = "delayed_price")
    @JsonProperty(value = "delayedPrice")
    private double delayedPrice;
    @Column(name = "delayed_price_time")
    @JsonProperty(value = "delayedPriceTime")
    private long delayedPriceTime = System.currentTimeMillis();
    @Column(name = "extended_price")
    @JsonProperty(value = "extendedPrice")
    private double extendedPrice;
    @Column(name = "extended_change")
    @JsonProperty(value = "extendedChange")
    private int extendedChange;
    @Column(name = "extended_change_percent")
    @JsonProperty(value = "extendedChangePercent")
    private double extendedChangePercent;
    @Column(name = "extended_price_time")
    @JsonProperty(value = "extendedPriceTime")
    private long extendedPriceTime = System.currentTimeMillis();
    @Column(name = "previous_close")
    @JsonProperty(value = "previousClose")
    private double previousClose;
    @Column(name = "previous_volume")
    @JsonProperty(value = "previousVolume")
    private long previousVolume;
    @Column(name = "cha_nge")
    @JsonProperty(value = "change")
    private double change;
    @Column(name = "change_percent")
    @JsonProperty(value = "changePercent")
    private double changePercent;
    @Column(name = "volume")
    @JsonProperty(value = "volume")
    private long volume;
    @Column(name = "iex_market_percent")
    @JsonProperty(value = "iexMarketPercent")
    private double iexMarketPercent;
    @Column(name = "iex_volume")
    @JsonProperty(value = "iexVolume")
    private long iexVolume;
    @Column(name = "avg_Total_Volume")
    @JsonProperty(value = "avgTotalVolume")
    private long avgTotalVolume;
    @Column(name = "iex_bid_price")
    @JsonProperty(value = "iexBidPrice")
    private int iexBidPrice;
    @Column(name = "iex_bid_size")
    @JsonProperty(value = "iexBidSize")
    private int iexBidSize;
    @Column(name = "iex_ask_price")
    @JsonProperty(value = "iexAskPrice")
    private int iexAskPrice;
    @Column(name = "iex_ask_size")
    @JsonProperty(value = "iexAskSize")
    private int iexAskSize;
    @Column(name = "market_cap")
    @JsonProperty(value = "marketCap")
    private long marketCap;
    @Column(name = "pe_ratio")
    @JsonProperty(value = "peRatio")
    private double peRatio;
    @Column(name = "week52_high")
    @JsonProperty(value = "week52High")
    private double week52High;
    @Column(name = "week52_low")
    @JsonProperty(value = "week52Low")
    private double week52Low;
    @Column(name = "ytd_change")
    @JsonProperty(value = "ytdChange")
    private double ytdChange;
    @Column(name = "last_trade_time")
    @JsonProperty(value = "lastTradeTime")
    private long lastTradeTime = System.currentTimeMillis();
    @Column(name = "is_uS_market_open")
    @JsonProperty(value = "isUSMarketOpen")
    private boolean isUSMarketOpen;

}


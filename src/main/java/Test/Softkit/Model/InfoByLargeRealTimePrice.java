package Test.Softkit.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
      @Data
     @JsonIgnoreProperties(ignoreUnknown = true)
public class InfoByLargeRealTimePrice {



         @JsonProperty(value = "symbol")
          private String symbol;
          @JsonProperty(value = "exchange")
          private String exchange;
          @JsonProperty(value = "name")
          private String name;
          @JsonProperty(value = "date")
          private Date date;
          @JsonProperty(value = "type")
          private String type;
          @JsonProperty(value = "iexId")
          private String iexId;
          @JsonProperty(value = "region")
          private String region;
          @JsonProperty(value = "currency")
          private String currency;
          @JsonProperty(value = "isEnabled")
          private boolean isEnabled;
}

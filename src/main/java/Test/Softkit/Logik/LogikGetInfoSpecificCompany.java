package Test.Softkit.Logik;

import Test.Softkit.Exception.InfoNotFoundException;
import Test.Softkit.Model.AllInfoSpecificCompany;
import Test.Softkit.Service.InfoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
@Component
public class LogikGetInfoSpecificCompany{

    @Autowired
    InfoService infoService;

    public List<AllInfoSpecificCompany> infoSpecificCompanies(String company)  throws IOException {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response
            = restTemplate.getForEntity("https://sandbox.iexapis.com/stable/stock/" + company.toUpperCase() + "/quote?token=Tpk_ee567917a6b640bb8602834c9d30e571", String.class);
        if (response.getStatusCode() != HttpStatus.OK) {
        throw new InfoNotFoundException("STOP FULL");
    }

    List<AllInfoSpecificCompany> companyList = Arrays.asList(new ObjectMapper().readValue(response.getBody(),
            AllInfoSpecificCompany.class));
        for (AllInfoSpecificCompany allInfoSpecificCompany : companyList) {
        System.out.println(allInfoSpecificCompany);
        infoService.save(allInfoSpecificCompany);
    }
        return companyList;
}

}

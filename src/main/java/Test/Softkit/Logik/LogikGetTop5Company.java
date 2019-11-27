package Test.Softkit.Logik;

import Test.Softkit.Exception.InfoNotFoundException;
import Test.Softkit.Model.AllInfoSpecificCompany;
import Test.Softkit.Service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableScheduling
public class LogikGetTop5Company {
    @Autowired
    InfoService infoService;

    @Async
    @Scheduled(fixedRate = 5000)
    public ResponseEntity<List<AllInfoSpecificCompany>> listTop5Company() {
        List<AllInfoSpecificCompany> infoSpecificCompanies = infoService.top5Company();
        if (infoSpecificCompanies.isEmpty()) {
            throw new InfoNotFoundException("Check not found");
        }
        System.out.println(infoSpecificCompanies);
        return new ResponseEntity<>(infoSpecificCompanies, HttpStatus.OK);
    }
}


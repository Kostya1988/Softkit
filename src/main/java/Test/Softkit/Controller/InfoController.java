package Test.Softkit.Controller;

import Test.Softkit.Logik.LogikGetInfoSpecificCompany;
import Test.Softkit.Logik.LogikGetTop5Company;
import Test.Softkit.Logik.LogikGetTopChangePercent;
import Test.Softkit.Model.AllInfoSpecificCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InfoController {
    @Autowired
    LogikGetInfoSpecificCompany logikGetInfoSpecificCompany;
    @Autowired
    LogikGetTop5Company logikGetTop5Company;
    @Autowired
    LogikGetTopChangePercent logikGetTopChangePercent;

    @GetMapping(value = "{company}")
    public List<AllInfoSpecificCompany> getInfoSpecificCompany(@PathVariable String company) throws IOException { return logikGetInfoSpecificCompany.infoSpecificCompanies(company);
    }

    @GetMapping(value = "/topChangePercent")
    public ResponseEntity<List<AllInfoSpecificCompany>> listTopChangePercent() {
        return logikGetTopChangePercent.listTopChangePercent();
    }

    @GetMapping(value = "/top5Company")
    public ResponseEntity<List<AllInfoSpecificCompany>> getTop5Company() {
        return logikGetTop5Company.listTop5Company();
    }
}

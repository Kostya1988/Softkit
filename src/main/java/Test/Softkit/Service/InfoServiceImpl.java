package Test.Softkit.Service;

import Test.Softkit.Model.AllInfoSpecificCompany;
import Test.Softkit.Repository.InfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InfoRepository infoRepository;

    @Override
    public List<AllInfoSpecificCompany> top5Company() {
        log.info("In InfoServiceImpl top5Company {}");
        return infoRepository.findByIexRealtimePrice();
    }

    @Override
    public List<AllInfoSpecificCompany> findBychangePercent() {
        log.info("In InfoServiceImpl findBychangePercent {}");
        return infoRepository.findBychangePercent();
    }

    @Override
    public void save(AllInfoSpecificCompany allInfoSpecificCompany) {
        log.info("In InfoServiceImpl save {}", allInfoSpecificCompany);
        infoRepository.save(allInfoSpecificCompany);
    }

}

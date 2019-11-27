package Test.Softkit.Service;

import Test.Softkit.Model.AllInfoSpecificCompany;

import java.util.List;

public interface InfoService {
  void save   (AllInfoSpecificCompany allInfoSpecificCompany);
   List<AllInfoSpecificCompany> top5Company();
   List<AllInfoSpecificCompany> findBychangePercent();
}
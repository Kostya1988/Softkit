package Test.Softkit.Repository;

import Test.Softkit.Model.AllInfoSpecificCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfoRepository extends JpaRepository<AllInfoSpecificCompany, Long> {

    @Query(value = "SELECT * FROM allinfo WHERE iex_real_time_price > 0 ORDER BY iex_real_time_price,company_name  LIMIT 5", nativeQuery = true)
    List<AllInfoSpecificCompany> findByIexRealtimePrice();

    @Query(value = "SELECT * FROM allinfo  ORDER BY change_percent DESC  LIMIT 5", nativeQuery = true)
    List<AllInfoSpecificCompany> findBychangePercent();

}
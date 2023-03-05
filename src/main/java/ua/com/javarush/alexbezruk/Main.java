package ua.com.javarush.alexbezruk;

import ua.com.javarush.alexbezruk.domain.City;
import ua.com.javarush.alexbezruk.redis.CityCountry;
import ua.com.javarush.alexbezruk.service.Service;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        List<City> allCities = service.fetchData();
        List<CityCountry> preparedData = service.transformData(allCities);
        service.pushToRedis(preparedData);

        service.getSessionFactory().getCurrentSession().close();

        service.dataReadingSpeedTest(10);

        service.shutdown();
    }
}

package ua.com.javarush.alexbezruk.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ua.com.javarush.alexbezruk.domain.City;
import ua.com.javarush.alexbezruk.redis.CityCountry;

@Mapper
public interface CityCountryMapper {
    CityCountryMapper INSTANCE = Mappers.getMapper(CityCountryMapper.class);

    @Mapping(target = "countryCode", source = "country.code")
    @Mapping(target = "alternativeCountryCode", source = "country.alternativeCode")
    @Mapping(target = "countryName", source = "country.name")
    @Mapping(target = "continent", source = "country.continent")
    @Mapping(target = "countryRegion", source = "country.region")
    @Mapping(target = "countrySurfaceArea", source = "country.surfaceArea")
    @Mapping(target = "countryPopulation", source = "country.population")
    @Mapping(target = "languages", source = "country.languages")
    CityCountry toCityCountry(City city);
}

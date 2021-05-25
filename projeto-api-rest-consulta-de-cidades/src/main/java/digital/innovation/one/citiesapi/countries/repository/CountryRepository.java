package digital.innovation.one.citiesapi.countries.repository;

import digital.innovation.one.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

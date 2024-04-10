package cs489.sdapp.lab6.adsmanagementcli.repository;

import cs489.sdapp.lab6.adsmanagementcli.model.Dentist;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends ListCrudRepository<Dentist, Integer> {

}

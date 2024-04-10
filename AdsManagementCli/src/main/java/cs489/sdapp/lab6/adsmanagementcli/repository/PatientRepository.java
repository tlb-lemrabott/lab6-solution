package cs489.sdapp.lab6.adsmanagementcli.repository;

import cs489.sdapp.lab6.adsmanagementcli.model.Patient;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends ListCrudRepository<Patient, Integer> {

}

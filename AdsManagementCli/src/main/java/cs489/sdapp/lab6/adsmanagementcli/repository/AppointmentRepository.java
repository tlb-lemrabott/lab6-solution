package cs489.sdapp.lab6.adsmanagementcli.repository;

import cs489.sdapp.lab6.adsmanagementcli.model.Appointment;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ListCrudRepository<Appointment, Integer> {

}

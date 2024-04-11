package cs489.sdapp.lab6.adsmanagementcli;

import cs489.sdapp.lab6.adsmanagementcli.model.*;
import cs489.sdapp.lab6.adsmanagementcli.service.AppointmentServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AdsManagementCliApplication implements CommandLineRunner {

    private AppointmentServiceImp appointmentServiceImp;
    public AdsManagementCliApplication(AppointmentServiceImp appointmentServiceImp){
        this.appointmentServiceImp = appointmentServiceImp;
    }

    public static void main(String[] args) {
        SpringApplication.run(AdsManagementCliApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address();
        address.setStreet("123 Main Street");
        address.setCity("Fairfield");
        address.setCity("Iowa");
        address.setZipCode("12345");

        Patient patient = new Patient();
        patient.setFirstName("Gillian");
        patient.setLastName("White");
        patient.setAddress(address);

        Surgery surgery = new Surgery();
        surgery.setName("Wisdom Tooth Extraction");
        surgery.setAddress(address);

        Dentist dentist = new Dentist();
        dentist.setFirstName("Tony");
        dentist.setLastName("Smith");

        Appointment appointment = new Appointment();
        appointment.setScheduleTime(LocalDate.now());
        appointment.setPatient(patient);
        appointment.setDentist(dentist);
        appointment.setSurgery(surgery);

        appointmentServiceImp.saveNewAppointment(appointment);

    }
}

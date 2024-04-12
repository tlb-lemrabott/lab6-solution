package cs489.sdapp.lab6.adsmanagementcli;

import cs489.sdapp.lab6.adsmanagementcli.model.*;
import cs489.sdapp.lab6.adsmanagementcli.service.CLIServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class AdsManagementCliApplication implements CommandLineRunner {

    private CLIServiceImp cliServiceImp;
    public AdsManagementCliApplication(CLIServiceImp cliServiceImp){
        this.cliServiceImp = cliServiceImp;
    }

    public static void main(String[] args) {
        SpringApplication.run(AdsManagementCliApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Address address1 = DataBuilder.pullAddresses().get(0);
        Address address2 = DataBuilder.pullAddresses().get(0);
        Address address3 = DataBuilder.pullAddresses().get(0);
        Address address4 = DataBuilder.pullAddresses().get(0);
        cliServiceImp.saveNewAddress(address1);
        cliServiceImp.saveNewAddress(address2);
        cliServiceImp.saveNewAddress(address3);
        cliServiceImp.saveNewAddress(address4);


        Patient patient1 = DataBuilder.pullPatients().get(0);
        Patient patient2 = DataBuilder.pullPatients().get(1);
        Patient patient3 = DataBuilder.pullPatients().get(2);
        Patient patient4 = DataBuilder.pullPatients().get(3);
        patient1.setPatientAddress(address1);
        patient2.setPatientAddress(address2);
        patient3.setPatientAddress(address3);
        patient4.setPatientAddress(address4);
        cliServiceImp.saveNewPatient(patient1);
        cliServiceImp.saveNewPatient(patient2);
        cliServiceImp.saveNewPatient(patient3);
        cliServiceImp.saveNewPatient(patient4);

        Surgery surgery1 = DataBuilder.pullSurgeries().get(0);
        Surgery surgery2 = DataBuilder.pullSurgeries().get(1);
        Surgery surgery3 = DataBuilder.pullSurgeries().get(2);
        Surgery surgery4 = DataBuilder.pullSurgeries().get(3);
        surgery1.setSurgeryAddress(address1);
        surgery2.setSurgeryAddress(address2);
        surgery3.setSurgeryAddress(address3);
        surgery4.setSurgeryAddress(address4);
        cliServiceImp.saveNewSurgery(surgery1);
        cliServiceImp.saveNewSurgery(surgery2);
        cliServiceImp.saveNewSurgery(surgery3);
        cliServiceImp.saveNewSurgery(surgery4);

        Dentist dentist1 = DataBuilder.pullDentists().get(0);
        Dentist dentist2 = DataBuilder.pullDentists().get(1);
        Dentist dentist3 = DataBuilder.pullDentists().get(2);
        Dentist dentist4 = DataBuilder.pullDentists().get(3);
        cliServiceImp.saveNewDentist(dentist1);
        cliServiceImp.saveNewDentist(dentist2);
        cliServiceImp.saveNewDentist(dentist3);
        cliServiceImp.saveNewDentist(dentist4);

        Appointment appointment1 = DataBuilder.pullAppointments().get(0);
        appointment1.setDentistAppointment(dentist1);
        appointment1.setPatientAppointment(patient1);
        appointment1.setSurgeryAppointment(surgery3);

        Appointment appointment2 = DataBuilder.pullAppointments().get(1);
        appointment2.setDentistAppointment(dentist1);
        appointment2.setPatientAppointment(patient2);
        appointment2.setSurgeryAppointment(surgery3);

        Appointment appointment3 = DataBuilder.pullAppointments().get(2);
        appointment3.setDentistAppointment(dentist2);
        appointment3.setPatientAppointment(patient3);
        appointment3.setSurgeryAppointment(surgery1);

        Appointment appointment4 = DataBuilder.pullAppointments().get(3);
        appointment4.setDentistAppointment(dentist2);
        appointment4.setPatientAppointment(patient3);
        appointment4.setSurgeryAppointment(surgery1);

        Appointment appointment5 = DataBuilder.pullAppointments().get(4);
        appointment5.setDentistAppointment(dentist3);
        appointment5.setPatientAppointment(patient2);
        appointment5.setSurgeryAppointment(surgery3);

        Appointment appointment6 = DataBuilder.pullAppointments().get(5);
        appointment6.setDentistAppointment(dentist3);
        appointment6.setPatientAppointment(patient4);
        appointment6.setSurgeryAppointment(surgery2);

        cliServiceImp.saveNewAppointment(appointment1);
        cliServiceImp.saveNewAppointment(appointment2);
        cliServiceImp.saveNewAppointment(appointment3);
        cliServiceImp.saveNewAppointment(appointment4);
        cliServiceImp.saveNewAppointment(appointment5);
        cliServiceImp.saveNewAppointment(appointment6);

    }
}

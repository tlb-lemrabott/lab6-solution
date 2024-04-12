package cs489.sdapp.lab6.adsmanagementcli.service;

import cs489.sdapp.lab6.adsmanagementcli.model.*;
import cs489.sdapp.lab6.adsmanagementcli.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CLIServiceImp implements CLIService {
    private AppointmentRepository appointmentRepository;
    private DentistRepository dentistRepository;
    private PatientRepository patientRepository;
    private SurgeryRepository surgeryRepository;
    private AddressRepository addressRepository;

    public CLIServiceImp(
            AppointmentRepository appointmentRepository,
            DentistRepository dentistRepository,
            PatientRepository patientRepository,
            SurgeryRepository surgeryRepository,
            AddressRepository addressRepository
    ) {
        this.appointmentRepository = appointmentRepository;
        this.dentistRepository = dentistRepository;
        this.patientRepository = patientRepository;
        this.surgeryRepository = surgeryRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public Appointment saveNewAppointment(Appointment appointment) {
        if(Objects.nonNull(appointment)){
            return appointmentRepository.save(appointment);
        }else {
            return null;
        }
    }

    @Override
    public Patient saveNewPatient(Patient patient) {
        if(Objects.nonNull(patient)){
            return patientRepository.save(patient);
        }else {
            return null;
        }
    }

    @Override
    public Dentist saveNewDentist(Dentist dentist) {
        if(Objects.nonNull(dentist)){
            return dentistRepository.save(dentist);
        }else {
            return null;
        }
    }

    @Override
    public Surgery saveNewSurgery(Surgery surgery) {
        if(Objects.nonNull(surgery)){
            return surgeryRepository.save(surgery);
        }else {
            return null;
        }
    }

    @Override
    public Address saveNewAddress(Address address) {
        if(Objects.nonNull(address)){
            return addressRepository.save(address);
        }else {
            return null;
        }
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public List<Surgery> getAllSurgeries() {
        return surgeryRepository.findAll();
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }


}

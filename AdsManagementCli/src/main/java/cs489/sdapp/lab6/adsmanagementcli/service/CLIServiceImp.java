package cs489.sdapp.lab6.adsmanagementcli.service;

import cs489.sdapp.lab6.adsmanagementcli.model.Appointment;
import cs489.sdapp.lab6.adsmanagementcli.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AppointmentServiceImp implements AppointmentService{
    private AppointmentRepository appointmentRepository;
    private DentistRepository dentistRepository;
    private PatientRepository patientRepository;
    private SurgeryRepository surgeryRepository;
    private AddressRepository addressRepository;

    public AppointmentServiceImp(
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
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

















}

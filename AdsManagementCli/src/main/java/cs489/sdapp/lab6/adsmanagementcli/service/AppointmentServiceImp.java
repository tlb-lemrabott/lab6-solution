package cs489.sdapp.lab6.adsmanagementcli.service;

import cs489.sdapp.lab6.adsmanagementcli.model.Appointment;
import cs489.sdapp.lab6.adsmanagementcli.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImp implements AppointmentService{
    private AppointmentRepository appointmentRepository;
    public AppointmentServiceImp(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    @Override
    public Appointment saveNewAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }
}

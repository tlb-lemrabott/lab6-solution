package cs489.sdapp.lab6.adsmanagementcli.service;

import cs489.sdapp.lab6.adsmanagementcli.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public Appointment saveNewAppointment(Appointment appointment);
    public List<Appointment> getAppointments();
}

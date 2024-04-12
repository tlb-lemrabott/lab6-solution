package cs489.sdapp.lab6.adsmanagementcli.service;

import cs489.sdapp.lab6.adsmanagementcli.model.*;

import java.util.List;

public interface CLIService {
    public Appointment saveNewAppointment(Appointment appointment);
    public Patient saveNewPatient(Patient patient);
    public Dentist saveNewDentist(Dentist dentist);
    public Surgery saveNewSurgery(Surgery surgery);
    public Address saveNewAddress(Address address);
    public List<Appointment> getAllAppointments();
    public List<Patient> getAllPatients();
    public List<Dentist> getAllDentists();
    public List<Surgery> getAllSurgeries();
    public List<Address> getAllAddresses();




}

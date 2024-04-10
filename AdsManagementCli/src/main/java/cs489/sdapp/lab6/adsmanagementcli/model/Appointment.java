package cs489.sdapp.lab6.adsmanagementcli.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Appointment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer appointmentId;
    private LocalDate scheduleTime;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Dentist dentist;
    @ManyToOne
    private Surgery surgery;

}

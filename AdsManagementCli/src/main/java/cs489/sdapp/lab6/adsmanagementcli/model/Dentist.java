package cs489.sdapp.lab6.adsmanagementcli.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dentistId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String speciality;
    @OneToMany
    private List<Appointment> appointments;
}

package cs489.sdapp.lab6.adsmanagementcli.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDate birthDate;
    @OneToOne
    private Address address;
    @OneToMany
    private List<Appointment> appointments;

}

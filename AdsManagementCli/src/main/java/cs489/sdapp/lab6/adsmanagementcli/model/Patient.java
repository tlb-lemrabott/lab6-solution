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
    private String patName;
    private String phone;
    private String email;
    private LocalDate birthDate;

    @OneToOne()
    @JoinColumn(name = "address_id_fk", nullable = false, unique = true)
    private Address patientAddress;

    @OneToMany(mappedBy = "patientAppointment", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}

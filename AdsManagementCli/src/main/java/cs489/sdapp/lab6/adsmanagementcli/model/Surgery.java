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
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer surgeryId;
    private String surgeryName;
    private String phone;

    @OneToOne()
    @JoinColumn(name = "address_id_fk", nullable = false, unique = true)
    private Address surgeryAddress;

    @OneToMany(mappedBy = "surgeryAppointment", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}

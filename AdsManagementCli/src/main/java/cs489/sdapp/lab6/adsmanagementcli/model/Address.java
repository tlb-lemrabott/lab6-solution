package cs489.sdapp.lab6.adsmanagementcli.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String apt;
    @OneToOne
    private Patient patient;
    @OneToOne
    private Surgery surgery;

}

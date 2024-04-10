package cs489.sdapp.lab6.adsmanagementcli;

import cs489.sdapp.lab6.adsmanagementcli.service.AppointmentServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdsManagementCliApplication implements CommandLineRunner {

    private AppointmentServiceImp appointmentServiceImp;
    public AdsManagementCliApplication(AppointmentServiceImp appointmentServiceImp){
        this.appointmentServiceImp = appointmentServiceImp;
    }

    public static void main(String[] args) {
        SpringApplication.run(AdsManagementCliApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.models.Address;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.repositories.AddressRepository;
import vn.edu.iuh.fit.repositories.CandidateRepository;
import java.time.LocalDate;

@SpringBootApplication
public class Week05LabLeAnhThu20117081Application {
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    public static void main(String[] args) {
        SpringApplication.run(Week05LabLeAnhThu20117081Application.class, args);
    }
//    @Bean
//    CommandLineRunner initData() {
//        return args -> {
//            Address address = new Address("492", "Nguyen Kiem", "Ho Chi Minh", "737210", CountryCode.VN);
//            addressRepository.save(address);
//            Candidate candidate = new Candidate("Anh Thu", LocalDate.of(2002, 7, 3), address, "0123456789", "thu@gmail.com");
//            candidateRepository.save(candidate);
//            System.out.println(candidate);
//
//        };
//    }

}

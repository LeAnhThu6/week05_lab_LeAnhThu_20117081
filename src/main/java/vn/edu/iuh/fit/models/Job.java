package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job")
@Data
public class Job {
    @Id
    private long id;
    private String jobDesc;
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

}

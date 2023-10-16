package model;


import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String patientName;
    private String doctorName;
    private String disease;
    private String medication;

    // Getters and setters
    // Constructors
}

package az.edu.itbrains.personal.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "abouts")
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subtitle;
}

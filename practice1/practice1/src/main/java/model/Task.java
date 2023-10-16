package model;

import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Task
{
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private Date dueDate;
    private String status;
}

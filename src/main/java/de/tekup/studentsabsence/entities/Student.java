package de.tekup.studentsabsence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"image","group","absences"})
public class Student implements Serializable {
    //TODO Complete Validations of fields


    @Id
    private Long sid;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dob;




    //TODO Complete Relations with other entities
    // relation one to one (image  ,Absence )
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    Image image;

    // relation  many to one (Student ,group )
    @ManyToOne
    Group group;
    // relation one to many (Student ,absence )
    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<Absence> absences;



    //TODO Complete Relations with other entities



}

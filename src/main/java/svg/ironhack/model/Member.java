package svg.ironhack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Column(name = "renewal_date")
    private String renewalDate;
}

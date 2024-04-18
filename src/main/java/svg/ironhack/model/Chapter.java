package svg.ironhack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private District district;

    @OneToOne
    @Enumerated(EnumType.STRING)
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;
}

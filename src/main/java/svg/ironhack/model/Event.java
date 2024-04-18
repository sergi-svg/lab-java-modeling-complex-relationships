package svg.ironhack.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String date;
    @Column
    private int duration;
    @Column
    private String location;
    @Column
    private String title;
    @Column
    private List<Guest> guests;

}

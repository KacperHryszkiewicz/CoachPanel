package com.hryszkiewicz.CoachPanel.player;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class PlayerEntity {

    @Id
    private Long id;

    private String name;

    private String surname;

    private LocalDate birthDate;

    private Long clubId;

}

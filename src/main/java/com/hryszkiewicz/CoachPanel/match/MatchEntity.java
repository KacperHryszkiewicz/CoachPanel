package com.hryszkiewicz.CoachPanel.match;

import com.hryszkiewicz.CoachPanel.club.ClubEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class MatchEntity {

    @Id
    private Long id;

    private LocalDate date;

    private ClubEntity home;

    private ClubEntity away;

    private int homeGoals;

    private int awayGoals;
}

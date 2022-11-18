package com.hryszkiewicz.CoachPanel.matchStats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MatchStatsEntity {

    @Id
    private Long id;

    private Long matchId;

    private Long clubId;

    private Stats stats;

}

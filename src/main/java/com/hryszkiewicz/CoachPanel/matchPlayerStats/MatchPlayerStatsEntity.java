package com.hryszkiewicz.CoachPanel.matchPlayerStats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MatchPlayerStatsEntity {

    @Id
    private Long id;

    private Long matchId;

    private Long playerId;

    private Stats stats;

    private UnsuccessfulStats unsuccessfulStats;
}

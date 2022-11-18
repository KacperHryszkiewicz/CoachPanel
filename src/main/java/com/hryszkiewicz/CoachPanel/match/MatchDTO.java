package com.hryszkiewicz.CoachPanel.match;

import com.hryszkiewicz.CoachPanel.club.ClubEntity;

import java.time.LocalDate;

public class MatchDTO {

    private Long id;

    private LocalDate date;

    private ClubEntity home;

    private ClubEntity away;

    private int homeGoals;

    private int awayGoals;
}

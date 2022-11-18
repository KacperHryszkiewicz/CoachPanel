package com.hryszkiewicz.CoachPanel.club;

import com.hryszkiewicz.CoachPanel.player.PlayerEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class ClubEntity {

    @Id
    private Long id;

    private String name;

    private List<PlayerEntity> playerList;
}

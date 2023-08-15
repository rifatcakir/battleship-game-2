package com.battleship.engine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ShipInfo {
    private UUID shipGroupId;
    private ShipType shipType;
}

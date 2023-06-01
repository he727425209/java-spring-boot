package com.learning.learning22.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;

    public enum Type{
        FESTIVAL, FEDERAL
    }
}

package com.andreev;

import java.util.Optional;

enum namesAndIds{

    FIRST(1, "Duha"),
    SECOND(2, "Andrew"),
    THEERD(3, "Anastasia"),
    FORTH(4, "Viktoria"),
    FIFTH(5, "Alex");

    private int id;
    private String name;

    private namesAndIds(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public static Optional<namesAndIds> returnEnum(int num){
        if(num > 5 | num < 1) {
            return Optional.empty();
        }

        return switch (num) {
            case (1) -> Optional.of(namesAndIds.FIRST);
            case (2) -> Optional.of(namesAndIds.SECOND);
            case (3) -> Optional.of(namesAndIds.THEERD);
            case (4) -> Optional.of(namesAndIds.FORTH);
            case (5) -> Optional.of(namesAndIds.FIFTH);
            default -> Optional.empty();
        };
    }
}
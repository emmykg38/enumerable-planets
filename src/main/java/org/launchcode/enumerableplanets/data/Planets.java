package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY(1, "Mercury", 88),
    VENUS(2, "Venus", 225),
    EARTH(3, "Earth", 365),
    MARS(4, "Mars", 687),
    JUPITER(5, "Jupiter", 4333),
    SATURN(6, "Saturn", 10759),
    URANUS(7, "Uranus", 30687),
    NEPTUNE(8,"Neptune", 60200);

    private int number;
    private String name;
    private int yearLength;

    Planets(int number, String name, int yearLength) {
        this.number = number;
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getNumber() {
        return number;
    }
}

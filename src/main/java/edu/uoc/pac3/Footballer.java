package edu.uoc.pac3;

public class Footballer {
    private String name;
    private int number;
    private Position[] positions;

    public Footballer(String name, int number, Position[] positions){
        setName(name);
        setNumber(number);
        setPositions(positions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public Position[] getPositions() {
        return positions;
    }

    public void setPositions(Position[] positions){
        this.positions = positions;
    }

}

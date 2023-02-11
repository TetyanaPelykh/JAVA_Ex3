package edu.uoc.pac3;

public enum Position {

    GOALKEEPER("BLACK"),
    DEFENDER("RED"),
    MIDFIELDER("GREEN"),
    FORWARD("BLUE");

    private String color;

    Position(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     * INFO FOR GRADE
     * 	Using the 'values()' method from enum class, gets the maximum score in 'quality of code'
     * 	Not using the 'values()' method of the enum class, and using ifs, penalizes the score of 'quality of code'
     */
    public static Position getPositionByColor(String color) {
        for(var d : Position.values()) {
            if(d.getColor().equals(color)) {
                return d;
            }
        }
        return null;
    }

    /**
     * INFO FOR GRADE
     * 	Using the 'values()' method from enum class, gets the maximum score in 'quality of code'
     * 	Not using the 'values()' method of the enum class, and using ifs, penalizes the score of 'quality of code'
     */
    public static String[] getColors(){
        String[] colors = new String[Position.values().length];
        int i = 0;
        for(var c : Position.values()) {
            colors[i] = c.getColor();
            i++;
        }
        return colors;
    }

    /**
     * INFO FOR GRADE
     * 	Using the 'ordinal()' method from enum class, gets the maximum score in 'quality of code'
     * 	Not using the 'ordinal()' method of the enum class, and using ifs, penalizes the score of 'quality of code'
     * 	Use ternary operator is a plus.
     */
    public boolean isPreceding(Position position){
        return this.ordinal() < position.ordinal() ? true : this.ordinal() > position.ordinal() ? false : true;
    }

}

import java.awt.*;

public class Robot
{
    private Point place;// location of the robot
    private String facing; // Direction for the robot
    public Robot() {
        place = new Point(0, 0);
        facing = "N";
    }
    public void turnLeft()
    {
        if (facing.equals("N")) {
            facing = "W";
        } else if (facing.equals("W")) {
            facing = "S";
        } else if (facing.equals("S")) {
            facing = "E";
        } else if (facing.equals("E")) {
            facing = "N";
        }
    }
    public void turnRight()
    {
        if (facing.equals("N")) {
            facing = "E";
        } else if (facing.equals("W")) {
            facing = "N";
        } else if (facing.equals("S")) {
            facing = "W";
        } else if (facing.equals("E")) {
            facing = "S";
        }
    }
    public void movement()
    {
        int x = place.x;
        int y = place.y;
        if (facing.equals("N")) {
            place.setLocation(x, y + 1);
        } else if (facing.equals("W")) {
            place.setLocation(x - 1, y);
        } else if (facing.equals("S")) {
            place.setLocation(x, y - 1);
        } else if (facing.equals("E")) {
            place.setLocation(x + 1, y);
        }
    }
    public Point getPlace()
    {
        return place;
    }
    public String getFacing()
    {
        return facing;
    }
    public String toString()
    {
        return String.format("%d %d %s", place.x, place.y, facing);
    }
}

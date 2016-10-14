
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create city
        City q3 = new City();
        
        // Create room
        new Wall(q3,1,1,Direction.NORTH);
        new Wall(q3,1,2,Direction.NORTH);
        new Wall(q3,1,3,Direction.NORTH);
        new Wall(q3,1,4,Direction.NORTH);
        
        new Wall(q3,1,1,Direction.WEST);
        new Wall(q3,2,1,Direction.WEST);
        new Wall(q3,3,1,Direction.WEST);
        new Wall(q3,4,1,Direction.WEST);
        
        new Wall(q3,4,1,Direction.SOUTH);
        new Wall(q3,4,2,Direction.SOUTH);
        new Wall(q3,4,3,Direction.SOUTH);
        new Wall(q3,4,4,Direction.SOUTH);
        
        new Wall(q3,1,4,Direction.EAST);
        // Exit
        new Wall(q3,3,4,Direction.EAST);
        new Wall(q3,4,4,Direction.EAST);
        
        // Create Houdini robot
        RobotSE rick = new RobotSE(q3,2,3,Direction.NORTH);
        
        // Move until against a wall
        do {
            rick.move();
        }while(rick.frontIsClear());
        
        // Turn to move beside the wall
        rick.turnLeft();
        
        // Move along wall 
        do {
            rick.move();
            rick.turnRight();
        }while(rick.frontIsClear() && !rick.frontIsClear());
        
    }
}

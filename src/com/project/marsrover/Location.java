package com.project.marsrover;

public class Location {

    private Point location;

    public Location(Commands commands)
    {
        //set the initial location 'landing point'
        //setLocation(new Point(0,0));

        move(commands);
    }

    public boolean setNewLocation(Point newLocation)
    {
        /*we first check of this new location has obstacles for moving rover
        *if return is true we move rover
        * else returns false, the rover then awaits for a new command
        *
         */

        FaultsObstacles obstacles = new FaultsObstacles();
        boolean obstacleExists = obstacles.locationHasObstacles(newLocation);

        if(obstacleExists)
            //in actual implementation, a message/ signal can be sent back to control station for new commands
            return false;
        else
        {
            //rover moved successfully
            return true;
        }
    }

    //move to new point
    public void move(Commands comm)
    {
        char[] commands = comm.getCommands();
        //switch ()

        for (char x: commands
             ) {
            switch (x)
            {
                case 'f':
                    moveForward();
                case 'b':
                    moveBackward();
                case 'l':
                    moveLeft();
                case 'r':
                    moveRight();
            }
        }
    }

    public void moveForward()
    {
        //return Direction.NORTH;
        setNewLocation(getLocation(Direction.NORTH));
    }

    public void moveBackward()
    {
        //return Direction.NORTH;
        setNewLocation(getLocation(Direction.SOUTH));
    }

    public void moveLeft()
    {
        //return Direction.NORTH;
        setNewLocation(getLocation(Direction.EAST));
    }

    public void moveRight()
    {
        //return Direction.NORTH;
        setNewLocation(getLocation(Direction.WEST));
    }

    public Point getLocation(Direction direction)
    {
        switch (direction)
        {
            //the idea is to add 1 to x,y to move forward subtract to move backwards
            case EAST:
                setLocation(new Point(1,1));

            case WEST:
                setLocation(new Point(1,1));

            case NORTH:
                setLocation(new Point(1,1));
            case SOUTH:
                setLocation(new Point(-1,-1));
                default:
                    setLocation(new Point(1,1));
        }

        return getLocation();
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}

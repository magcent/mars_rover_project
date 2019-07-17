package com.project.marsrover;

import java.util.ArrayList;

public class FaultsObstacles {
    private Location location;
    private ArrayList recordedObstacles;

    public FaultsObstacles()
    {
        //recorded obstacle locations
        Point obstacle1 = new Point(1,2);
        Point obstacle2 = new Point(3,4);
        Point obstacle3 = new Point(6,7);
        Point obstacle4 = new Point(2,0);

        recordedObstacles.add(obstacle1);
        recordedObstacles.add(obstacle2);
        recordedObstacles.add(obstacle3);
        recordedObstacles.add(obstacle4);
    }

    public boolean locationHasObstacles(Point location)
    {
        if(recordedObstacles.contains(location))
            return true;
        else
            return false;
    }

    public ArrayList getObstacles()
    {
        return this.recordedObstacles;
    }
}

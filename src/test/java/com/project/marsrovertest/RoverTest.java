package test.java.com.project.marsrovertest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import static org.assertj.core.api.Assertions.*;
import com.project.marsrover.*;


/*
* Rover is class to simulate the mars kata rover
* test are limitless, this file includes basic tests
* */
public class RoverTest {

    private Rover rover;
    private char [] commands = {'f'};
    //obstacles are defined in FaultObstacles
    FaultsObstacles obstacles;

    @Before
    public void beforeRoverTest() {
        rover = new Rover(commands);
        obstacles = new FaultsObstacles();
    }

    @Test
    public void newRoverShouldHaveCommandsSet() {
        assertThat(rover.commands.getCommands()).isEqualToComparingFieldByField(commands);
    }

    @Test
    public void obstaclesAreSet() {
        assertThat(obstacles.getObstacles().size()).isEqualToComparingFieldByField(4);
    }
}
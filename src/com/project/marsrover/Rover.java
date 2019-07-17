package com.project.marsrover;

/*
* Rover - Class receives char of commands
* */
public class Rover {

    public Commands commands;
    public Location location;

    //constructor of Rover class receives commnds
    public Rover(char[] com)
    {
        commands = new Commands(com);
    }

    public void moveRover()
    {
        //move rover based on commands
        location.move(commands);
    }
}



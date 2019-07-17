package com.project.marsrover;

public class Main {

    //main method, entry point
    public static void main(String args[])
    {
        char [] commands = {'f'};

        Rover rover = new Rover(commands);
        rover.moveRover();
    }
}

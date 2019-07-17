package com.project.marsrover;

public class Commands {

    private char [] commands;

    public char[] getCommands() {
        return commands;
    }

    public void setCommands(char[] commands) {
       this.commands = commands;
    }

    public Commands(char[] commands)
    {
        this.setCommands(commands);
    }
}

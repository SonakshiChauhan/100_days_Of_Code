package com.company;
/*
Runtime: 1ms
Space:42.6 MB
 */
public class goalparser {
    public String interpret(String command) {
        command=command.replace("()","o").replace("(al)","al");

        return command;
    }
}

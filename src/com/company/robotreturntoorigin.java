package com.company;
/*
Runtime:8 ms
Space:44.5 MB
 */
public class robotreturntoorigin {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int rl=0;
        for(int x=0;x<moves.length();x++){
            if(moves.charAt(x)=='U'){ud--;}
            else if(moves.charAt(x)=='D'){ud++;}
            else if(moves.charAt(x)=='L'){rl--;}
            else if(moves.charAt(x)=='R'){rl++;}
        }
        if(ud==0 && rl==0){return true;}
        return false;

    }
}

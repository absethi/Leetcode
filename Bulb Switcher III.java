// Problem Link :- https://leetcode.com/problems/bulb-switcher-iii/
//Problem Description :-
// There is a room with n bulbs, numbered from 1 to n, arranged in a row from left to right. Initially, all the bulbs are turned off.

// At moment k (for k from 0 to n - 1), we turn on the light[k] bulb. A bulb change color to blue only if it is on and all the previous bulbs (to the left) are turned on too.

// Return the number of moments in which all turned on bulbs are blue.

//Solution:-
//The problem can besolved by simple approach of when the Right most light we hav traversed is equal to the total number of lights on at that moment.

class Solution {
   public int numTimesAllBlue(int[] light) {
        int rightMostLight = 0;
        int blueMoments = 0;
        int onLights = 0;
        
        for(int index = 0; index < light.length; index++){
            rightMostLight = Math.max(rightMostLight, light[index]);
            onLights++;
            
            if(rightMostLight == onLights){
                blueMoments++;
            }
        }
        
        return blueMoments;
}
}

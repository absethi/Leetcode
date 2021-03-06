//Problem Link:- https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
//Problem Description:-
// Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

// The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  

// Example 1:
// Input: n = 4
// Output: "pppz"
// Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
// Example 2:
// Input: n = 2
// Output: "xy"
// Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
// Example 3:
// Input: n = 7
// Output: "holasss"


class Solution {
    public String generateTheString(int n) {
        
        int m = n%2;
        StringBuffer ans = new StringBuffer("");
		//Check for length of String to Generate
        if (n>=3)
        {
			
		//if its an Odd Number add all characters of same type else add only one character of one type and rest of other
            if (m == 0)
            {
                ans = ans.append('k');
                while (n != 1)
                {
                    ans = ans.append('p');
                    n--;
                }
            }
            else
            {
                while (n != 0)
                {
                    ans = ans.append('p');
                    n--;
                }
            }        
        }
	//Check for characters if String is of length 2 and 1
     else
     {
         if (n == 2)
         {
             ans = ans.append('p');
             ans = ans.append('k');
         }
         if (n == 1)
         {
          ans = ans.append('p');   
         }
         
     }   
        return ans.toString();  
    }
}
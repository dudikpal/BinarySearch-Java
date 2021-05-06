Given two alphabet (can be lower and/or uppercase) strings s0 and s1, determine if one is a rotation of the other.

Constraints

    1 ≤ n ≤ 200,000 where n is the length of s0
    1 ≤ m ≤ 200,000 where m is the length of s1

Example 1
Input

s0 = "Cattywampus"

s1 = "sCattywampu"

Output

true

Example 2
Input

s0 = "Gardyloo"

s1 = "dylooGar"

Output

true

Explanation

This string is rotated on Gar and dyloo
Example 3
Input

s0 = "Taradiddle"

s1 = "diddleTara"

Output

true

Example 4
Input

s0 = "Snickersnee"

s1 = "Snickersnee"

Output

true

Explanation

This one is tricky but it's still a rotation, between `` and Snickersnee
Solved1,143  
Attempted1,662  
Rate68.78%  
Your code took 175 milliseconds — faster than 16.60% in Java
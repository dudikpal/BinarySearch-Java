Given a two-dimensional matrix of characters board and a string target, return whether the target can be found in the matrix by going left-to-right, or up-to-down unidirectionally.

Constraints

    n, m ≤ 250 where n is the number of rows and columns in board
    k ≤ 250 where k is the length of word

Example 1
Input

board = [
["H", "E", "L", "L", "O"],
["A", "B", "C", "D", "E"]
]

word = "HELLO"

Output

true

Example 2
Input

board = [
["x", "z", "d", "x"],
["p", "g", "u", "x"],
["k", "j", "z", "d"]
]

word = "xgz"

Output

false

Explanation

You can't make "xgz" going left-to-right or up-to-down.
Solved962  
Attempted1,375  
Rate69.97%  
Your code took 21 milliseconds — faster than 54.11% in Java
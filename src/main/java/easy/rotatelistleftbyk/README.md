Write a function that rotates a list of numbers to the left by k elements. Numbers should wrap around.

Note: The list is guaranteed to have at least one element, and k is guaranteed to be less than or equal to the length of the list.

Bonus: Do this without creating a copy of the list. How many swap or move operations do you need?

Constraints

    n ≤ 100,000 where n is the length of nums

Example 1
Input

nums = [1, 2, 3, 4, 5, 6]

k = 2

Output

[3, 4, 5, 6, 1, 2]

Example 2
Input

nums = [1, 2, 3, 4, 5, 6]

k = 6

Output

[1, 2, 3, 4, 5, 6]

Example 3
Input

nums = [1]

k = 0

Output

[1]

Solved2,299  
Attempted2,775  
Rate82.85%  
Your code took 82 milliseconds — faster than 64.06% in Java
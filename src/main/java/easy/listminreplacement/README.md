Given a list of integers nums, replace every nums[i] with the smallest integer left of i. Replace nums[0] with 0.

Constraints

    1 ≤ n ≤ 100,000 where n is the length of nums

Example 1
Input

nums = [10, 5, 7, 9]

Output

[0, 10, 5, 5]

Explanation

    nums[0] = 0 by definition
    nums[1] = min(10)
    nums[2] = min(5, 10)
    nums[3] = min(7, 5, 10)

Solved 1,069  
Attempted 1,539  
Rate 69.47%  
Your code took 59 milliseconds — faster than 82.69% in Java
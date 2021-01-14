# Digib recruitment task
## Task 1
    To find the number of anagrams in the given string:
        1. "Find" method will loop through the string and find the substrings with the query length
        2. "Helper" method will return a list of occurances of each alphabet in the strings
        3. "compare" method will check if the lists returned from helper method for each substring is equal to the list of the query string which indicates if they are anagrams
**o(n)**     

## Task2
    To spiral from the given cell in the given space:
        1. will move vertically according to the given "distance" value
        2. will move horizontally according to the given "distance" value
        3. considering the current distance will find the next distance and call the function again to repeat the above steps
        4. if the cell is not in the given space will ignore the cell and move to the next one
        5. spiral is done when all of the cells are visited
**o(n^2)**      where n = max(grid.length, grid.width)

## Task3
    To find the actual time between 3 inputs in different test cases:
        1. input needs to be in the "HH:mm" format 
        2. will First sort the times in ascending order
        3. two times can have two differences (H2-H1) or (12 -(H2-H1))
        4. will check the possilbe cases with the differences to find the actual time


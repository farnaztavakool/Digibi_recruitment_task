# Digib recruitment task
## Task 1
    To find the number of anagrams in the given string:
        1. "Find" method will loop through the string and find the substrings with the query length
        2. "Helper" method will return a hashMap of the characters in the string and their quantity
        3. "compare" method will check if the two strings are anagrams by comparing the hashmaps of the strings returned by "Helper" function
**O(a*b^2)** a= length of string1 b = length of query

## Task2
    To spiral from the given cell in the given space:
        1. will move horizontally according to the given "distance" value
        2. will move vertically according to the given "distance" value
        3. considering the current distance will find the next distance and call the function again to repeat the above steps
        4. if the cell is not in the given space will ignore the cell and move to the next one
        5. spiral is done when all of the cells are visited



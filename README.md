# Island Problem - Castaways variation

The standard "islands problem" is an interview question where you are tasked with counting the number of islands in a two-dimensional matrix. 
The goal is to determine how many stops (e.g. by boat) are required to visit each island on the grid only once. 

- https://leetcode.com/problems/number-of-islands/description/
- https://www.geeksforgeeks.org/find-the-number-of-islands-using-dfs/

The solution involves counting and marking each island as it is encountered, and then not counting any previously-marked island.
Use a recursive method to discover each location of the matrix that belongs to a particular island, in order for all parts of the island to be marked as known.

In this variation, certain islands have one or more people stranded on them.
The goal is to visit only those islands that have at lease one castaway on them, and so determine the minimum number of stops required. 

- There could be multiple castaways on a paticular island
- Certain islands could have no survivors

For example **(in this case, answer is 1)**: 

| | 0  | 1 | 2  | 3 | 4 |
| :---: | :---: | :---: | :---: | :---: | :---: |
| 0 | X  | island  | island (Castaway)  | island  | X  |
| 1 | island  | island  | X  | X  | X  |
| 2 | X  | island (Castaway)  | X  | island  | island  |
| 3 | X  | X  | X  | island  | island  |

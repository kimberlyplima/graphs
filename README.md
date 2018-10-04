# graphs
First project of the theory of graphs subject.

Assuming the nodes of a given graph were cities, the goal of the project was to find the main city and count how many cities were at a certain distance from the capital.
The algorithm should return a vector containing the number of cities in each distance.

For example: according to the given graph, there was three cities at distance 2 from the capital. So the vector should be filled with the integer 3 at the position 2.

To meet this goal, I implemented the BFS search algorithm using a distance vector instead of a visitation vector.

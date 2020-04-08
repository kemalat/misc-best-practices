### Binary Search

### Binary Tree

Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures.Tree use case might be storing information that naturally forms a hierarchy. A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child.A tree is represented by a pointer to the topmost node in tree. If the tree is empty, then value of root is NULL.
A Tree node contains following parts.
1. Data
2. Pointer to left child
3. Pointer to right child

### Divide and Conquer algorithms

Problem is divided into smaller pieces and each piece work is tried to solve independently. Once all of the pieces are solved, result of each smaller solution is combine them into a single integrated comprehensive solution.This process can be performed recursively. This recursive division of the problem is performed until each individual problem is small enough to become relatively trivial to solve.Some common examples of Divide and Conquer algorithms are binary search, sorting algorithms (e.g., Merge Sort, Quicksort), optimization of computationally complex mathematical operations (Exponentiation, FFT, Strassen’s algorithm), and others.

### Merge sort

Merge sort recursively halves the given array. Once the subarrays reach trivial length, merging begins. Merging takes the smallest element between two adjacent subarrays and repeats that step until all elements are taken, resulting in a sorted subarray. The process is repeated on pairs of adjacent subarrays until we arrive at the starting array, but sorted.

### Breadth First Search Algorithm
The BFS algorithm traverses a graph in the breadthwards motion. It uses a queue to remember the next vertex for starting a search when a dead end occurs in any iteration.

BFS Output for the below tree : 1 2 4 8 5 7 3 6 10 9
- Start with 1
- Adjacent vertexes of 1 : 2,4
- **2 or 4 can be selected : start with 2**
- Adjacent vertexes of 2 : **8,5,7,3**
- Any of 8,5,7,3 can be selected : start with 8
- Adjacent vertexes of 8 : 2,5,7 (All visited, discard)
- Adjacents of **8** traversed
- Continue from adjacents of 5 : 2,6,7,8( All of them visited except 6)
- Adjacents of **5** traversed
- Continue from adjacents of 7 :2,5,8( All of them visited, discard them)
- Adjacents of **7** traversed
- Adjacent vertexes of 3 : 10, 9
- Adjacents of **3** traversed. 
- **Adjacent vertexes of 2 traversed. Now start with 4**
- Adjacent vertexes of 4 : 1, 3( All of them visited, discard them)

```
              6
             /            
            / 
     1     5
    / \   /|\
   /   \ / | \
  4     2 --- 7
   \   / \ | /
    \ /   \|/ 
     3     8
    / \
   /   \
  10    9
```
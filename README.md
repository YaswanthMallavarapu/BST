Binary Search Tree (BST) Implementation 🌳
A Binary Search Tree (BST) is a node-based tree structure where:

Left subtree contains smaller values than the parent node.

Right subtree contains larger values than the parent node.

No duplicate nodes are allowed.

BST Example

🔍 BST Traversal Techniques
1️⃣ In-Order (Left → Root → Right)
Returns values in sorted order.

python
[1, 3, 4, 6, 7, 8, 10, 13, 14]
2️⃣ Pre-Order (Root → Left → Right)
Useful for copying the tree.

python
[8, 3, 1, 6, 4, 7, 10, 14, 13]
3️⃣ Post-Order (Left → Right → Root)
Useful for deleting the tree.

python
[1, 4, 7, 6, 3, 13, 14, 10, 8]
4️⃣ Level-Order (Breadth-First Search - BFS)
Visits nodes level by level.

python
[8, 3, 10, 1, 6, 14, 4, 7, 13]
💻 Basic Usage Example
javascript
const BST = require('./bst');

const tree = new BST();
tree.insert(8);
tree.insert(3);
tree.insert(10);
tree.insert(1);

console.log(tree.inOrder()); // [1, 3, 8, 10]
console.log(tree.contains(5)); // false
📌 Key Features
✔ Insert, Delete, Search
✔ Multiple Traversal Methods
✔ Balanced Tree Check
✔ Min/Max Value Search

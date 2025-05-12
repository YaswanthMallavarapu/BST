<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Binary Search Tree (BST) Implementation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            color: #333;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 5px;
            border-radius: 3px;
            font-family: monospace;
        }
        pre {
            background-color: #f8f8f8;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
        .highlight {
            background-color: #fffde7;
            padding: 2px 5px;
        }
    </style>
</head>
<body>
    <h1>Binary Search Tree (BST) Implementation</h1>
    
    <p>
        This repository contains a complete implementation of a Binary Search Tree (BST) data structure 
        with various operations and utility functions.
    </p>
    
    <h2>Table of Contents</h2>
    <ul>
        <li><a href="#features">Features</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#usage">Usage</a></li>
        <li><a href="#api">API Reference</a></li>
        <li><a href="#examples">Examples</a></li>
        <li><a href="#tests">Tests</a></li>
        <li><a href="#contributing">Contributing</a></li>
        <li><a href="#license">License</a></li>
    </ul>
    
    <h2 id="features">Features</h2>
    <ul>
        <li>Insertion of nodes</li>
        <li>Deletion of nodes</li>
        <li>Search for values</li>
        <li>Various tree traversals:
            <ul>
                <li>In-order</li>
                <li>Pre-order</li>
                <li>Post-order</li>
                <li>Level-order (BFS)</li>
            </ul>
        </li>
        <li>Tree visualization (ASCII representation)</li>
        <li>Utility functions:
            <ul>
                <li>Find minimum/maximum values</li>
                <li>Check if tree is balanced</li>
                <li>Calculate height/depth</li>
                <li>Count nodes/leaves</li>
            </ul>
        </li>
    </ul>
    
    <h2 id="installation">Installation</h2>
    
    <h3>Using npm</h3>
    <pre><code>npm install bst-implementation</code></pre>
    
    <h3>Manual Installation</h3>
    <pre><code>git clone https://github.com/yourusername/bst-implementation.git
cd bst-implementation
npm install</code></pre>
    
    <h2 id="usage">Usage</h2>
    <p>Basic usage example:</p>
    
    <pre><code>const BST = require('./bst');

// Create a new BST
const tree = new BST();

// Insert values
tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(3);
tree.insert(7);

// Search for a value
console.log(tree.contains(7)); // true
console.log(tree.contains(12)); // false

// In-order traversal
console.log(tree.inOrder()); // [3, 5, 7, 10, 15]

// Visualize the tree
tree.print();</code></pre>
    
    <h2 id="api">API Reference</h2>
    
    <h3>Core Methods</h3>
    <ul>
        <li><code>insert(value)</code> - Inserts a new node with the given value</li>
        <li><code>delete(value)</code> - Removes the node with the given value</li>
        <li><code>contains(value)</code> - Returns true if the value exists in the tree</li>
        <li><code>find(value)</code> - Returns the node with the given value</li>
    </ul>
    
    <h3>Traversal Methods</h3>
    <ul>
        <li><code>inOrder()</code> - Returns values in in-order traversal</li>
        <li><code>preOrder()</code> - Returns values in pre-order traversal</li>
        <li><code>postOrder()</code> - Returns values in post-order traversal</li>
        <li><code>levelOrder()</code> - Returns values in level-order (BFS) traversal</li>
    </ul>
    
    <h3>Utility Methods</h3>
    <ul>
        <li><code>min()</code> - Returns the minimum value in the tree</li>
        <li><code>max()</code> - Returns the maximum value in the tree</li>
        <li><code>height()</code> - Returns the height of the tree</li>
        <li><code>isBalanced()</code> - Returns true if the tree is balanced</li>
        <li><code>countNodes()</code> - Returns the total number of nodes</li>
        <li><code>countLeaves()</code> - Returns the number of leaf nodes</li>
        <li><code>print()</code> - Prints an ASCII representation of the tree</li>
    </ul>
    
    <h2 id="examples">Examples</h2>
    
    <h3>Building a BST</h3>
    <pre><code>const BST = require('./bst');
const tree = new BST();

[8, 3, 10, 1, 6, 14, 4, 7, 13].forEach(num => tree.insert(num));</code></pre>
    
    <h3>Tree Visualization</h3>
    <pre><code>tree.print();

// Output:
//       8
//     /   \
//    3     10
//   / \      \
//  1   6     14
//     / \    /
//    4   7 13</code></pre>
    
    <h3>Finding the Height</h3>
    <pre><code>console.log(tree.height()); // 3</code></pre>
    
    <h2 id="tests">Tests</h2>
    <p>To run the test suite:</p>
    <pre><code>npm test</code></pre>
    
    <h2 id="contributing">Contributing</h2>
    <p>Contributions are welcome! Please follow these steps:</p>
    <ol>
        <li>Fork the repository</li>
        <li>Create your feature branch (<code>git checkout -b feature/AmazingFeature</code>)</li>
        <li>Commit your changes (<code>git commit -m 'Add some AmazingFeature'</code>)</li>
        <li>Push to the branch (<code>git push origin feature/AmazingFeature</code>)</li>
        <li>Open a Pull Request</li>
    </ol>
    
    <h2 id="license">License</h2>
    <p>Distributed under the MIT License. See <code>LICENSE</code> for more information.</p>
</body>
</html>

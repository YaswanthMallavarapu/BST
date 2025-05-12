<h1>Binary Search Tree (BST) Implementation</h1>

<h2>What is a BST?</h2>
<p>A Binary Search Tree is a node-based binary tree where:</p>
<ul>
    <li>Left subtree contains only nodes with values less than the parent</li>
    <li>Right subtree contains only nodes with values greater than the parent</li>
    <li>No duplicate nodes allowed</li>
</ul>

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Binary_search_tree.svg/400px-Binary_search_tree.svg.png" alt="BST Example">

<h2>Traversal Techniques</h2>

<h3>1. In-Order (Left, Root, Right)</h3>
<p>Returns values in sorted order</p>
<pre>Example: [1, 3, 4, 6, 7, 8, 10, 13, 14]</pre>

<h3>2. Pre-Order (Root, Left, Right)</h3>
<p>Useful for copying the tree</p>
<pre>Example: [8, 3, 1, 6, 4, 7, 10, 14, 13]</pre>

<h3>3. Post-Order (Left, Right, Root)</h3>
<p>Useful for deleting the tree</p>
<pre>Example: [1, 4, 7, 6, 3, 13, 14, 10, 8]</pre>

<h3>4. Level-Order (Breadth-First)</h3>
<p>Visits nodes level by level</p>
<pre>Example: [8, 3, 10, 1, 6, 14, 4, 7, 13]</pre>

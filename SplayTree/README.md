<!-- doc.py -->
System.out.println("Leave counts :" + impl.leafCount(impl.getRoot(12)));
System.out.println("Leave counts :" + impl.leafSum(impl.getRoot(24)));
[src/main/java/Main.java](src/main/java/Main.java)

Left child rotate
Right child rotate
adjustTree function to perform rotations and zig - zig, zig-zag operations.
left child data match do simple left child rotate
zig-zig
zig-zag
right child data match do simple left child rotate
zig-zig
zig-zag
Link node and its all parent after zig-zig or zig-zag
set root to node.
The root is now that of the final tree
Check if any node exist or not.
item need to be added
item and root where it need to be added
Get the root value
Get the current root of the tree.
preorder traversal of the tree.
count the leaf in tree.
count leaf sum
[src/main/java/SplayTreeMap.java](src/main/java/SplayTreeMap.java)

Удаляем элемент 6
Удаляем элемент 4
Удаляем элемент 5
[src/main/java/SplayTreeMapTest.java](src/main/java/SplayTreeMapTest.java)


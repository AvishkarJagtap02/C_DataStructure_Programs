// Building Tree and printing  preorder and Inorder and PostOrder and LevelOrder and count NOdes

import java.util.*;
class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
	       this.data = data;
       	       this.left = null;
	       this.right = null;
	}
}	
class BT {
	static int idx = -1;
	public static Node buildTree(int nodes[]) {
		idx++;
		if(nodes[idx] == -1) {
			return null;
		}
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);
		
		return newNode;
	}
	public static void Preorder(Node root) {
		
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		Preorder(root.left);
		Preorder(root.right);
	}
	public static void Inorder(Node root) {
		
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	public static void Postorder(Node root) {
		
		if(root==null) {
			return;
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(curr.data+" ");
				if(curr.left!=null) {
					q.add(curr.left);
				}if(curr.right!=null) {
					q.add(curr.right);
				}
			}
			
		}
	}
	public static int countNodes(Node root) {
        	if(root == null) {
            		return 0;
        	}if(root.left == null && root.right == null) {
            		return 1;
        	}
        	int leftCount = countNodes(root.left);
        	int rightCount = countNodes(root.right);

        	return leftCount + rightCount + 1;
    	}

	public static void main(String args[]) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BT tree = new BT();
		Node root = tree.buildTree(nodes);
		Preorder(root);
		System.out.println();
		Inorder(root);
		System.out.println();
		Postorder(root);
		System.out.println();
		levelOrder(root);
		System.out.println();
		int count = countNodes(root);
		System.out.println("Count of Nodes = "+ count);

	}
}

import java.util.Scanner;

class TreeNode {
	char data;
	TreeNode left;
	TreeNode right;

	public TreeNode(char data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class LinkedTree {
	TreeNode root;

	public void add(char data, char leftData, char rightData) {
		if (root == null) {
			if (data != '.')
				root = new TreeNode(data);
			if (leftData != '.')
				root.left = new TreeNode(leftData);
			if (rightData != '.')
				root.right = new TreeNode(rightData);
		} else
			search(root, data, leftData, rightData);
	}

	private void search(TreeNode root, char data, char leftData, char rightData) {
		if (root == null)
			return;
		else if (root.data == data) {
			if (leftData != '.')
				root.left = new TreeNode(leftData);
			if (rightData != '.')
				root.right = new TreeNode(rightData);
		} else {
			search(root.left, data, leftData, rightData);
			search(root.right, data, leftData, rightData);
		}
			
	}

	public void preorder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + "");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + "");
			inorder(root.right);
		}
	}

	public void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + "");
		}
	}

}

public class Main1991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LinkedTree tree = new LinkedTree();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			String input = sc.nextLine();
			char root = input.charAt(0);
			char left = input.charAt(2);
			char right = input.charAt(4);
			tree.add(root, left, right);
		}


		
		tree.preorder(tree.root);
		System.out.println();
		tree.inorder(tree.root);
		System.out.println();
		tree.postorder(tree.root);
	}

}

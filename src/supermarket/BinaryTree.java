/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eska
 */
class TreeNode {

    Employee employee;
    TreeNode left, right;

    TreeNode(Employee employee) {
        this.employee = employee;
        left = right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        root = null;

    }

    // Method to insert a new node with given key
    public void insert(Employee emp) {
        root = insertRec(root, emp);
    }

    // A recursive function to insert a new key in BST 
    private TreeNode insertRec(TreeNode root, Employee emp) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(emp);
            return root;
        }

        // Otherwise, recur down the tree 
        if (root.employee.getFullName().compareToIgnoreCase(emp.getFullName()) <= 0) {
            root.left = insertRec(root.left, emp);
        } else {
            root.right = insertRec(root.right, emp);
        }

        // return the (unchanged) node pointer 
        return root;
    }

    void levelOrder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print("Level " + level + ": ");  // nodes in the current level

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                System.out.print(root.employee + " ");

                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
            System.out.println();
            level++;
        }
        System.out.println("Total Level: "+level);
    }

    public void mainTree(ArrayList<Employee> list) {
        BinaryTree tree = new BinaryTree();
        int i = 0, half = list.size() / 2;
//        insert(list.get(half));
        while (i < list.size()) {
//            if (i == half) {
//                i++;
//            }
            insert(list.get(i));
            i++;
        }
        levelOrder();

    }

}

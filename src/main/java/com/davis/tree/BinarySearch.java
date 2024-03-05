package com.davis.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}


public class BinarySearch {

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static int getHeight(Node root){
        //Write your code here
        if(root == null){
            return 0;
        }
        else{
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);


            if(leftHeight > rightHeight){
                return leftHeight+1;
            }
            else
                return rightHeight+1 ;
        }



    }
    //Level-Order Traversal
    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            Node temp = queue.poll();
            System.out.print(temp.data+ " ");

            if( temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }

        }

    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root,3);
        root = insert(root,5);
        root = insert(root,2);
        root = insert(root,1);
        root = insert(root,4);
        root = insert(root,6);
        root = insert(root,7);

        int height=getHeight(root);
        System.out.println(height);
    }
}

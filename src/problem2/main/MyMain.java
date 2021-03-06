/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree a = new MyBinarySearchTree();
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        System.out.println("PreOrder traversal ::");
        a.print();
        System.out.println("PostOrder traversal ::");
        a.printPostorder();
    }
}

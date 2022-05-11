package com.example.leetcodesolvingproblemsalgorithms;

public class Node{
    private String name;
    int left;
    int right;

    public Node(String name, int left, int right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "com.example.leetcodesolvingproblemsalgorithms.Node{" +
                "name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}

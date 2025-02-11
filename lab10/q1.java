/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author KH
 */
public class q1 {
   class ArrayBinaryTree {
    private String[] tree;
    private int size;

    // إنشاء شجرة بحجم معين
    public ArrayBinaryTree(int capacity) {
        tree = new String[capacity]; // مصفوفة لتخزين العقد
        size = 0; // عدد العقد الفعلي في الشجرة
    }

    // تعيين الجذر
    public void setRoot(String value) {
        tree[0] = value;
        size = 1;
    }

    // إضافة ابن أيسر
    public void setLeft(int parentIndex, String value) {
        int leftChildIndex = 2 * parentIndex + 1;
        if (tree[parentIndex] != null && leftChildIndex < tree.length) {
            tree[leftChildIndex] = value;
            size++;
        } else {
            System.out.println("لا يمكن إضافة ابن أيسر في هذا الموقع");
        }
    }

    // إضافة ابن أيمن
    public void setRight(int parentIndex, String value) {
        int rightChildIndex = 2 * parentIndex + 2;
        if (tree[parentIndex] != null && rightChildIndex < tree.length) {
            tree[rightChildIndex] = value;
            size++;
        } else {
            System.out.println("لا يمكن إضافة ابن أيمن في هذا الموقع");
        }
    }

    // طباعة عناصر الشجرة بترتيب المصفوفة
    public void printTree() {
        for (int i = 0; i < tree.length; i++) {
            System.out.println("المؤشر " + i + ": " + tree[i]);
        }
    }
}

// **اختبار الشجرة الثنائية**

    public static void main(String[] args) {
        ArrayBinaryTree tree = new ArrayBinaryTree(10); // شجرة بحجم 10

        tree.setRoot("A"); // الجذر
        tree.setLeft(0, "B"); // ابن أيسر للجذر
        tree.setRight(0, "C"); // ابن أيمن للجذر
        tree.setLeft(1, "D"); // ابن أيسر للعقدة B
        tree.setRight(1, "E"); // ابن أيمن للعقدة B
        tree.setLeft(2, "F"); // ابن أيسر للعقدة C
        tree.setRight(2, "G"); // ابن أيمن للعقدة C

        // طباعة عناصر الشجرة
        System.out.println("الشجرة الثنائية المخزنة في المصفوفة:");
        tree.printTree();
    }
}
 


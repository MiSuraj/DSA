import HashMap.HashMap;
import LinkedLists.LinkedList;
import Tree.TreeNode;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {


//    //make object of Linked List and add element into them
//    LinkedList<Integer> list = new LinkedList<>();
//    list.add(34);
//    list.add(36);
//    list.add(576);
//    list.add(5677);
//    list.printList(list);
//
//    //Binary Tree
//        //Brute force Method
//        TreeNode<Integer> first=new TreeNode<>(10);
//        TreeNode<Integer> second=new TreeNode<>(30);
//        TreeNode<Integer> third=new TreeNode(89);
//        TreeNode<String> fourth=new TreeNode<>("SURAJ");
//        first.setLeft(second);
//        first.setRight(third);
//        third.setRight(fourth);
//        //
//       TreeNode<String> root=new TreeNode<>("SURAJMISHRA");
//       root.setLeft(new TreeNode(45));
//       root.setLeft(new TreeNode(74));
        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("Suraj",19);
        hashMap.put("karan",89);
        hashMap.put("karan",404);
        hashMap.put("SuraM",29);
        hashMap.put("ww",29);
        hashMap.put("39",35);
        hashMap.put("di",353);
        hashMap.put("jdf",34);
        //System.out.println("Suraj".hashCode()+" w "+"SuraM".hashCode());
       // System.out.println("SuraK".hashCode()+" "+"Sur".hashCode()+" "+"ww".hashCode());
        System.out.println(hashMap.get());








   }

}

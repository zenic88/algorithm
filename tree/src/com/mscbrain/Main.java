package com.mscbrain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String startNode = "";

        Map<String, Map<String, String>> tree = new HashMap<>();
        for(int i = 0; i < num; i++){
            String str = sc.nextLine();

            if(i == 0){
                startNode = str.split(" ")[0];
            }

            Map<String, String> map = new HashMap<>();
            map.put("left", str.split(" ")[1]);
            map.put("right", str.split(" ")[2]);
            tree.put(str.split(" ")[0], map);
        }

        preOrder(tree, startNode);
        System.out.println();
        inOrder(tree, startNode);
        System.out.println();
        postOrder(tree, startNode);
    }

    public static void preOrder(Map<String, Map<String, String>> tree, String node){

        System.out.print(node);

        if(!tree.get(node).get("left").equals(".")){
            preOrder(tree, tree.get(node).get("left"));
        }

        if(!tree.get(node).get("right").equals(".")){
            preOrder(tree, tree.get(node).get("right"));
        }

    }

    public static void inOrder(Map<String, Map<String, String>> tree, String node){

        if(!tree.get(node).get("left").equals(".")){
            inOrder(tree, tree.get(node).get("left"));
        }

        System.out.print(node);

        if(!tree.get(node).get("right").equals(".")){
            inOrder(tree, tree.get(node).get("right"));
        }

    }

    public static void postOrder(Map<String, Map<String, String>> tree, String node){

        if(!tree.get(node).get("left").equals(".")){
            postOrder(tree, tree.get(node).get("left"));
        }

        if(!tree.get(node).get("right").equals(".")){
            postOrder(tree, tree.get(node).get("right"));
        }

        System.out.print(node);

    }
}

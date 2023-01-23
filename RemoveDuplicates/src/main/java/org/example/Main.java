package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Nhlakanipho");
        name.add("Nontu");
        name.add("Nonka");
        name.add("Ndox");
        name.add("Thobi");
        name.add("Ndox");
        name.add("Nonka");
        System.out.println("Names before checking for duplicates:");
        for (String str : name){
            System.out.print(str + " ");
        }
        System.out.println();
        int current = 0;
        while( current < name.size()){
            int j = 0;
            boolean isRemoved = false;
            while (j < current){
                if(name.get(current).equals(name.get(j))){
                    name.remove(current);
                    isRemoved = true;
                    break;
                }
                else{
                    j++;
                }
            }
            if( !isRemoved){
                current++;
            }
        }
        System.out.println("Names after checking for duplicates:");
        for(String str : name){
            System.out.print(str + " ");
        }
    }
}
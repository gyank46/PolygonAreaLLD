package com.example.Flyweight;//package com.example.Flyweight;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Set;

public class Client {

    public static void main(String[] args) {

//        System.out.println();
        String [] l = solution(new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"});

        for( int i=0;i<l.length;i++){
            System.out.println(l[i]);
        }

    }

    public static String[] solution(String[] l) {
        //Your code here

        int n = l.length;

        java.util.Arrays.sort(l,new java.util.Comparator<String>() {
            @Override
            public int compare(String A, String B) {

                int nA = A.length();
                int nB = B.length();

                for(int i=0,j=0;i<nA || j<nB;i++,j++){
                    String currA="";
                    String currB="";

                    if(i<nA && j>=nB)
                        return 1;

                    if(i>=nA && j<nB)
                        return -1;



                    while(i<nA && A.charAt(i)!='.'){
                        currA+=A.charAt(i);
                        i++;
                    }

                    while(j<nB && B.charAt(j)!='.'){
                        currB+=B.charAt(j);
                        j++;
                    }

                    if(Integer.parseInt(currA)>Integer.parseInt(currB)){
                        return 1;
                    }else if(Integer.parseInt(currA)<Integer.parseInt(currB)){
                        return -1;
                    }
                }
                return 0;
            }
        });

        return l;
    }

}

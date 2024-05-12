package org.example;

public class JewelsAndStones {
    public static int countJewelsInStones(String jewels, String stones){
        int count = 0;
        for (int i = 0; i < stones.length(); i++){
            char stone = stones.charAt(i);
            if (jewels.indexOf(stone) != -1){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(countJewelsInStones("aA", "aAAbbbb")  );
        System.out.println(countJewelsInStones("z", "ZZ"));
    }
}

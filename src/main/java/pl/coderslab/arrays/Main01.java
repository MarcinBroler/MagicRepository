package pl.coderslab.arrays;


import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {

        int[] mainTab = new int[50];
        for(int i =0; i < mainTab.length; i++) {
            mainTab[i] = i;
        }
        System.out.println(Arrays.toString(mainTab));

        int lineCounter = 0;
        for(int i= 0; i < mainTab.length;i++) {

            if( i < 10) {
                System.out.print("0" + mainTab[i] + ", ");
            } else {
                System.out.print(mainTab[i] + ", ");
            }

            lineCounter++;
            if(lineCounter == 10) {
                System.out.println();
                lineCounter = 0;
            }

        }


    }
}

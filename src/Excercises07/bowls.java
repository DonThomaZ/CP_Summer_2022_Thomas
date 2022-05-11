package Excercises07;

import java.util.Scanner;

public class bowls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, bowls=0, i=1;
        rows = input.nextInt();
        while(i<=rows){
            bowls += i;
            i++;
        }
        System.out.println(bowls);
    }
}

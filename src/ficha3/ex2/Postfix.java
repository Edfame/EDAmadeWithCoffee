package ficha3.ex2;

import ficha3.ArrayStack;

import java.util.Scanner;

public class Postfix {

    public static void main(String[] args) {

        ArrayStack<Integer> nums = new ArrayStack<>();

//        Scanner in = new Scanner(System.in);
//
//        String input = in.next();
//
//        String[] splited = input.split(" ");
//
//        for (int i = 0; i < splited.length; i++){
//            try {
//                nums.push(Integer.parseInt(splited[i]));
//            }catch (ArithmeticException e){
//                //TODO usar os operadores
//            }
//        }

        nums.push(1);
        nums.push(2);

        nums.pop();

        System.out.println(nums.toString());
    }
}

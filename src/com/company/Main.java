package com.company;


public class Main {

    public static void main(String[] args) throws StackError {
        stack stacks = new stack(10);

        stacks.push("45");
        stacks.print();
        for (int i = 0; i <= 15; i++)
        {
            try {
                stacks.push("45");
            }
            catch (StackError error) {
                System.out.println(error.getMessage());
            }
        }
        stacks.print();
        for (int i = 0; i <= 15; i++)
        {
            try {
                stacks.pop();
            }
            catch (StackError error) {
                System.out.println(error.getMessage());
            }
        }

        for (int i = 0; i <= 9; i++)
        {
            try {
                stacks.push(20 + i);
            }
            catch (StackError error) {
                System.out.println(error.getMessage());
            }
        }
        stacks.print();
        for (int i = 0; i <= 9; i++)
        {
            try {
                System.out.println(stacks.search(20 + i));
            }
            catch (StackError error) {
                System.out.println(error.getMessage());
            }
        }
        stacks.print();
    }

}

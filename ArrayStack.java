import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayStack {

    public static void main(String[] args) {
        System.out.println("Welcome to Stak Data Structure ");
        Stack s1 = new Stack(10);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.print");
            System.out.println("4.flush");
            System.out.println("5.store");
            System.out.println("6.load");
            System.out.println("7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s1.push();
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.print();
                    break;
                case 4:
                    s1.flush();
                    break;
                case 5:
                    s1.store("Stack.txt");
                    break;
                case 6:
                    s1.load("stack.txt");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have enter wrong input");
                    break;
            }
        }

    }

}

class Stack {

    Scanner sc = new Scanner(System.in);
    public int size;
    public int stk[];
    int st;

    public Stack(int size) {
        //    this.size = size;
        stk = new int[size];
        st = stk.length;
    }

    public void menu() {
        while (true) {
            int choise = sc.nextInt();
        }
    }

    public void push() {
        System.out.println("Enter the value for the push : ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if (st == 0) {
            System.out.println("Stack over flow");
        } else {
            st--;
            stk[st] = v;
        }
    }//push

    public int pop() {
        if (st == stk.length) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int temp = stk[st];
            st++;
            return temp;
        }
    }//pop

    public int peek() {
        if (st != stk.length) {
            return stk[st];
        } else {
            return -1;
        }
    }

    public void flush() {
        st = stk.length;
    }

    public void store(String s) {

        FileWriter fw = null;
        try {
            fw = new FileWriter(s);
        } catch (IOException ex) {
            Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw, true);
        pw.println("Values Store in File :");
        for (int i = st; i < stk.length; i++) {
            pw.println(stk[i]);
        }
    }

    public void load(String j) {
        FileReader fr = null;
        try {
            fr = new FileReader(j);
            BufferedReader br = new BufferedReader(fr);
            String str = null;
            try {
                str = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("<<<<<<<<<<<<<<<<<Print values from file>>>>>>>>>>>>>>>>>>>>");
            while (str != null) {
                System.out.println(str);
                try {
                    str = br.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void print() {
        System.out.println("<<<<<<<<<<Printing Stack>>>>>>>>>>");
        for (int i = st; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    }//print
}

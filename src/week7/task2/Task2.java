package week7.task2;
import java.io.FileNotFoundException;

import java.io.BufferedReader;

import java.io.FileReader;
import java.lang.NullPointerException ;

import java.lang.ArrayIndexOutOfBoundsException ;

import java.lang.ArithmeticException ;

import java.lang.ClassCastException;

import java.io.IOException;


public class Task2 {
    BufferedReader a;
    public void nullpoint() throws NullPointerException{
        String a= null;
        System.out.println(a.length());
    }
    public  void arrayindex()throws ArrayIndexOutOfBoundsException{
        int a[]= new int[1];
        a[3]= 8;
        System.out.println(a[3]);
    }
    public void arithmetic()throws ArithmeticException{
        int a= 2/0;
        System.out.println(a);
    }
    public void classcast()throws ClassCastException{
        class sv{};
        class gv extends sv{};
            sv a = new sv();
            gv b = (gv)a;

    }
    public void ioe ()throws IOException{
        a= new BufferedReader(new FileReader("file.txt"));

        StringBuilder sb= new StringBuilder();

        String line= a.readLine();

        while(line!=null) {

            sb.append(line+"\n");

            line=a.readLine();

        }

        String result= sb.toString();

        System.out.println(result);

    }
    public static void main(String[] argvs) {

        Task2 t= new Task2();

        try {

            t.nullpoint();

        }

        catch (NullPointerException e) {

            System.out.println("null poiter");

        }
        try{
            t.arrayindex();
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("array inder");

        }

        try {

            t.arithmetic();

        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic");

        }

        try {

            t.classcast();

        }

        catch (ClassCastException e) {

            System.out.println("Class cast");

        }

        try {

            t.ioe();

        }

        catch (FileNotFoundException e)  {

            System.out.println("file not found");

        }

        catch (IOException e) {

            System.out.println("IO");

        }

    }
}

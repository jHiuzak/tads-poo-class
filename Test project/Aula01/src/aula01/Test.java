/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author giovanni
 */
public class Test {
    Scanner scanner = new Scanner(System.in);
    
    public void ager(int age) throws InputMismatchException
    {
        System.out.println("Age: ");
        
        throw new InputMismatchException("You can only type an integer number.");
    }
}

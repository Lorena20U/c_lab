/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Stack;

/**
 *
 * @author yanet
 */
public class Labsemantic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> id = new Stack<>();
        Stack<String> identifier = new Stack<>();
        Stack<String> type = new Stack<>();
        Stack<String> scope = new Stack<>();
        Stack<String> location = new Stack<>();
        id.push(3);
        identifier.push("hola");
        System.out.println("Stack: " + id + identifier);
    }
    
}

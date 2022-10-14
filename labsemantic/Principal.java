/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import java.io.File;
import labsemantic.Root;

/**
 *
 * @author yanet
 */
public class Principal {
    public static void main(String[] args) {
        try {
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(new File("C:/Users/yanet/Documents/NetBeansProjects/labsemantic/src/test-json.json"), Root.class);
            System.out.println(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

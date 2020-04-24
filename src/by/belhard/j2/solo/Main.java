package by.belhard.j2.solo;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int yearNow,yearBorn,userAge,bDay;
        String userData;
        userData = JOptionPane.showInputDialog("Romeli welia?");
        yearNow = Integer.parseInt(userData);
        userData = JOptionPane.showInputDialog("Romel wels daibade?");
        yearBorn = Integer.parseInt(userData);
        userData = JOptionPane.showInputDialog("Gqondat wels dabadebis dge? ki-0, ara-1");
        bDay = Integer.parseInt(userData);
        userAge = yearNow - yearBorn - bDay;

        JOptionPane.showMessageDialog(null,"Tqveni asaki : " + userAge);


    }





















}

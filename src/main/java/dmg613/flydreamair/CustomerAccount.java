/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dmg613.flydreamair;

import java.util.*;
public class CustomerAccount {
    
    String username;
    String password;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    public CustomerAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
}

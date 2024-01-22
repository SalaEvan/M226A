/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evan.sala
 */
public class Player {
    public int point;
    
    private String username;
    
    public String getUsername() {
        return username;
    }

    public void setDimension(String username) {
        this.username = username;
    }
    public Player (){
        username = "user";
    }
    public Player (String username){
        this.username = username;
    }
}

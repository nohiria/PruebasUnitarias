/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pu_ej04_taskmanager;

import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class TaskManager {
    private final ArrayList<String> tasks;
    private int index;
    
    //Constructor
    public TaskManager() {
        tasks= new ArrayList<>();
        index= 0;
    }
    
    //Methods
    public void addTask(String task){
        tasks.add(task);
        index++;
    }
    
    public void removeTask(int index){
        if (index < 0 && index > tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        
        tasks.remove(index);
        index--;
    }
    
    public ArrayList<String> showTasks(){
        return new ArrayList<>(tasks);
    }   
    
}

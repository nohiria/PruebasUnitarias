/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pu_ej04_taskmanager.TaskManager;

/**
 *
 * @author nohyv
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void addTaskTest(){
        TaskManager tasksList= new TaskManager();
        
        tasksList.addTask("Tarea 1");
        tasksList.addTask("Tarea 2");
        tasksList.addTask("Tarea 3");
        
        ArrayList<String> expectedTasks= new ArrayList<>(Arrays.asList("Tarea 1", "Tarea 2", "Tarea 3"));
        
        assertEquals(expectedTasks, tasksList.showTasks());
    }
    
    @Test
    public void removeTaskTest(){
        TaskManager tasksList= new TaskManager();
        
        tasksList.addTask("Tarea 1");
        tasksList.addTask("Tarea 2");
        tasksList.addTask("Tarea 3");
        
        tasksList.removeTask(1);
        
        ArrayList<String> expectedTasks= new ArrayList<>(Arrays.asList("Tarea 1", "Tarea 3"));
        
        assertEquals(expectedTasks, tasksList.showTasks());
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidIndexRemoveTest(){
        TaskManager tasksList= new TaskManager();
        
        tasksList.removeTask(3); //Should throw IndexOutOfBoundsException
    }
    
    @Test
    public void showTasksEmptyTest() {
        TaskManager tasksList = new TaskManager();
        
        ArrayList<String> expectedTasks = new ArrayList<>(); //Empty tasks list
        
        assertEquals(expectedTasks, tasksList.showTasks()); //Verify that the tasks list in the TaskManager is empty
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author dhrutis
 */
public class ForkJoinDemo extends RecursiveAction {

    private long task = 0;

    public ForkJoinDemo(long task) {
        this.task = task;
    }

    @Override
    protected void compute() {
        try {
            //if workload is above threshold value 16,
            //break the task into smaller subtasks
            if (task > 16) {
                System.out.println("Splitting task: " + task);

                List<ForkJoinDemo> lstSubtasks = new ArrayList<>();
                
                  lstSubtasks.addAll(createSubtasks());

                for (RecursiveAction subtask : lstSubtasks) {
                    subtask.fork();
                }
                
            } else {
                System.out.println("Executing task: " + task);
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
            e.printStackTrace();
        }
    }

    private List<ForkJoinDemo> createSubtasks() {
        List<ForkJoinDemo> subtasks = new ArrayList<>();
        //create subtasks
        ForkJoinDemo subtask1 = new ForkJoinDemo(task / 2);
        ForkJoinDemo subtask2 = new ForkJoinDemo(task / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

            

        return subtasks;
    }

    public static void main(String[] args) {
        try {
            // submit the task to the pool with parallelism 4
            final ForkJoinPool pool = new ForkJoinPool();
            final ForkJoinDemo obj = new ForkJoinDemo(40);
            
            //call invoke() method. It calls the compute() method
            System.out.println(pool.invoke(obj));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

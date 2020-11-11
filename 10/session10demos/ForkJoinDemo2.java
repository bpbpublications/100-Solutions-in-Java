/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author dhrutis
 */
public class ForkJoinDemo2 extends RecursiveTask<Long> {

    private long workLoad = 0;

    public ForkJoinDemo2(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected Long compute() {

        //if work is above threshold, break tasks up into smaller tasks
        if (this.workLoad > 16) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<ForkJoinDemo2> subtasks = new ArrayList<>();
            subtasks.addAll(createSubtasks());

            for (ForkJoinDemo2 subtask : subtasks) {
                subtask.fork();
            }

            long result = 0;
            for (ForkJoinDemo2 subtask : subtasks) {
                result += subtask.join();
            }
            return result;

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
            return workLoad * 3;
        }
    }

    private List<ForkJoinDemo2> createSubtasks() {
        List<ForkJoinDemo2> subtasks = new ArrayList<>();

        ForkJoinDemo2 subtask1 = new ForkJoinDemo2(this.workLoad / 2);
        ForkJoinDemo2 subtask2 = new ForkJoinDemo2(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }

    public static void main(String[] args) {
        ForkJoinDemo2 obj = new ForkJoinDemo2(128);
        final ForkJoinPool pool = new ForkJoinPool();

        long mergedResult = pool.invoke(obj);

        System.out.println("mergedResult = " + mergedResult);
    }
}

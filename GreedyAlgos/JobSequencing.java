package GreedyAlgos;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int id;
        int deadLine;
        int profit;
        
        public Job(int i, int dl, int p){
            id = i; // 0->A 1->B 2->C 3->D
            deadLine = dl;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int JobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<JobInfo.length; i++){
            jobs.add(new Job(i,JobInfo[i][0],JobInfo[i][1]));
        }

        // assending order of profit
        // Collections.sort(jobs,(obj1,obj2) -> obj1.profit-obj2.profit);

        // descending order of profit
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("max jobs = "+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i) +" ");
        }
        System.out.println();

        
    }
}

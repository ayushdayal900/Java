// import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priority_queue {
    // simple
    // public static void main(String[] args) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<>(Constructor.reverseOrder());
    //     pq.add(3);  //O(logn)
    //     pq.add(4);  //O(logn)
    //     pq.add(1);  //O(logn)

    //     while(!pq.isEmpty()){
    //         System.out.println(pq.peek());  //O(1)
    //         pq.remove(); //O(logn)
    //     }
    // }


    // adding objects to pq
    public static class Student implements Comparable<Student>{   //overrinding
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }



    public static void main(String[] args) {
        // PriorityQueue<Student> s = new PriorityQueue<>();
        PriorityQueue<Student> s = new PriorityQueue<>(Comparator.reverseOrder());
        s.add(new Student("a", 4));
        s.add(new Student("b", 14));
        s.add(new Student("c", 2));
        s.add(new Student("d", 20));

        while (!s.isEmpty()) {
            System.out.println(s.peek().name + "->" + s.peek().rank);
            s.remove();
        }
    }
}





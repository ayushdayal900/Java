package ARRAYS_2D;



    import java.util.*;

    public class Main {
        public static Vector<Integer> digsStorer = new Vector<>();
        public static Vector<Vector<Integer>> tripsStorer = new Vector();
        public static int ptr1 = 0, ptr2, ptr3;

        public static Vector<Vector<Integer>> triplets(int[] arr) {
            if (ptr1 == arr.length - 2) {
                dupRem(tripsStorer);
                return tripsStorer;
            }
            ptr2 = ptr1 + 1;
            for (; ptr2 < arr.length - 1; ptr2++) {
                ptr3 = ptr2 + 1;
                while (ptr3 != arr.length) {
                    if (arr[ptr1] + arr[ptr2] + arr[ptr3] == 0) {
                        digsStorer.add(arr[ptr1]);
                        digsStorer.add(arr[ptr2]);
                        digsStorer.add(arr[ptr3]);
                        tripsStorer.add(new Vector<>(digsStorer));
                        digsStorer.clear();
                    }
                    ptr3++;
                }
            }
            ptr1++;
            return triplets(arr);
        }

        public static void dupRem(Vector<Vector<Integer>> trips) {
            HashSet<Integer> cubeSet = new HashSet<>();
            Vector<Vector<Integer>> uniTrips = new Vector<>();

            for (int i = 0; i < trips.size(); i++) {
                Vector<Integer> triplet = trips.get(i);
                int cube = 0;

                for (int j = 0; j < triplet.size(); j++) {
                    cube += triplet.get(j) * triplet.get(j) * triplet.get(j);
                }
                    if (cubeSet.contains(cube)) {
                        continue;
                    }
                    else {
                        uniTrips.add(triplet);
                        cubeSet.add(cube);
                    }


            }
            trips.clear();
            trips.addAll(uniTrips);

        }

        public static void main(String[] args) {
            int[] arr = {-1, 0, 1, 2, 3, -5, 2, 3, -5};

            triplets(arr);
            for (int i = 0; i < tripsStorer.size(); i++) {
                System.out.println(tripsStorer.get(i));


            }
        }
    }

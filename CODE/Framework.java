// package Lec_39_Mar_3_Arraylist;
// import java.util.ArrayList;
// import java.util.*;

// public class arraylist {
//     public static void main(String[] args) {
        
//         // List<Integer> arr = new ArrayList<>();  // also a valid syntax
//         ArrayList<Integer> arrayList = new ArrayList<>();

//         // add element to list
//         arrayList.add(10);
//         arrayList.add(20);

//         arrayList.add(1, 30);
//         System.out.println(arrayList);
//         // arrayList.add(5, 20);    // index out of bound error
//         System.out.println(arrayList);

//         // access element
//         arrayList.get(2);

//         // size of list
//         arrayList.size();

//         // replace 
//         arrayList.set(2, 5);

//         arrayList.remove(2);    // removes element from index
//         arrayList.contains(10);     // check if object is present or not

//         Collections.sort(arrayList);

//         // convert to string
//         String str = arrayList.toString();

//         // convert to array
//         Object[] arr = arrayList.toArray(); // convert to general object array
//         Integer[] arr2 = arrayList.toArray(new Integer[0]); // to particular object type array
        
//         // to primitive type array
//         int[] int_arr = arrayList.stream().mapToInt(Integer::intValue).toArray();

//         // convert array to list
//         Integer[] arr3 = {1,2,3,4,5};
//         List<Integer> list = Arrays.asList(arr3);

//         ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr3));
//     }
// }


// package Lec_39_Mar_3_Arraylist;

// import java.util.ArrayList;
// import java.util.Collections;

// public class arraylist2 {
//     public static void main(String[] args) {
        
//         ArrayList<Integer> arrayList = new ArrayList<>();
//         arrayList.add(10);
//         arrayList.add(40);
//         arrayList.add(30);
//         arrayList.add(20);
//         arrayList.add(13);
        
//         // int max = arrayList.get(0);
//         // for(int elem : arrayList){
//         //     max = Math.max(max, elem);
//         // }

//         int max_val = Collections.max(arrayList);
//         System.out.println(max_val);
//     }
// }


// package Lec_40_Mar_4_Map;

// import java.util.HashMap;

// public class hashmap {
//     public static void main(String[] args) {
        
//         int[] arr = {1,2,3,4,-1,-2,-3,1,2,4,3,-1,-2};
//         HashMap<Integer,Integer> hmap = new HashMap<>();

//         for(int elem : arr){
//             // if(hmap.containsKey(elem)){
//             //     hmap.put(elem, hmap.get(elem)+1);
//             // }
//             // else{
//             //     hmap.put(elem, 1);
//             // }
//             hmap.put(elem, hmap.getOrDefault(elem, 0)+1);
//         }
//         // traverse map
//         for(var entry : hmap.entrySet()){
//             System.out.println("Key : " + entry.getKey() + " || value : " + entry.getValue());
//         }

//         for(var key : hmap.keySet()){
//             System.out.println(key + " || " + hmap.get(key));
//         }
//         for(var val : hmap.values()){
//             // gives all values list
//         }
//     }
// }


// package Lec_41_Mar_5_Map;

// import java.util.HashMap;
// import java.util.Scanner;

// public class first_non_repeating_char {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         HashMap<Character,Integer> hmap = new HashMap<>();

//         for(int i=0 ; i<str.length() ; i++){
//             hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0)+1);
//         }
//         for(int i=0 ; i<str.length() ; i++){
//             if(hmap.get(str.charAt(i)) == 1){
//                 System.out.println(str.charAt(i));
//                 break;
//             }
//         }
//     }
// }




// package Lec_41_Mar_5_Map;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;


// public class pair_sum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         ArrayList<Integer> arrayList = new ArrayList<>();
//         for(int i=0 ; i<n ; i++){
//             arrayList.add(sc.nextInt());
//         }

//         HashMap<Integer,Boolean> hmap = new HashMap<>();
//         for(int i=0 ; i<n ; i++){
//             if(hmap.containsKey(k - arrayList.get(i))){
//                 System.out.println("(" + (k-arrayList.get(i)) + "," + arrayList.get(i) + ")");
//                 break;
//             }
//             else{
//                 hmap.put(arrayList.get(i), true);
//             }
//         }
//     }
// }



// package Lec_41_Mar_5_Map;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;


// public class pairs_sum_to_k {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> arr = new ArrayList<>();
//         HashMap<Integer,Integer> hmap = new HashMap<>();
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         for(int i=0 ; i<n ; i++){
//             int a = sc.nextInt();
//             arr.add(a);
//             hmap.put(a, hmap.getOrDefault(a, 0)+1);
//         }
//         int count = 0;
//         for(int i=0 ; i<arr.size() ; i++){
//             int a = arr.get(i);
//             if(!hmap.containsKey(a)){
//                 continue;
//             }
//             if(!hmap.containsKey(k-a)){
//                 hmap.remove(a);
//                 continue;
//             }
//             if(k-a == a){
//                 int freq = hmap.get(a);
//                 count += ((freq * (freq-1)) / 2);
//                 hmap.remove(a);
//                 continue;
//             }
//             int freq1 = hmap.get(a);
//             int freq2 = hmap.get(k-a);
//             count += (freq1 * freq2);
//             hmap.remove(a);
//             hmap.remove(k-a);
//         }
//     }
// }



// package Lec_42_Mar_10_Map;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;

// public class longest_consecutive_seq {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> arrayList = new ArrayList<>();
//         HashMap<Integer,Boolean> hmap = new HashMap<>();

//         // take input and store in map
//         int n = sc.nextInt();
//         for(int i=0 ; i<n ; i++){
//             int a = sc.nextInt();
//             arrayList.add(a);
//             hmap.put(a, true);
//         }

//         int maxLen = 0;
//         // traverse array to find longest sequence
//         for(int i=0 ; i<arrayList.size() ; i++){
//             if(!hmap.containsKey(arrayList.get(i))){
//                 continue;
//             }
//             int cnt = 1;
//             int left = arrayList.get(i) - 1;
//             while (hmap.containsKey(left)) {
//                 cnt++;
//                 hmap.remove(left);
//                 left--;
//             }
//             int right = arrayList.get(i) + 1;
//             while (hmap.containsKey(right)) {
//                 cnt++;
//                 hmap.remove(right);
//                 right++;
//             }
//             maxLen = Math.max(maxLen, cnt);
//         }
//         System.out.println("Max length of consecutive sequence is " + maxLen);
//     }
// }
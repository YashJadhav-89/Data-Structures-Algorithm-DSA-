

// import java.util.HashMap;

// public class hash {
//     public static void main(String[] args) {
//         //create
//         HashMap<String,Integer> hm = new HashMap<>();

//         //insert - O(1)
        
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("US",50);

//         System.out.println(hm);

//         // // Get - O(1)
//         // // int population = hm.get("India");
//         // // System.out.println(population);

//         // // System.out.println(hm.get("Indonesia"));



//         // // ContainsKey - O(1)
//         // // System.out.println(hm.containsKey("India"));
//         // // System.out.println(hm.containsKey("Indonesia"));



//         //Remove
//         System.out.println(hm.remove("China"));
//         System.out.println(hm);



//         //size
//         System.out.println(hm.size());

      

//         //clear the map
//         hm.clear();

//           //Is Empty
//           System.out.println(hm.isEmpty());
//     }
    
// }









// import java.util.*;

// public class hash{
//     public static void main(String args[]){
//         HashMap<String,Integer> hm = new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("Japan",90);
//         hm.put("Indonesia",300);
//         hm.put("Nepal",10);
     

//            //Iterate
//     Set<String> keys = hm.keySet();
//     System.out.println(keys);

//     for (String k : keys) {
//         System.out.println("key=" + k+",value=" +hm.get(k));
//     }
//     }


    

 
// }










//linked hash map

// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//         lhm.put("India",100);
//         lhm.put("China",150);
//         lhm.put("Nepal",50);


//         HashMap<String,Integer> hm =  new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("Nepal",50);


//         System.out.println(hm);
//         System.out.println(lhm);
//     }
// }









//tree map

// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         TreeMap<String,Integer> tm = new TreeMap<>();
//         tm.put("India",100);
//         tm.put("China",150);
//         tm.put("Nepal",50);


//         HashMap<String,Integer> hm =  new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("Nepal",50);


//         System.out.println(hm);
//         System.out.println(tm);
//     }
// }









//majority elements question
// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         int arr[] = {1,3,2,5,1,3,1,5,1};
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             } else{
//                 map.put(arr[i],1);
//             }
//         }

//         Set<Integer> keySet = map.keySet();
//         for(Integer key: keySet){
//             if(map.get(key)>arr.length/3){
//                 System.out.println(key);
//             }
//         }
//     }
// }






//hash set

// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(1);
//         set.add(2);
//         set.add(4);
//         set.add(2);
//         set.add(1);



//         System.out.println(set);

//         if(set.contains(2)){
//     System.out.println("set contains 2");
//         }

//         if(set.contains(3)){
//             System.out.println("set contains 3");
//                 }

//         set.remove(2);

//         System.out.println(set);

//     }
// }




//iteration on hashset

// using iteration
// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Pune");
//         cities.add("latur");
//         cities.add("mumbai");
//         cities.add("satara");


//         // Iterator it = cities.iterator();
//         // while(it.hasNext()){
//         //     System.out.println(it.next());
//         // }



//         //using enhanced for loop
//         for(String city:cities){
//             System.out.println(city);
//         }
//     }
// }







//linked hashset
// import java.util.*;

// public class hash{
//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Satara");
//         cities.add("Latur");
//         cities.add("Pune");


//         System.out.println(cities);

//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         lhs.add("Delhi");
//         lhs.add("Satara");
//         lhs.add("Latur");
//         lhs.add("Pune");
//         System.out.println(lhs);

//         lhs.remove("Delhi");
//         System.out.println(lhs);

//         TreeSet<String> ts = new TreeSet<>();
//         ts.add("Delhi");
//         ts.add("Satara");
//         ts.add("Latur");
//         ts.add("Pune");
//         System.out.println(ts);


//     }
// }
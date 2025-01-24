import java.util.*;

public class Alphabet {
    public static void main(String arg[]) {

        // String Decleration

        // String name = "Tony";
        // String fullname = "Tony Stark";
        // String sentence = "My name is Tony Stark";
        // System.out.println(name);
        // System.out.println(fullname);
        // System.out.println(sentence);

        // input

        Scanner sc = new Scanner(System.in);
        // String fname = sc.next();
        // String fname = sc.nextLine();
        // System.out.println(fname);

        // concatenation

        // String firstname = "Harshita";
        // String Lastname = "Bansal";
        // String Fullname = firstname + " " + Lastname;
        // System.out.println(Fullname);

        // length

        // System.out.println(Fullname.length());

        // charAt

        // for(int i=0;i<Fullname.length();i++)
        // {
        // System.out.println(Fullname.charAt(i));
        // }

        // compare

        // s1>s2 : +ve value
        // s1==s2 : 0
        // s1<s2 : -ve value

        // if(firstname.compareTo(Lastname)==0)
        // {
        // System.out.println("String are equal");
        // }
        // else{
        // System.out.println("String are not equal");
        // }

        // String Sentence = " My name is Harshita";
        // String Name = Sentence.substring(10);
        // // String Name = Sentence.substring(10,Sentence.length());
        // System.out.println(Name);

        // Strings are immutable

        // StringBuilder sb = new StringBuilder("Tony");
        // StringBuilder sb = new StringBuilder("h");
        // StringBuilder sb = new StringBuilder("hello");

        // System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));
        // //set char at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);
        // //insert
        // sb.insert(2,'n' );
        // System.out.println(sb);
        // //delete
        // sb.delete(2,3);
        // System.out.println(sb);

        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb.length());

        // for(int i =0;i<sb.length()/2;i++)
        // {
        // int front = i;
        // int back = sb.length()-1-i;

        // char frontChar = sb.charAt(front);
        // char backChar = sb.charAt(back);

        // sb.setCharAt(front, backChar);
        // sb.setCharAt(back, frontChar);
        // }
        // System.out.println(sb);

        // java class

        // 1. primitive way
        // char[] a = {'h','e','l','l','o'};
        // System.out.println(a.length);

        // 2. using class
        // String b = "hello Kaushal"; //u can not change this
        // String c = "hello"; //u can change this cuz it was ref to b doesnt have its
        // own
        // b+=" world";
        // b+= " meow";
        // b = b.concat(" hey"); //this will make a new string but ref is not changed so
        // it will not be stored in b

        // //b and c will have same reference
        // System.out.println(b);

        // methods->
        // 1.length();
        // String b = "Ansh Kaushal";
        // System.out.println(b.length());

        // 2.charAt();
        // System.out.println(b.charAt(3));

        // 3. substring()
        // System.out.println(b.substring(2,4));
        // System.out.println(b.substring(2));

        // 4. equals()
        // System.out.println(b.equals("Ansh Kaushal"));

        // 5.toUpperCase()
        // System.out.println(b.toUpperCase());

        // 6. toLowerCase()
        // System.out.println(b.toLowerCase());

        // 7. replace()
        // replace("oldchar",newchar);
        // replace(old charseq, new charseq);
        // System.out.println(b.replace("Kaushal", "Kun"));

        // 8.find sequence -> contains
        // System.out.println(b.contains("Ansh"));

        // String a = "Ansh Kaushal"; //string pool m bnegi
        // isee point har baar ek jagah krega for same strings

        // using new keyword
        // 1.Making empty string
        // String b = new String(); //heap m
        // hr baar point new jagah krega means hr baar new string bnegi

        // 2. giving parameters
        // String c = new String(a);
        // System.out.println(c);

        // if("ansh" == "ansh"){
        // System.out.println("yes");
        // }
        // this will print yes
        // we use equals to cuz it can also be used to comapre strings both in heap and
        // string pool

        // String a = "hello";
        // String c = "hello";
        // String b = new String("hello");
        // System.out.println(a.equals(b)); //true cuz compares char by char
        // System.out.println(a == b); //false cuz compares reference
        // System.out.println(a == c); //true both have same ref
        // String d = new String(b);
        // System.out.println(b == d); //false both in heap

        // String a = sc.nextLine();
        // print all substring
        // for(int i = 0;i<a.length();i++){
        // for(int j = i+1;j<=a.length();j++){
        // System.out.println(a.substring(i,j));
        // }
        // }

        // print all substrig ending with particular index

        // for(int i = 1;i<=a.length();i++){
        // for(int j = 0;j<i;j++){
        // System.out.println(a.substring(j,i));
        // }
        // }

        // reverse

        // String a = sc.nextLine();
        // String b = "";
        // for (int i = a.length() - 1; i >= 0; i--) {
        //     b += a.charAt(i);
        // }
        // a = b;
        // System.out.println(a);


        // StringBuilder is mutable
        // StringBuilder b = new StringBuilder();

        // for(int i = a.length()-1;i>=0;i--){
        // b.append(a.charAt(i));
        // }
        // b.reverse(); //used to reverse
        // b.insert(3,"h Kaushal"); // can insert char and string aswell;
        
        // b.deleteCharAt(b.length()-1); //deletes char at specific indwex
        // System.out.println(b);

        // StringBuilder c = new StringBuilder("Ansh Kaushal");

        // //insert ->O(n)
        // c.insert(c.length() -1," Kun");
        //
        // //set char
        // c.setCharAt(c.length() -1,' ');

        // //replace
        // c.replace(0,11,"Kaemi"); //replace part of string with string

        // equals -> same as string
        // System.out.println(c.equals("Ansh"));

        // substring -> same as strings
        // System.out.println(c.substring(2));;

        // reverse -> reverses the stringbuilder
        // c.reverse();

        // delete ->delete a seq
        // c.delete(0,4);

        // to string -> converts stringbuilder to string.
        // c.toString();
        // System.out.println(c);


        //palidrome

        // String str=sc.nextLine();
        // boolean flag = true;
        // for(int i=0;i<str.length();i++)
        // {
        //     if(str.charAt(i)!=str.charAt(str.length()-i-1))
        //     {
        //         flag=false;
        //     }

        // }
        // if(flag==true)
        // {
        //     System.out.println("Palidrome");
        // }
        // else{
        //     System.out.println("Not Palidrome");
        // }
        


        //String buffer
        //mutable
        //threads safe -> uses Synchronisation techniques like FIFO LIFO, PRIORITY

//        StringBuffer a = new StringBuffer("abcde");
//        a.append("null");
//        System.out.println(a);
//
//        //length
//        a.length();
//
//        //char at Index
//        a.charAt(3);
//
//        //set char
//        a.setCharAt(1,'a');
//
//        //insert
//        a.insert(1,"meow");
//
//        //deleteCharAt(index)
//        a.deleteCharAt(3);
//
//        //substring
//        a.substring(1);
//        a.substring(1,5);
//
//        //delete(begin,end)
//        a.delete(1,5);
//
//        //replace substring
//        a.replace(1,4,"ansh");
//
//        //convert toString
//        a.toString();
//
//        //convert to string Builder
//        String temp = a.toString();
//        StringBuilder b = new StringBuilder(temp);


        //q. Input a string toggle uppercase nd lowercase alphabets

        // String a = sc.nextLine();
        // StringBuffer str = new StringBuffer(a);
        // for(int i = 0;i<a.length();i++){
        //     if(str.charAt(i)<='z' &&str.charAt(i)>='a'){
        //         str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
        //     }
        //     else{
        //         str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
        //     }
        // }
        // System.out.println(str);



//         String s = sc.nextLine();
//        int cnt = 0;
//        for(int i = 0; i < s.length(); i++){
//            for(int j = i+1; j <= s.length(); j++){
//                if(pal(s.substring(i, j))){
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
//         int ans = 0;
//         for(int i = 0; i < s.length(); i++){
//             int left = i,right = i;
//             while(left!=-1 && right!=s.length() &&s.charAt(left) == s.charAt(right)){
//                 ans++;
//                 left--;
//                 right++;

//             }
//             if(s.length()==1){
//                 break;
//             }
//             left = i;
//             right = i+1;
//             while(left!=-1 && right!=s.length() &&s.charAt(left) == s.charAt(right)){
//                 ans++;
//                 left--;
//                 right++;

//             }
//         }
//         System.out.println(ans);


        // String a = sc.nextLine();
        //find length of all good substring
//        int max = 0;
//        for(int i = 0; i < a.length(); i++){
//            for(int j = i+1;j<a.length();j++){
//                String temp = a.substring(i, j);
////                System.out.println(temp);
//                boolean flag = true;
//                for(int k = 0;k<temp.length();k++){
//                    if(temp.charAt(k)!='a' &&temp.charAt(k)!='e' &&temp.charAt(k)!='i' &&temp.charAt(k)!='o' &&temp.charAt(k)!='u'){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag){
////                    System.out.println(temp + " with len: "+temp.length());
//                       max =  Math.max(max,temp.length());
//                }
//            }
//        }
//        System.out.println(max);
//        int max = 0;
//        for(int i = 0; i < a.length(); i++){
//            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||a.charAt(i) == 'o' || a.charAt(i) == 'u'){
//                int left = i,right = i;
//                while(left>=0 && right<a.length()){
//                    if(a.charAt(left) == 'a' || a.charAt(left) == 'e' || a.charAt(left) == 'i' || a.charAt(left) == 'o' || a.charAt(left) == 'u' &&((a.charAt(right) == 'a' || a.charAt(right) == 'e' || a.charAt(right) == 'i' ||a.charAt(right) == 'o' || a.charAt(right) == 'u'))){
//                        left--;
//                        right++;
//
//                    }
//                    if(a.charAt(left) == 'a' || a.charAt(left) == 'e' || a.charAt(left) == 'i' || a.charAt(left) == 'o' || a.charAt(left) == 'u'){
//                        left--;
//                    }
//                    else if(a.charAt(right) == 'a' || a.charAt(right) == 'e' || a.charAt(right) == 'i' ||a.charAt(right) == 'o' || a.charAt(right) == 'u'){
//                        right++;
//                    }
//                    else{
//                        i+=right;
//                        break;
//                    }
//                    max = Math.max(max, right-left);
//                }
//            }
//        }
//        System.out.println(max);
//        int i = 0;
//        int len = 0;
//        int ans = 0;
//        while(i<a.length()) {
//            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||a.charAt(i) == 'o' || a.charAt(i) == 'u'){
//                len++;
//
//            }
//            else{
//                ans = Math.max(len,ans);
//                len = 0;
//            }
//            i++;
//        }
//        System.out.println(ans);

        //string tokenizer
        // String b = sc.nextLine();
        // StringTokenizer st = new StringTokenizer(a," ");//it takes string and delimiter
        // while(st.hasMoreTokens()){
        //     System.out.println(st.nextToken());
        // }

        sc.close();
    }
}

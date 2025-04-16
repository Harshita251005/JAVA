// package Lec_49_April_8_Regex;

// import java.util.regex.Pattern;

// public class regexp {
//     public static void main(String[] args) {
        
//         System.out.println(Pattern.matches("[abc]", "b"));
//         System.out.println(Pattern.matches("[^ac]", "b"));
//         System.out.println(Pattern.matches("[a-i]", "o"));
//         System.out.println(Pattern.matches("[abc]?", "b"));
//         System.out.println(Pattern.matches("[abc]?", ""));
//         System.out.println(Pattern.matches("[abc]?", "ba"));
//         System.out.println(Pattern.matches("[abc]+", "bacba"));
//         System.out.println(Pattern.matches("[abc]*", "bacba"));
//         System.out.println(Pattern.matches("[abc]+", "bbbbb"));
//         System.out.println(Pattern.matches("[abc]*", "baaa"));
//         System.out.println(Pattern.matches("[abc]{2}", "baaa"));
//         System.out.println(Pattern.matches("[abc]{2,}", "baaa"));
//         System.out.println(Pattern.matches("[abc]{3,7}", "baaa"));
//     }
// }


// package Lec_50_April_9_Regex;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class regexp {
//     public static void main(String[] args) {
        
//         System.out.println(Pattern.matches("[abc]{2}", "baaa"));
//         System.out.println(Pattern.matches("[abc]{2,}", "baaa"));
//         System.out.println(Pattern.matches("[abc]{3,7}", "baaa"));

//         String regexpString = "\\d+";
//         String str = "Today is 09-04-2025 next year is 2026";

//         Pattern p = Pattern.compile(regexpString);
//         Matcher m = p.matcher(str);

//         while(m.find()){
//             System.out.println("year: " + m.group());
//         }

//     }
// }


// package Lec_51_April_10_Regex;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class find_quoted_words {
//     public static void main(String[] args) {
//         String str = "word of the day is \"Hello\" and \"Mate\".";
//         String reg = "\"\\w*\"";

//         Pattern p = Pattern.compile(reg);
//         Matcher m = p.matcher(str);
//         while(m.find()){
//             System.out.println(m.group());
//         }
//     }
// }



// package Lec_51_April_10_Regex;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class regexp_ {
//     public static void main(String[] args) {
        
//         String str = "Today's date is 10-04-2025";
//         String reg = "(\\d{2})-(\\d{2})-(\\d{4})";

//         Pattern p = Pattern.compile(reg);
//         Matcher m = p.matcher(str);
//         if(m.find()){
//             System.out.println(" || " + m.start() + " to " + m.end());
//             System.out.println("Date : " + m.group(1));
//             System.out.println("Month : " + m.group(2));
//             System.out.println("Year : " + m.group(3));
//         }

//         String replaced = m.replaceAll("Replaced");
//         System.out.println(replaced);
//     }
// }


// package Lec_51_April_10_Regex;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class remove_comment {
//     public static void main(String[] args) {
//         String str = "System.out.print(\"Hello\") // prints Hello";
//         String reg = "//.*";

//         Pattern p = Pattern.compile(reg);
//         Matcher m = p.matcher(str);
        
//         String removed_comment = m.replaceAll("");
//         System.out.println(removed_comment);
//     }
// }
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



// package Lec_52_April_17_Regex;

// import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class words_with_first_caps {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         String reg = "\\b[A-Z]\\w*\\b";
//         Pattern p = Pattern.compile(reg);
//         Matcher m = p.matcher(str);

//         while(m.find()){
//             System.out.println(m.group());
//         }
//     }
// }




// package Lec_53_April_21_Enums;

// enum Day{
//     Monday, Tuesday, Wednesday, Tursday, Friday, Saturday, Sunday;
// }

// enum STATUS{
//     Success(200, "success"),
//     NotFound(404, "Please hit a valid URL"),
//     TimeOut(501, "Taking too long to respond, Try again later");

//     private int code;
//     private String msg;

//     private STATUS(int code, String msg){
//         this.code = code;
//         this.msg = msg;
//     }
//     public int getStatusCode(){
//         return this.code;
//     }
//     public String getStatusMsg(){
//         return this.msg;
//     }
// }

// enum Maths{
//     Add{
//         public int operation(int a, int b){
//             return a + b;
//         }
//     },
//     Multiply{
//         public int operation(int a, int b){
//             return a * b;
//         }
//     };
//     public abstract int operation(int a, int b);
// }

// public class enums {
//     public static void main(String[] args) {
        
//         Day d = Day.Monday;

//         switch (d) {
//             case Monday:
//                 System.out.println("Here we go again!!");
//                 break;
//             case Friday:
//                 System.out.println("Weekend starts !!");
//                 break;
//             default:
//                 break;
//         }

//         STATUS urlResponse = STATUS.NotFound;
//         System.out.println(urlResponse.getStatusCode() + " : " + urlResponse.getStatusMsg());

//         for(STATUS s : STATUS.values()){
//             System.out.println(s + " || " + s.getStatusCode() + " : " + s.getStatusMsg());
//         }

//         int sum = Maths.Add.operation(10, 20);
//         // OR
//         Maths m = Maths.Add;
//         sum = m.operation(10, 20);
//     }
// }



// package Lec_54_April_22_Random_DateTime;

// import java.util.Random;

// public class random {
//     public static void main(String[] args) {
        
//         Random random = new Random();

//         int num = random.nextInt();

//         // in range [0,99]
//         num = random.nextInt(100);

//         // generate 10 random numbers in range [0,100]
//         for(int i=0 ; i<10 ; i++){
//             System.out.println(random.nextInt(101));
//         }

//         // Generate random number in range [50,100]
//         num = random.nextInt(50,101);   // in Java 17 and above
//         num = random.nextInt(51) + 50;  // in Java <17

//         // Generate 20 random numbers in range [-100,100]
//         for(int i=0 ; i<20 ; i++){
//             System.out.println(random.nextInt(-100, 101));  // Java >=17
//             System.out.println((random.nextInt(201) - 100));    // java <17
//         }

//         // Generate a 6 digit OTP
//         int OTP = random.nextInt(100000, 1000000);

//         // Generate a 6 digit OTP without 0
//         OTP = 0;
//         for(int i=0 ; i<6 ; i++){
//             OTP = OTP * 10;
//             OTP = OTP + random.nextInt(9) + 1;
//         }
//         System.out.println(OTP);
//     }
// }



// package Lec_55_April_23_DateTime;
// import java.time.*;

// public class datetime {
//     public static void main(String[] args) {
        
//         LocalDate today = LocalDate.now();
//         LocalTime currTime = LocalTime.now();
//         LocalDateTime dateTime = LocalDateTime.now();

//         System.out.println("Date : " + today + " || Time : " + currTime);

//         LocalDate customDate = LocalDate.of(2011, 04, 02);
//         LocalTime customTime = LocalTime.of(23, 30);

//         // comparing dates of time - isBefore() / isAfter()
//         System.out.println(customDate.isBefore(today));
//         System.out.println(currTime.isAfter(customTime));

//         // getting day, month, year from LocalDate, LocalDateTime
//         int day = today.getDayOfMonth();
//         Month month = today.getMonth();
//         int monthCount = dateTime.getMonthValue();

//         // getting hour, min, second from LocalTime, LocalDateTime
//         int hour = currTime.getHour();
//         int min = dateTime.getMinute();
//         int second = currTime.getSecond();

//         // convert to LocalDate / LocalTime from LocalDateTime
//         LocalDate date = dateTime.toLocalDate();
//         LocalTime time = dateTime.toLocalTime();

//         // Calculate previous date / time
//         LocalDateTime previousDateTime = LocalDateTime.now().minusDays(12);
//         previousDateTime = LocalDateTime.now().minusMonths(18);
//         previousDateTime = LocalDateTime.now().minusHours(62);

//         // calulate difference in dates
//         Period p = Period.between(customDate, today);
//         Duration hourDuration = Duration.between(customTime, dateTime);

//         // ZoneDateTime
//         ZonedDateTime IndianTime = ZonedDateTime.now();
//         System.out.println(IndianTime);
        
//         ZonedDateTime LondonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
//         System.out.println(LondonTime);
//     }
// }
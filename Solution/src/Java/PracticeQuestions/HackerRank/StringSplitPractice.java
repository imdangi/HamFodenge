package Java.PracticeQuestions.HackerRank;

public class StringSplitPractice {
    public static void main(String[] args) {
        String input="this 'i is a-value a and /all w:e";
        String pattern="(-)(:)";
        String arr[]=input.split(pattern,-2);
        for(String element:arr){
            System.out.println(element);
        }
    }
}

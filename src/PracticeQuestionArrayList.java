import java.util.ArrayList;

/*Create an ArrayList of integer, add 10 integer value into list, print only odd integers*/
public class PracticeQuestionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //add 10 integer values
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i+10);
        }
        //print the whole list first, just to check values
        System.out.println(integerArrayList);
        //use for loop or for each loop
        for (Integer integer : integerArrayList ){
            System.out.print(integer);
            System.out.print(",");
        }
        System.out.println();
        // printing only odd integers
        for (Integer integer : integerArrayList) {
            if(integer % 2 != 0){
                System.out.print(integer + ",");
            }
        }
        System.out.println();
    }
}

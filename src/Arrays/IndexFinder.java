package Arrays;

public class IndexFinder {


    public static int findIndexForNumber(int[] numbers, int searchNumber) {
        for (int number : numbers) {
            if (number == searchNumber) {
                return numbers[searchNumber];

        }}return -1;}



    public static int[] findIndicesForExpectedSum (int[] numbers, int expectedSum){
            for (int number : numbers) {
            if (number + number+1 == expectedSum){
                return new int[expectedSum];
            }}
            return new int[-1];}}

//            public static int[] findIndicesForExpectedSum2(int[] numbers, int expectedSum){
//            int i= 0;
//            int sum = numbers[i]+numbers[i+1];
//            if((numbers[i]+numbers[i+1])=expectedSum;){return int[] newArray;}







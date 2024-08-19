public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Add Two Numbers\n");

        PrintSolution printSolution;

        int test = 0;
        int[] listData1,
              listData2,
              expected;

        test++;
        listData1 = new int[]{2,4,3};
        listData2 = new int[]{5,6,4};
        expected = new int[]{7,0,8};
        printSolution = new PrintSolution();
        printSolution.print(test, listData1, listData2, expected);

        test++;
        listData1 = new int[]{0};
        listData2 = new int[]{0};
        expected = new int[]{0};
        printSolution = new PrintSolution();
        printSolution.print(test, listData1, listData2, expected);

 
        test++;
        listData1 = new int[]{9,9,9,9,9,9,9};
        listData2 = new int[]{9,9,9,9};
        expected = new int[]{8,9,9,9,0,0,0,1};
        printSolution = new PrintSolution();
        printSolution.print(test, listData1, listData2, expected);


    }
}

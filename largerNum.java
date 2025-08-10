public class largerNum {
    public static void main(String[] args){
        int[][] numbers = {{3,5,9},{1,4,7},{8,2,6}};
        int larger = numbers[0][0];
        for (int i = 0; i < numbers.length; ++i){
            for (int j = 0; j < numbers[i].length; ++j){
                if (numbers[i][j] > larger){
                    larger = numbers[i][j];

                }
            }
        }
        System.out.print("Largest number is " + larger);
    }
}

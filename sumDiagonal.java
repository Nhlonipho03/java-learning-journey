public class sumDiagonal {
    public static void main(String[] args){
        int sum = 0;
        int[][] numbers = {{2,4,6},{1,3,5},{7,8,9}};
        for (int i = 0; i < numbers.length; ++i){
            sum += numbers[i][i];
        }
        System.out.print(sum);
    }
}

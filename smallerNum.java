public class smallerNum {
    public static void main(String[] args){
        int[][] numbers = {{10,5,8},{3,12,7},{6,2,9}};
        int smaller = numbers[0][0];

        for (int i = 0 ; i < numbers.length ; ++i){
            for (int j = 0 ; j < numbers[i].length ; ++j){

                if( smaller > numbers[i][j]){
                    smaller = numbers[i][j];
                }
            }

        }
        System.out.print("The smallest number is " + smaller);
    }
}

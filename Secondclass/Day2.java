// Day: 2
// Date: 24/02/2026
// Day: Tuesday

public class Day2 {
    public static void main(String[] args) {
        // int matrix[][] = {{1,2},{3,4}};
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         System.out.println(matrix[i][j]+" ");
        //     }
        // }

        // Matrix Multiplication
        // int matrix1[][] = {{1,2},{3,4}};
        // int matrix2[][] = {{2,1},{4,3}};
        // int ansMatrix[][] = new int[matrix1.length][matrix1[0].length];
        // for(int i=0; i<matrix1.length; i++){
        //     for(int j=0; j<matrix1[i].length; j++){
        //         int sum = 0;
        //         for(int k=0; k<matrix1[i].length; k++){
        //             sum += (matrix1[i][k] * matrix2[k][j]); 
        //         }
        //         ansMatrix[i][j] = sum;
        //     }
        // }
        // for(int i=0; i<ansMatrix.length; i++){
        //     for(int j=0; j<ansMatrix[i].length; j++){
        //         System.out.print(ansMatrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Happy Number
        // int n = 331;
        // while(n != 1 && n != 4){
        //     int curr = n, ans = 0;
        //     while(curr > 0){
        //         int temp = curr % 10;
        //         temp *= temp;
        //         ans += temp;
        //         curr /= 10;
        //     }
        //     if(ans == 1){
        //         System.out.println("Happy Number");
        //         return;
        //     }
        //     n = ans;
        // }
        // System.out.println("Not Happy Number");

        // Print digits in words
        // String digits[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // int n = 143;
        // String ans = "";
        // System.out.println(n);
        // while(n > 0){
        //     int digit = n % 10;
        //     if(ans == ""){
        //         ans = digits[digit] + ans;
        //     }
        //     else{
        //         ans = digits[digit] + " " + ans;
        //     }
        //     n /= 10;
        // }
        // System.out.println(ans);

        // Strong Number
        int n = 145;
        int temp = n, ans = 0;
        while(n > 0){
            int digit = n % 10;
            int fact = 1;
            for(int i=2; i<=digit; i++){
                fact *= i;
            }
            ans += fact;
            n /= 10;
        }
        if(temp == ans){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not A Strong Number");
        }
    }
}
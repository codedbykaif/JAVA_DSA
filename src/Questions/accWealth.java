package Questions;

public class accWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
//        person = row,      accounts = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
//            when you start new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}

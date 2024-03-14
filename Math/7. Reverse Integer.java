class Solution {
    public int reverse(int x) {
        boolean sign = false;
        if(x<0){
            sign = true;
            x *= -1;
        }
        
        int num = 0;
        while(x>0){
            int digit = x % 10;
            //Checking for overflow (integer max value 2 power 31 -1) &&4
            //UnferFLow (Integer Min value -2 power 31)
            if(num>Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE/10 && digit > 7)) {
                return 0;
            }

            //Append the number 
            num = num * 10 + digit;
            x /= 10;
        }
        return (sign)?-1*num:num;
    }
}

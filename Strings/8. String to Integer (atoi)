class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;
        int index = 0;
        int n = s.length();
        //No need any for loop 
        ///index variable as each case to be handled seperately 

        //To discard the white spaces at the beginning of the string
        while(index<n && s.charAt(index)==' '){
            index++;
        }
        
        //To get the sign of integer when + or - are encountered

        if(index<n && s.charAt(index)=='+'){
            sign = 1;
            index++;
        }
        else if(index<n && s.charAt(index)=='-'){
            sign = -1;
            index++;
        }

        while(index<n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';

            //Checking for overflow (integer max value 2 power 31 -1) &&4
            //UnferFLow (Integer Min value -2 power 31)
            if(num>Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE/10 && digit > 7)) {
                return (sign==1)?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            //Append the number 
            num = num * 10 + digit;
            index++;
        }
        
        //Now we get  a valid numer based on sign we return the number 
        return (sign==-1)?num*-1 : num;
    }
}

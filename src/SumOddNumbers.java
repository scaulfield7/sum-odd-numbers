public class SumOddNumbers{
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }else if(number % 2 == 1){
            return true;
        }else{
            return false;
        }
    }

    public static int sumOdd(int first, int last){
        int sum = 0;
        if(first > 0 && last > 0 && last >= first){
            for(int i = first; i <= last; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}

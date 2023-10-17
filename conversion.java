public class conversion{
    public static void main(String[] args){

        int num = 12736812;
        StringBuilder numbase12 = new StringBuilder();
        int rest;
        int res;

        while (true){
            res = num / 12;
            rest = num % 12;
            if (rest == 10){
                numbase12.insert(0, 'A');
            }
            else if (rest == 11){
                numbase12.insert(0, 'B');
            }
            else{
                numbase12.insert(0, rest);
            }

            num = res;

            if (res == 0){
                break;
            }
        }
        
        System.out.println(numbase12);
    }
}

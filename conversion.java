public class conversion{
    public static void main(String[] args){

        int num = 765756;
        StringBuilder numbase12 = new StringBuilder();
        int rest;
        int res;

        while (true){
            res = num / 12;
            rest = num % 12;
            numbase12.insert(0, rest);
            num = res;

            if (res == 0){

                break;
            }
        }

        int len = numbase12.length();
        System.out.println(numbase12);
        StringBuilder newnumbase12 = new StringBuilder();

        for (int i = 0; i <= len - 2; i++){
            if ((numbase12.charAt(i) + "" + numbase12.charAt(i+1)).equals("11")){
                newnumbase12.append("B");
                i++;
            }
            else if ((numbase12.charAt(i) + "" + numbase12.charAt(i+1)).equals("10")){
                newnumbase12.append("A");
                i++;
            }
            else {
                newnumbase12.append(numbase12.charAt(i));
            }
            
        }
        if ((newnumbase12.charAt(newnumbase12.length() - 1) != 'A') && (newnumbase12.charAt(newnumbase12.length() - 1) != 'B')){
            newnumbase12.append(numbase12.charAt(numbase12.length()-1));
        }
        System.out.println(newnumbase12);
    }
}
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> letter = new ArrayList<>();
        ArrayList<String> dig =new ArrayList<>();

        for(String log:logs){
        String[] parts= log.split(" ",2);

        if(Character.isDigit(parts[1].charAt(0))){
            dig.add(log);
        }
        else{
            letter.add(log);
        }
    }


    Collections.sort(letter,(a,b)->{
        String[] arr1 = a.split(" ",2);
        String[] arr2 = b.split(" ",2);

        int cmp = arr1[1].compareTo(arr2[1]);

        if(cmp !=0){
            return cmp;
        }else{
            cmp = arr1[0].compareTo(arr2[0]);
            return cmp;
        }
    });

    letter.addAll(dig);
    return letter.toArray(new String[0]);

    }

}
class Solution {

    public String encode(List<String> strs) {

        StringBuilder strEncode =  new StringBuilder();

        for(String st: strs){
            strEncode.append(st.length()).
            append("#").
            append(st);
        }
        return strEncode.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i =0;

        while(i< str.length()){
          int j =i;
          // need to find #
          while(str.charAt(j) != '#'){
            j++;
          }
          int length = Integer.parseInt(str.substring(i, j)); //digit before #
          String word = str.substring(j+1, j+1+length);
          list.add(word);
          i= j+1+length;  // here move to next word
        }
        return list;
    }
}

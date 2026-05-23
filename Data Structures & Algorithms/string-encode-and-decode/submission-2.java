class Solution {

    public String encode(List<String> strs) {

      StringBuilder encode = new StringBuilder();

      for(String str: strs){
        encode.append(str.length())
        .append("#")
        .append(str);
      } 
      return encode.toString();
    }

    public List<String> decode(String str) {
      ArrayList<String> list = new ArrayList<>();
 
      int i= 0;

      while (i< str.length()){
        int j =i;

        while(str.charAt(j)!= '#'){
          j++;
        }

        int length = Integer.parseInt(str.substring(i, j));
        j++;
        String word = str.substring(j, j+length);

        list.add(word);
        i= j+length;
      }

      return list;
    }
} 

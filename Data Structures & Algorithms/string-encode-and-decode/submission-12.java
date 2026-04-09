
class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        
        for (String s : strs) {
            sb.append(s.length())  // Append the length of the string
              .append("#")         // Append a separator '#'
              .append(s);          // Append the actual string
        }
        
        return sb.toString();  // Return the full encoded string
    }

    public List<String> decode(String str) {
        List<String> sl = new ArrayList<>();
        int i = 0; 
        while (i < str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            System.out.println(j);
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            sl.add(str.substring(i,i+len));
            i = i + len;
            

        }
        
       
        
        return sl;
    }
}
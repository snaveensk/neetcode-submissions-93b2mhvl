
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
        int i = 0;  // Start from the beginning of the string
        
        while (i < str.length()) {
            // Find the position of the next '#' character which separates length and the string
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length of the next string (this could be multiple digits)
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;  // Move i to the character after '#'
            
            // Extract the string using the length and append it to the list
            sl.add(str.substring(i, i + len));
            i += len;  // Move i to the next string's starting point
        }
        
        return sl;
    }
}
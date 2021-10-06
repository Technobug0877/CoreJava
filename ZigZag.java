class Solution {

public String convert(String s, int numRows) {
    if(s == null || s.length() <= numRows || numRows == 1) {
        return s;
    }
    
    StringBuilder[] array = new StringBuilder[numRows];
    for(int row = 0; row < numRows; row++) {
        array[row] = new StringBuilder("");
    }
    
    int row = 0;
    int index = 0;
    while(index < s.length()) {
        while(row < numRows && index < s.length()) { // come down (increas row)
            array[row++].append(s.charAt(index++));
        }
        row = numRows - 1; // reduce the row by one (we are at the last row)
        while(row > 1 && index < s.length()) { // come up diagonally (reduce row)
            array[--row].append(s.charAt(index++));
        }
        row = 0; // reset the row to 0
    }
    
    StringBuilder sb1 = new StringBuilder("");
    for(int i = 0; i < numRows; i++) {
        sb1.append(array[i].toString());
    }
    return sb1.toString();
}
}
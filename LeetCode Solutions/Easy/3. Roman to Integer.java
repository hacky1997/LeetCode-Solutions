class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentValue = map.get(s.charAt(i));

            if (i + 1 < length && currentValue < map.get(s.charAt(i + 1))) {
                result -= currentValue; 
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}
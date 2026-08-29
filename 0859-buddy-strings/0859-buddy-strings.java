class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        int first = -1;
        int second = -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                count++;

                if (count == 1) {
                    first = i;
                } else if (count == 2) {
                    second = i;
                }
            }
        }

        // More than 2 differences
        if (count > 2) {
            return false;
        }

        // Exactly 1 difference
        if (count == 1) {
            return false;
        }

        // Exactly 2 differences
        if (count == 2) {
            return s.charAt(first) == goal.charAt(second)
                && s.charAt(second) == goal.charAt(first);
        }

        // 0 differences
        // Need a duplicate character because
        // we must perform exactly one swap.
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            if (seen[index]) {
                return true;
            }

            seen[index] = true;
        }

        return false;
    }
}
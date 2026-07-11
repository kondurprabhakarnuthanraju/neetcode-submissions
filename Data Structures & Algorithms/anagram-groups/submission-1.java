class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int[] mask = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (mask[i] == 1) continue;   // Skip already grouped strings

            char[] a = strs[i].toCharArray();
            Arrays.sort(a);               // Sort only once

            List<String> ls = new ArrayList<>();
            ls.add(strs[i]);
            mask[i] = 1;

            for (int j = i + 1; j < strs.length; j++) {

                if (mask[j] == 1) continue;

                char[] b = strs[j].toCharArray();
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {
                    ls.add(strs[j]);
                    mask[j] = 1;
                }
            }

            res.add(ls);
        }

        return res;
    }
}
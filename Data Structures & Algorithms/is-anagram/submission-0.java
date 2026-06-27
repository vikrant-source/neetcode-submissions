class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>mps=new HashMap<>();
        HashMap<Character,Integer>mpt=new HashMap<>();

        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        for(int i=0;i<arr1.length;i++){
            mps.put(arr1[i], mps.getOrDefault(arr1[i], 0) + 1);
        }
        for(int i=0;i<arr2.length;i++){
            mpt.put(arr2[i],mpt.getOrDefault(arr2[i],0)+1);
        }

        return mps.equals(mpt);
    }
}

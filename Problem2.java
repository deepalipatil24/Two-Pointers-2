// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1 == null || nums1.length == 0)
            return;
        
        int i = m+ n -1, p1 = m -1, p2 = n-1;
        while(p1>=0 && p2 >= 0) {
            
            if(nums1[p1] > nums2[p2]){
                
                nums1[i] = nums1[p1];
                p1--;
            }
            else {
                nums1[i] = nums2[p2] ;
                p2--;
                
            }
            i--;
            }
        
        while(p2 >=0){
            nums1[i] = nums2[p2];
                            p2--;
                            i--;
        }
        }
        
    }


    /*
    Complexity Analysis

Time complexity : 
O(n+m)
We are performing n+2⋅m reads and n+2⋅m writes. Because constants are ignored in Big O notation, this gives us a time complexity of O(n+m).

Space complexity : 
O(m) We are allocating an additional array of length m.
    */
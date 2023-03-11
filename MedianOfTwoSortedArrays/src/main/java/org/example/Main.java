package org.example;

public class Main {
    public static void main(String[] args) {
        int[] q = new int[]{1,3};
        int[] w = new int[]{2};
        System.out.println(findMedianSortedArrays(q,w));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[] = merge(nums1, nums2);
        if((a.length & 1) == 0){
           return (double)(a[a.length/2]+a[(a.length/2)-1])/2;
        }
        else return a[a.length/2];
    }

    public static int[] merge(int[] l, int[] r) {
        int[] a = new int[l.length + r.length];
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < l.length) {
            a[k++] = l[i++];
        }
        while (j < r.length) {
            a[k++] = r[j++];
        }
        return a;
    }
}
package com.HardikPatel;

import java.util.Arrays;

public class SortedMatrixBS{
    public static void main(String[] args) {
        int[][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=9;
        System.out.println(Arrays.toString(search(array,target)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
               cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols=matrix[0].length;

        // only one row than apply binary search
        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        if(cols==0){ // 0 columns ,matrix may be empty
            return new int[]{-1,-1};
        }

       //run till two row left
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run when rows are more than 2
        while(rStart < (rEnd-1)){
            int mid= rStart + (rEnd-rStart)/2;

            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }

        //now we have two rows
        // check whether target is in column or not
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

//        check for 1st half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
//        check for 2nd half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
//        check for 3rt half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
//        check for 4rt half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }

    }


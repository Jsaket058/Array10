import java.util.*;
import java.io.*;

class Array19{
	int [] intersection(int A[],int B[]){
		ArrayList<Integer> ans=new ArrayList<>();
		int i = 0, j = 0;
        while(i < A.length && j < B.length){
        if (A[i] < B[j]){ 
        i++;
                        } 
	    else if (B[j] < A[i]){
        j++;
                             } 
	else {
      ans.add(A[i]);
      i++;
      j++;
    }
  }
    int a[]=new int[ans.size()];
		for(int index=0;index<ans.size();index++){
			a[index]=ans.get(index);
		}
    return a;
} 	
}
	
class Run{
	public static void main(String[] arg){
		Array19 a=new Array19();
		int arr1[]={2,4,5,7,9,17,20};
		int arr2[]={2,5,6,8,9,14,17};
		int x[]=a.intersection(arr1,arr2);
		for(int i:x){
			System.out.println(i);
		}
	}
}
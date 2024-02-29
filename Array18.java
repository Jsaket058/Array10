import java.util.*;
import java.io.*;

class Array18{
	int [] intersection(int A[],int B[]){
		ArrayList<Integer> ans=new ArrayList<>();
		int vis[]=new int[B.length];
		for (int i = 0; i < A.length; i++){
                for (int j = 0; j < B.length; j++){
                    if (A[i] == B[j] && vis[j] == 0){
        ans.add(B[j]);
        vis[j] = 1;
        break;
      }
	    else if (B[j] > A[i]) break;
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
		Array18 a=new Array18();
		int arr1[]={2,4,5,7,9,17,20};
		int arr2[]={2,5,6,8,9,14,17};
		int x[]=a.intersection(arr1,arr2);
		for(int i:x){
			System.out.println(i);
		}
	}
}
package InfosysOA;

public class MinimumOperationstoFormaTargetArrayQ1Rutu {
    public static void main(String[] args){

    int[]arr = {1,2,1};
    long ans = fun(arr);
        System.out.println(ans);
    }

    public static long fun(int[]arr){
        int n = arr.length;
        long ans = 0;

        if(n ==1) return arr[0];

        for(int i=1; i<n; i++){
            int mini = Math.min(arr[i], arr[i-1]);
            arr[i] -= mini;
            arr[i-1] -= mini;

            ans += mini;
        }

        for(int i=0; i<n; i++) ans+= arr[i];
        return ans;
    }
}

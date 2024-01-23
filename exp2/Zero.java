package exp2;

public class Zero {
    public static void main(String[] args) {
        int [] arr = {1,0,0,2,0,6,0,9};
        int i=0;
        System.out.println("Original array: ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        for(int j = 0, l = arr.length; j< l;)
        {
            if (arr[j] != 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
            j++;
        }
        while (i<arr.length)
        {
            arr[i++]=0;
        }
        System.out.println("\nNew array: ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}

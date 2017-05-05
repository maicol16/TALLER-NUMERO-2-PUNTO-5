 public class Taller2Numero5
{
   
    void productArray(int arr[], int n) 
    {
       
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];
 
        int i, j;
 
        left[0] = 1;
 
        
        right[n - 1] = 1;

        for (i = 1; i < n; i++)
            left[i] = arr[i - 1] * left[i - 1];
 
        
        for (j = n - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];
 
      
        for (i = 0; i < n; i++)
            prod[i] = left[i] * right[i];
 
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
 
        return;
    }
 
  
    public static void main(String[] args) 
    {
        Taller2Numero5 pa = new Taller2Numero5();
        int arr[] = {10, 4, 1, 6, 2};
        int n = arr.length;
        System.out.println("El conjunto de productos es : ");
        pa.productArray(arr, n);
    }
}
 

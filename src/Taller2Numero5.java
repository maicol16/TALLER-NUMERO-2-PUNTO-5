  public class Taller2Numero5
{
  
        void productArray(int arr[], int n) 
    {
       
        int  multiplicacion1[] = new int[n];
        int prod[] = new int[n];
        int i, j;
 
            multiplicacion1[0] = 1;
 
        for (i = 1; i < n; i++)
                multiplicacion1[i] = arr[i - 1] * multiplicacion1[i - 1];
 
 
        for (i = 0; i < n; i++)
                prod[i] = multiplicacion1[i] ;
       
        for (i = 0; i < n; i++)
                System.out.print(prod[i] + " ");
 
            return;
        }
 
    
                public static void main(String[] args) 
            {
                    Taller2Numero5 pa = new Taller2Numero5();
        
                        int arr[] = {10, 4, 1, 6, 2};
                        int n = arr.length;
                                System.out.println("los numeros   del arreblo B son");  
            }
       }
 

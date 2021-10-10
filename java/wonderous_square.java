import java.util.*;//UTIL PACKAGE FOR SCANNER
class wonderous_square //INITIALIZING CLASS
{
    int arr[][],arr1[];//arrays
    int n,i,j,x=0,r,c;
    int flag;
    void perform()//Peform method   
    {
        Scanner sc=new Scanner(System.in);//scanner object
        System.out.println("Enter the size of array(row and column same):");
        n=sc.nextInt();
        arr=new int[n][n];//array size
        arr1=new int[2*n];//array size
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter the value:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is"); //printing matrix
        for(i=0;i<n;i++)
        {
            r=0;
            c=0;
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
                r=r+arr[i][j];
                c=c+arr[j][i];
            }
            System.out.println();
            arr1[x]=r;
            arr1[x+n-1]=c;
            x++;
        }
        for(i=0;i< x;i++)
        {
            if(arr1[i]!= 0.5 * n * (n*n + 1))
                break;
        }//verifying the square
        if(i==x)
            System.out.println("YES IT REPRESENTS A WONDROUS SQUARE.");
        else
            System.out.println("IT IS NOT A WONDROUS SQUARE.");
        System.out.println("PRIME  ROW  COLUMN");
        for(i=0;i< n;i++)
        {
            for(j=0;j< n;j++)
            {
                if(prime(arr[i][j]))
                    System.out.println(arr[i][j]+ "   "+i+ "   "+j);
            }
        }
    }

    boolean prime(int no)//condition class
    {
        int index;
        for(index=2;index<no;index++)
        {
            if(no%index==0)
                break;
        }
        if(index==no)
            return true;
        else
            return false;
    }

    public static void main(String args[])//main method
    {
        wonderous_square ob=new wonderous_square();//class object
        ob.perform();//calling method
    }
}//class closed
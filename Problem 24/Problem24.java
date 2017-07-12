class Problem24
{
public static void main(String[] args)
{
int a[]={0,1,2,3,4,5,6,7,8,9};
int count[]={0};
long arr[]=new long[3628800];
int irr[]={0};
permute(a,a.length,a.length,count,arr,irr);
System.out.println(count[0]);
sort(arr,0,count[0]-1);
System.out.println(arr[999999]);

}
static int partition(long arr[], int low, int high)
    {
        long pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        long temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    static void sort(long arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
static void permute(int a[], int size, int n,int count[],long arr[],int irr[])
{
  int t;
    if (size == 1)
    {
        printArr(a, n,arr,irr);
        count[0]++;
        return;
    }

    for (int i=0; i<size; i++)
    {
        permute(a,size-1,n,count,arr,irr);

        if (size%2==1)
            {
              t=a[0];
              a[0]=a[size-1];
              a[size-1]=t;
            }
        else
        {
          {
            t=a[i];
            a[i]=a[size-1];
            a[size-1]=t;
          }
        }

    }

}
static void printArr(int a[],int n,long arr[],int irr[])
{
long nu=0;
    for (int i=0; i<n; i++)
    {
      nu=nu*10+a[i];
    }
    arr[irr[0]]=nu;
    irr[0]++;
    //    System.out.print(a[i]+" ");
//System.out.println(nu);
}
}

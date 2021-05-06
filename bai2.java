public class bai2 
{
    public static void main(String[] args)
    {
        int []a={1,4,9,10,5,9,16,9,20,25};
        int x = a[0];
        for(int i=0;i<8;i++)
        {
            if(a[i]!=x||i==0)
            {
                int dem=1,vt=0;
                for(int j = i+1;j<10;j++)
                {
                    if(a[j]==a[i])
                    {
                        dem++;
                        if(dem==3)
                            vt = j;
                        a[j]=x;
                    }
                }
                if(dem==3)
                    System.out.println("number "+a[i]+" has appear 3 time and index of "+a[i]+" is "+ vt);
            }
        }
    }
}

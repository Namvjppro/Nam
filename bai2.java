public class bai2 
{
    public static void main(String[] args)
    {
        int []a={1,4,9,10,5,9,16,9,20,25};
        int []b={1,4,9,10,5,9,16,9,20,25};
        for(int i=0;i<9;i++)
        {
            for(int j =i+1;j<10;j++)
            {
                if(b[i]>b[j])
                {
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i =0;i<7;i++)
        {
            if(b[i]==b[i+2])
            {
                int dem = 0;
                for(int j = 0;j<10;j++)
                {
                    if(a[j]==b[i])
                    dem++;
                    if(dem==3)
                    {
                        System.out.println("number "+b[i]+" has appear 3 time and index of "+b[i]+" is "+j);
                        break;
                    }
                }
                i=i+2;
            }
        }
    }
}

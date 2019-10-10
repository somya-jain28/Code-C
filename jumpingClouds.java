static int jumpingOnClouds(int[] c) {
        int n=c.length;
        int count=0;
        for(int i=0 ;i<n-1 ;i++)
        {
            if(c[i]==0)
            {
                if(i<n-2)
                {
                    if(c[i+2]==0)
                    {
                    count++;
                    i=i+1;
                    }
                    else
                    count++;
                }
                else
                count++; 
            }
            
        }
        return count;
    }
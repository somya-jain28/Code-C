static int countingValleys(int n, String s) {
        int i,c_valley=0,altitude=0;
        char[] c=s.toCharArray();
        for( i=0 ;i<n;i++)
        {
            if(s.charAt(i)=='U')
            {
                if(altitude==-1)
                c_valley++;
            altitude++;
            }
            if(s.charAt(i)=='D')
            altitude--;
            
        }
        
        return c_valley;

    }

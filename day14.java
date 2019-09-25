    Difference(int arr[])
    {
        this.elements=arr;
    }
    void computeDifference()
    {
         int temp;
         //we are sorting the elements
        for(int x=0; x<elements.length-1;x++)
        {
            for(int y=0;y<elements.length-x-1;y++)
            {
                if(elements[y]>elements[y+1])
                {
                    temp=elements[y];
                    elements[y]=elements[y+1];
                    elements[y+1]=temp;
                }
            }
        }
         maximumDifference=Math.abs(elements[0]- elements[(elements.length-1)]);
    }

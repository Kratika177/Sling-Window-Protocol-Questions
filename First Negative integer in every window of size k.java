class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0,j=0;
        List<Long> l=new ArrayList<>();
        List<Long> ans=new ArrayList<>();
        for(j=0;j<N;j++){
            if(A[j]<0){
                l.add(A[j]);
            }
            if(j-i+1==K){
                if(l.size()==0){
                    ans.add((long)0);
                }
                else{
                    ans.add(l.get(0));
                    if(l.get(0)==A[i]){
                        l.remove(0);
                    }
                }
                i++;
            }
            
        }
        long a[]=new long[ans.size()];
        for(int l1=0;l1<ans.size();l1++){
            a[l1]=ans.get(l1);
        }
        return a;
    }
}

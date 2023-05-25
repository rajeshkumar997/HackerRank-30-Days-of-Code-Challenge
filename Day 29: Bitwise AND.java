public static int bitwiseAnd(int N, int K) {
    // Write your code here
    int cont=0;
        for(int i=1; i<=N; i++){      
            for(int j=i+1; j<=N; j++){    
                if((i&j) < K){  
                    if((i&j)>cont){     
                        cont = (i&j);
                    }
                }
            }
        }
        return cont;
    }

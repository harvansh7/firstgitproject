class removeDup{
	public removeDup(){}
	
	public static void removeDupNumbers(int a[]){
     
     int i=0, j=0;
while(i<a.length){
     if( a[i] == a[j]){
           j++;
       }else{
       	  i++;
       	  a[i] = a[j];
       	  j++;
       }
     }
     for(int aa : a)
        	System.out.println(aa);

	}

	public static void main(String arr[]){

		int array[] = {1,1,2,3,4};
       removeDupNumbers(array);
       // System.out.println(x);

        

	}


}
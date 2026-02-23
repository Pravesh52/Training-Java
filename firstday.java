public class firstday {
    public static void main(String[] args) {
        //Print the range

        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println( Long.MIN_VALUE+" "+Long.MAX_VALUE);   
        
        
        // type casting

        int num = 10;
        double d = num;   
        
        System.out.println(d);


        // Airthmetic operator

        int c=30, e=3;

        System.out.println(c+e);
        System.out.println(c-e);
        System.out.println(c*e);
        System.out.println(c/e);


        //Assignment operator

        int assign=10;
        assign+=5;
        System.out.println(assign);

        //Relation operator

        int a=100, b=20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //logical operator

        int b1=5;
        System.out.println((a>b) && b1 <10);
        System.out.println((a>b) || b1 >10);

        //Arrays

        //Sum of arrays and found
        //  number present or not present

        int arr[]={1,2,3,4,5,6};
        int sum=0;
        int n=5;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]==n){
                found=true;
            }
        }
        System.out.println("sum of array: "+sum);
        if(!found){
            System.out.println("false");
        }else{
            System.out.println("true");
        }


    }
}

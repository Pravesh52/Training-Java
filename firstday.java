import java.util.Arrays;

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

//Array sorted or not sorted
        int arr2[]={1,5,7,6,2,3};
        boolean found1=false;
        for(int i=0;i<arr2.length-1;i++){
            if(arr2[i]>arr2[i+1]){
                found1=true;
            }
        }
        if(!found1){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }

//negative and positive found number

        int arr3[]={1,-5,-7,6,-2,3};

        int neg=0;
        int pos=0;

        for(int i=0;i<arr3.length;i++){
            if(arr3[i]>0){
                pos++;
            }else if(arr3[i]<0){
                neg++;
            }
        }

        System.out.println(pos);
        System.out.println(neg);

//find missing number 

        int arr4[]={1,2,3,5,6};
        int length=arr4.length;
        int sumofarray=(length+1)*(length+2)/2;

        int actualsum=0;

        for(int i=0;i<length;i++){
            actualsum+=arr4[i];
        }
        int result=sumofarray-actualsum;

        System.out.println(result+" ");

        //find duplicates
       System.out.println("Print Duplicate: ");
        int arr5[]={1,2,3,5,6,3};
        Arrays.sort(arr5);
        for(int i=0;i<arr5.length-1;i++){
            if(arr5[i]==arr5[i+1]){
                System.out.println("Duplicate: "+arr5[i]);
                return;
            }
        }
        System.out.println("Not Duplicate number");

//reverse the string
System.out.println("reverse");

        String str="Pravesh";

       String rev=" ";


        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(str);
        System.out.println(rev);   


    }
}

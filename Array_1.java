package array;

public class Array_1 {
	
		   public static void main(String arg[]){
			   Array_1 obj=new Array_1();
			           //obj.problem1();
			           //obj.problem2();
			           //obj.problem3();
			          // obj.problem4();
			           // obj.problem5();
			         //   obj.program6();
			            obj.program7();
			           // obj.program8();
			           // obj.program9();
			            // obj.program10();
		   }
		   
 //Print the index of array:		   
 public void problem1()
 {
			   int arr[]=new int[5];
		      System.out.println("The index of the array:"+arr.length);
		   
 }
 //Find the average of values in array:
 public void problem2()
 {
	      int  arr[]={5,7,9,7,5,3};
	        int sum=0;
	        double avg=0;
	     for(int i=0;i<arr.length;i++)
	        {
	            sum=sum+arr[i];
	            avg=sum/arr.length;
	         }
	          System.out.println(sum);
	          System.out.println(avg);
 }
	//Print sum of odd and even literals in array:
  public void problem3()
{
	  
		   
		       int odd=0;
		       int even=0;
		       int arr[]={1,2,3,4,5,6};
		       for(int i=0;i<arr.length;i++)
		          if(arr[i]%2==0)
		            {
		               even=even+arr[i];
		             }
		          else if(arr[i]%2!=0)
		             {
		               odd=odd+arr[i];
		              }
		          System.out.println("The even number is:"+even);
		          System.out.println("The odd number is:"+odd);
		          
		      }
		  

//Print the difference of odd and even in array:
public void problem4()
{
	int odd=0;
    int even=0;
    int arr[]={1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++)
    {	
       if(arr[i]%2==0)
         {
            even=even+arr[i];
          }
       else if(arr[i]%2!=0)
          {
            odd=odd+arr[i];
           }
    }
       System.out.println("The even number is:"+even);
       System.out.println("The odd number is:"+odd);
       System.out.println("Differenc of odd and even:"+(even-odd)); 
 
}



public void problem5()
{
	 
		      double[] myList = {1.9, 2.9, 3.4, 3.5};
		      
		      // Print all the array elements
		      for (int i = 0; i < myList.length; i++) {
		         System.out.println(myList[i] + " ");
		      }
		      
		      // Sum of all elements
		      double total = 0;
		      
		      for (int i = 0; i < myList.length; i++) {
		         total = total+ myList[i];
		      }
		      System.out.println("Total is " + total);
		      
		      // Finding the Max element
		      double max = myList[0];
		      
		      for (int i = 0; i < myList.length; i++) {
		         if (myList[i] > max) max = myList[i];
		      }
		      System.out.println("Max is " + max);
		   }
	
   public void program6()
   {
	   char []arr={'A','B','C','Z','Y'};
	   System.out.println("Arrays");
	   for(int i=0;i<arr.length;i++)
	   {
		  System.out.println(arr[i]); 
	   }
	   System.out.println("Adding arrays");
	   for(int i=0;i<arr.length;i++)
	   {
		   int a=arr[i];
		   a=a+2;
		  if (a>90)
		  {
			  a=a-26;
		  }
		 char c=(char)a;
		 System.out.println(c);
	   }
   }

   public void program7()
   {
	  char[]arrays={'K','L','M','N','O','P','Z','Y'};
	  for(int i=0;i<arrays.length;i++)
	  {
		  int a=arrays[i];
		      a=a+1;
		      if(a>90)
		      {
		    	  a=a-26;
		      }
		      char c=(char)a;
		       arrays[i]=c;
		      System.out.println(c+"");
	  }
   }

   //BUBBLE SORTING PROGRAM
   public void program8()
   {
	   int []arr={7,5,1,4,6,8,3,2,16,10,72,11,99};
	   for(int i=0;i<arr.length;i++)
	   {
		  for(int j=i+1;j<arr.length;j++)
		  {
			 if(arr[i]>arr[j])
			 {
			  int temp=arr[i];
			     arr[i]=arr[j];
			     arr[j]=temp;
			 }
		  }
		  System.out.println(arr[i]);
	   }
   }
   
   public void program10()
   {
	   int []arr={7,5,1,4,6,8,3,2,16,10,72,11,99};
	   for(int i=0;i<arr.length;i++)
	   {
		  for(int j=i+1;j<arr.length;j++)
		  {
			 if(arr[i]<arr[j])
			 {
			  int temp=arr[i];
			     arr[i]=arr[j];
			     arr[j]=temp;
			 }
		  }
		  System.out.println(arr[i]);
	   }
   }
   
   public void program9()
   {
	  int []my_list={7,9,2,7,3,9,5,2};
	 for(int i=0;i<my_list.length;i++)
	 {
		 for(int j=0;j<my_list.length;j++)
		 {
			if(my_list[i]==my_list[j] && my_list[i]!=my_list[j]) 
			{
				System.out.println(my_list[j]);
				break;
			}
		 }
	 }
	  
   }
   
   
}

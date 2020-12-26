
public class ExceptionHndling 
{
	public static void main(String[] args)
	{
		 try{
		        int a[]=new int[10];
		        a[11] = 9;
		      }
		      catch(ArrayIndexOutOfBoundsException e){
		         System.out.println ("ArrayIndexOutOfBounds");
		      }
		 
		 try{
			 int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
		      }catch(NumberFormatException e){
			  System.out.println("Number format exception occurred");
		       }
		 
		 try{
				String str=null;
				System.out.println (str.length());
			}
		        catch(NullPointerException e){
				System.out.println("NullPointerException..");
			}
	}
}

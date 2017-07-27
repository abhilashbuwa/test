package sessionThree;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileAction {

	public static EmployeeDetails deSerialize(String file_path)
	{
		FileInputStream fin=null;
		ObjectInputStream ois=null;
		EmployeeDetails employeeDetails=null;
		try{		
		fin=new FileInputStream(file_path);
		ois=new ObjectInputStream(fin);
		employeeDetails=(EmployeeDetails)ois.readObject();
		}catch(Exception e)
		{
			System.out.println("Error while reading!");
		}
		finally{
			try {
			if(fin!=null && ois!=null){
				fin.close();
				ois.close();
			}
			} catch (IOException e) {
			 System.out.println(e.getMessage());	
			}
		}
		return employeeDetails;
	}
	public static void serialize(EmployeeDetails employeeDetails,String file_path) {

		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {
			fout = new FileOutputStream(file_path,true);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(employeeDetails);

		} catch (Exception ex) {
				System.out.println("Error while writing file!");
		
		} finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					
				}
			}
			if (oos != null) {
				try {
					oos.close();
					oos.flush();
				} catch (IOException e) {
				
				}
			}

		}
		
	}
	   public static void readAll(String file) {
		      
		      ObjectInputStream inputStream = null;
		      EmployeeDetails p=null;
		      FileInputStream fin=null;
		    
		      try {
		    	  fin=new FileInputStream(file);
		         inputStream = new ObjectInputStream(fin);
		        //List<EmployeeDetails> deserializedEmployees = (List<EmployeeDetails>) inputStream.readObject();

		        
		         while ((p = (EmployeeDetails) inputStream.readObject()) != null) 
		        		 {
		   
		        	 System.out.println(p.toString());
		            //list.add(p);
		         }
		      } catch (EOFException eofException) {
		    	  System.err.println("Object creation failed.");
		       
		      } catch (ClassNotFoundException classNotFoundException) {
		         System.out.println("Object creation failed.");
		      } catch (IOException ioException) {
		         //System.out.println("Error opening file."+ioException.getMessage());
		      } finally {
		         try {
		            if (inputStream != null)
		               inputStream.close();
		         } catch (IOException ioException) {
		            System.out.println("Error closing file.");
		         }
		      }
		   }
}
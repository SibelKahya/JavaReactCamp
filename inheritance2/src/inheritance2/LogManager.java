package inheritance2;

public class LogManager {                                                        //beniim loglama t�rlerim olsun
	public void log(int logType) {                                                 //1) Database
	      if(logType==1) {	                                                       //2)File
	            System.out.println("Veri Taban�na ba�land�");
	      } else if(logType==2) {                                                    //3)Email
	    	    System.out.println("Dosyaya Logland�");
	      }else {
	    	    System.out.println("EMAil g�nderildi"); 
	      }   
	     
	      
	}                                                        

}

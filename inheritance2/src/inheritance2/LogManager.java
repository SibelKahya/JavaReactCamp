package inheritance2;

public class LogManager {                                                        //beniim loglama türlerim olsun
	public void log(int logType) {                                                 //1) Database
	      if(logType==1) {	                                                       //2)File
	            System.out.println("Veri Tabanýna baðlandý");
	      } else if(logType==2) {                                                    //3)Email
	    	    System.out.println("Dosyaya Loglandý");
	      }else {
	    	    System.out.println("EMAil gönderildi"); 
	      }   
	     
	      
	}                                                        

}

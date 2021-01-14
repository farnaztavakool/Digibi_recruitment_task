package solution;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;




public class time_confusion {
    
 
    public static String solution(List<LocalTime> time) {

        Collections.sort(time);
        LocalTime x = null;
        long diff1 =  ChronoUnit.MINUTES.between(time.get(0), time.get(1));
        long diff2 = ChronoUnit.MINUTES.between(time.get(1), time.get(2));
        long diff3 = ChronoUnit.MINUTES.between(time.get(0), time.get(2));

        
        if (diff1+diff2 == 720 || diff1 == diff2) x = time.get(1);
        if (diff1+diff3 == 720) {
            if (x != null ) return("Look at the sun"); 
            
            x = time.get(0);
        }
        if (diff2+diff3 == 720) {
            if (x != null ) return ("Look at the sun");
            
            x = time.get(2);
        }
        

        if (x != null) return ("The correct time is "+x  );
        return ("Look at the sun ");


        
    }
    public  static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        Scanner scan=new Scanner(System.in); 
        System.out.println("Enter the number of tests: ");

        int count = scan.nextInt();
        for (int i = 0; i < count;i++) {
            System.out.println("Enter the "+(i+1)+" test in the format of HH:mm HH:mm HH:mm");

            ArrayList<LocalTime> time_list = new ArrayList<>();
            for (int j = 0;j <3;j++) {

                String time=scan.next();  //default format: hh:mm:ss
                DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime lt=LocalTime.parse(time, df); 
                time_list.add(lt);
                
               
            }
            result.add(solution(time_list));

        }
        scan.close();
        for (String s:result) {
            System.out.println(s);
        }
    }
}

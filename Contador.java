public class Main {
  public static void main(String[] args) {
    int seconds = 6;
   
    int minutos = 00;
    int horas = 0;
    
   	 horas = seconds / 3600;
     seconds = seconds - (horas*3600);
     minutos = seconds / 60;
     seconds = seconds - (minutos*60);
     
     String hora = "" + horas + "";
     String minuto = "" + minutos + "";
     String segundos = "" + seconds +"";
     if(hora.equals("0")){
     hora = "00" ;
     }
     if(minuto.equals("0")){
     minuto = "00"; 
     }
     if(segundos.equals("0")){
     segundos = "00" ;
     }
     
     if (hora.equals("1") ||hora.equals("2")||hora.equals("3")||hora.equals("3")||hora.equals("4")|hora.equals("5")|hora.equals("6")|hora.equals("7")|hora.equals("8")|hora.equals("9") ){
     hora = "0" + hora;
     }
     
     
     
     if (minuto.equals("1") ||minuto.equals("2")||minuto.equals("3")||minuto.equals("3")||minuto.equals("4")|minuto.equals("5")|minuto.equals("6")|minuto.equals("7")|minuto.equals("8")|minuto.equals("9") ){
     minuto = "0" + minuto;
     }
      
     if (segundos.equals("1") ||segundos.equals("2")||segundos.equals("3")||segundos.equals("3")||segundos.equals("4")|segundos.equals("5")|segundos.equals("6")|segundos.equals("7")|segundos.equals("8")|segundos.equals("9") ){
     segundos = "0" + segundos;
     }
     
     String total = hora +":"+ minuto +":" + segundos;
     System.out.println(total);
    
    
    
  }
}

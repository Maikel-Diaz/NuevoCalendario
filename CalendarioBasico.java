/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando campos di
    private int day;
    private int month;
    private int year;

    /**
     * Constructor para calendario basico.
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }
    
    /**
     * Permite introducir el dia, mes y año de una fecha.
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
    }

    /**
     * Nos permite avanzar dia a dia en la fecha introducida.
     */
    public void avanzarFecha()
    {
        if (day < 31){
            day = day + 1;
        }
        if (day == 31){
            day = 1;
            month = month + 1;
        }
        if (month == 13){
            month = 1;
            year = year + 1;
        }
    }
    
    /**
     * Permite devolver una fecha.
     */
    public String obtenerFecha()
    {
        String dosCifrDia = String.valueOf(day);
        String dosCifrMes = String.valueOf(month);
        String dosCifrAno = String.valueOf(year);
        if (dosCifrDia.length() < 2) {
            dosCifrDia = "0" + String.valueOf(day);
        }
        if (dosCifrMes.length() < 2) {
            dosCifrMes = "0" + String.valueOf(month);
        }
        if (dosCifrAno.length() < 2) {
            dosCifrAno = "0" + String.valueOf(year);
        }
        return dosCifrDia + "-" + dosCifrMes + "-" + dosCifrAno;
    }
       
}

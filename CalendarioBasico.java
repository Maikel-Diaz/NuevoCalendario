/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author Michael Díaz 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando campos di
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;

    /**
     * Constructor para calendario basico.
     */
    public CalendarioBasico()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(2099);    
    }
    
    /**
     * Permite introducir el dia, mes y año de una fecha.
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);
    }

    /**
     * Nos permite avanzar dia a dia en la fecha introducida.
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if(day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            
            if(month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }
        }
    }
    
    /**
     * Permite devolver una fecha.
     */
    public String obtenerFecha()
    {
        return day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
    }
       
}


/**
 * Write a description of class MainMakhlukHidup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMakhlukHidup
{
    public void cekMakhlukHidup (MakhlukHidup makhlukHidup){
        makhlukHidup.berdiri();
        makhlukHidup.oksigen();
    }
    
    public static void main(String[] args)
    {
        MainMakhlukHidup tmakhlukHidup = new MainMakhlukHidup();
        
        tmakhlukHidup.cekMakhlukHidup(new Manusia("Dua Kaki"));
        
        tmakhlukHidup.cekMakhlukHidup(new Hewan("Empat Kaki", "Dua Kaki"));
        
        tmakhlukHidup.cekMakhlukHidup(new Tumbuhan("Akar"));
    }
}

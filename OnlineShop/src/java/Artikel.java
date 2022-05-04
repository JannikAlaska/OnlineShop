public class Artikel {
    
    private final String name;
    private final Double preis;
    private final int verfuegbar;
    

    public Artikel(String name, Double preis, int verfuegbar) {
        this.name = name;
        this.preis = preis;
        this.verfuegbar = verfuegbar;
        
        
    }
    
    public String getName(){
        return name;
    }
    
    public Double getPreis(){
        return preis;
    }
        
    public int getVerfuegbar(){
        return verfuegbar;
    }
    
    
}

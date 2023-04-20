public class Containers implements Comparable<Containers>{
    private String ShortName;
    private String LongName;

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    public String getLongName() {
        return LongName;
    }

    public void setLongName(String LongName) {
        this.LongName = LongName;
    }

    public Containers() {
    }

    @Override
    public String toString(){
        return "<CONTAINER UUID=\"198ae269-8478-44bd-92b5-14982c4ff68a\">\n"
                + "<SHORT-NAME>" + this.getShortName() + "</SHORT-NAME>\n"
                + "<LONG-NAME>" + this.getLongName() + "</LONG-NAME>\n"
                +"</CONTAINER>\n";
    }
    @Override
    public int compareTo(Containers c){
        if(this.getShortName().charAt(this.getShortName().length()-1) > c.getShortName().charAt(c.getShortName().length()-1) )
            return 1;
        else if(this.getShortName().charAt(this.getShortName().length()-1) < c.getShortName().charAt(c.getShortName().length()-1))
            return -1;
        else
            return 0;
    }
}

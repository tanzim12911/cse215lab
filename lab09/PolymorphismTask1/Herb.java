public class Herb extends Plant {
    private boolean isMedicinal;
    private String season;

    Herb() {

    }
    Herb(boolean isMedicinal, String season) {
        this.isMedicinal = isMedicinal;
        this.season = season;
    }
    Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    public boolean getIsMedicinal() {
        return isMedicinal;
    }
    public String getSeason() {
        return season;
    }

    public void setIsMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }
    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString() + "::Herb:: isMedicinal = " + isMedicinal + ", season = " + season;
    }
    
}

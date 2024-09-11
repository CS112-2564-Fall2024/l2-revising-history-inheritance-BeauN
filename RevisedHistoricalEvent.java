public class RevisedHistoricalEvent extends HistoricalEvent {
    
    /********** CONSTANTS *********/
    protected final String DEFAULT_REVISIEDDESCRIPTION = "WAOWABBHAHAN";
    protected final String DEFAULT_CITATION = "DRUGS";

    /********** INSTANCE VARIABLES **********/
    protected String RevisedDescription;
    protected String Citation;
    /********** CONSTRUCTORS **********/
    public RevisedHistoricalEvent() {

        super(); //calls the default constructor of HistoricalEvent!
        this.RevisedDescription = "AWJWHN";
        this.Citation = "HARD DRUGS";
    }

    public RevisedHistoricalEvent(String Description, Date date, String Revis, String cit) {

        super(Description, date); //calls the constructor, filling it in with Description and date!
        this.RevisedDescription = Revis;
        this.Citation = cit;
    }

    /**MUTATORS */
    public void setRevisedDescription(String revis) {
        this.RevisedDescription = revis;
    }

    public void setCitation(String Cit) {
        this.Citation = Cit;
    }
    
    /**GETTERS */
    public String getRevisedDescription() {
        return this.RevisedDescription;
    }

    public String getCitation() {
        return this.Citation;
    }
    @Override
    public String toString() {
        String superString = super.toString();
        return superString + '\n' + '\n' + this.RevisedDescription + this.Citation;

    }
    @Override
    public void teach() {
        System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }

}

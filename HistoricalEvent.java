public class HistoricalEvent{

    /********** CONSTANTS *********/

    // need to make a inherator class that inhereants from HistoricalEvent, called
    // RevisdedHistoricalEvent

    // Public class RevisedHistoricalEvent extends HistoricalEvent{}
    public static final String DEFAULT_DESCRIPTION = "POKEMON ARE REAL";
    //Date DEFAULT_DATE = new Date();
    public static final String DEFAULT_CITATION = "ABRAHAM LINCON";
    //the revisied will have public static final String DEFAULT_RIVSED = "YEAH THIS IS TRUE";
    /********** INSTANCE VARIABLES **********/
    protected String Description;
    protected Date date;
    //an object of the date needs to be made. 
    //protected String Citation;

    /********** CONSTRUCTORS **********/
    /**
     * Default constructor sets HistoricalEvent object to default values
     * 
     */
    public HistoricalEvent() {
        this.Description = "none";
        this.date = new Date();
    }
    public HistoricalEvent(String Desc, Date date)
    {
        this.Description = Desc;
        this.date = date;
    }
    /** MUTATORS */
    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
    /**GETTERS */
    public Date getDate() {
        return this.date;
    }

    public String getDescritpiton() {
        return this.Description;
    }

    public String toString() {
        return this.date.toString() + " HIIIIIIIIII " + this.Description;
    }
    /**FUNCTIONS */
    public void teach() {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
    
    public boolean equals(HistoricalEvent otherEvent) {
        if (this.date == (otherEvent.getDate()) && this.Description.equals(otherEvent.getDescritpiton())) {
            return true;
        }
        return false;
    }
    public int compareTo(Object other) {
        HistoricalEvent event = (HistoricalEvent) other;
        if ((other instanceof HistoricalEvent)) {
            if (this.date.precedes(event.date)) {
                return -1;
            } else if (this.date.equals(event.date)) {
                return 0;
            } else {
                return 1;
            }
        }
        return -1;} 
}

public class Workout {
    private int burpee_count;
    private int pushup_count;
    private int situp_count;
    private int squad_count;

    public Workout(int burpee_count, int pushup_count, int situp_count, int squad_count) {
        this.burpee_count = burpee_count;
        this.pushup_count = pushup_count;
        this.situp_count = situp_count;
        this.squad_count = squad_count;
    }

    public int getBurpee_count() {
        return burpee_count;
    }

    public void setBurpee_count(int burpee_count) {
        this.burpee_count = burpee_count;
    }

    public int getPushup_count() {
        return pushup_count;
    }

    public void setPushup_count(int pushup_count) {
        this.pushup_count = pushup_count;
    }

    public int getSitup_count() {
        return situp_count;
    }

    public void setSitup_count(int situp_count) {
        this.situp_count = situp_count;
    }

    public int getSquad_count() {
        return squad_count;
    }

    public void setSquad_count(int squad_count) {
        this.squad_count = squad_count;
    }
    public void doBurpee(int amount){
        if (burpee_count == 0){
            System.out.println("No more burpees to do");
        }
        if (burpee_count - amount < 0){
            System.out.println("You passed your target burpee amount. Congratulations!");
            burpee_count = 0;
            System.out.println("Remaining Burpees : "+ burpee_count);
        }else {
            burpee_count-=amount;
            System.out.println("Remaining Burpees : "+ burpee_count);
        }
    }
    public void doPushup(int amount){
        if (pushup_count == 0){
            System.out.println("No more pushups to do");
        }
        if (pushup_count - amount < 0){
            System.out.println("You passed your target pushup amount. Congratulations!");
            pushup_count = 0;
            System.out.println("Remaining Pushups : "+ pushup_count);
        }else {
            pushup_count-=amount;
            System.out.println("Remaining Pushups : "+ pushup_count);
        }
    }
    public void doSitup(int amount){
        if (situp_count == 0){
            System.out.println("No more situps to do");
        }
        if (situp_count - amount < 0){
            System.out.println("You passed your target situp amount. Congratulations!");
            situp_count = 0;
            System.out.println("Remaining Situps : "+ situp_count);
        }else {
            situp_count-=amount;
            System.out.println("Remaining Situps : "+ situp_count);
        }
    }
    public void doSquad(int amount){
        if (squad_count == 0){
            System.out.println("No more squads to do");
        }
        if (squad_count - amount < 0){
            System.out.println("You passed your target squad amount. Congratulations!");
            squad_count = 0;
            System.out.println("Remaining Squads : "+ squad_count);
        }else {
            squad_count-=amount;
            System.out.println("Remaining Squads : "+ squad_count);
        }
    }
    public void workOut(String workoutType,int amount){
        if (workoutType.equals("Burpee")){
            doBurpee(amount);

        } else if (workoutType.equals("Pushup")) {

            doPushup(amount);

        } else if (workoutType.equals("Situp")) {

            doSitup(amount);

        } else if (workoutType.equals("Squad")) {

            doSquad(amount);

        }else{
            System.out.println("Non-existing Workout Type");
        }

    }
    public boolean workOut_Done(){
        return (burpee_count == 0) && (pushup_count == 0) && (squad_count == 0) && (situp_count == 0);
    }
}

    
    class BirdWatcher {
        private final int[] birdsPerDay;
    
        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay.clone();
        }

    public static int[] getLastWeek() {
        
        return  new int[]{0, 2, 5, 3, 7, 8, 4};
        
       
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1] ;
        
    }

   public void incrementTodaysCount() {

    birdsPerDay[birdsPerDay.length - 1]
        = birdsPerDay[birdsPerDay.length - 1] + 1;
}

    public boolean hasDayWithoutBirds() {
        for( int i =0 ; i<birdsPerDay.length; i++){
            if(birdsPerDay [i]==0){
                return true;
            }
        }
        return false;
          
    }

    public int getCountForFirstDays(int numberOfDays) {
        int limit;
        if(numberOfDays > birdsPerDay.length){
        limit = birdsPerDay.length;
        }else{
        limit = numberOfDays;
        }
        int sum=0 ;
        for( int i =0  ;i<limit;i++){
            sum = sum+birdsPerDay[i];
        }
        return sum ;

        
      
       
    }

    public int getBusyDays() {
        int busyday =0;
        for( int i = 0 ;i< birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                busyday=busyday+1;
            }
        }
        return busyday;
        
    }
}

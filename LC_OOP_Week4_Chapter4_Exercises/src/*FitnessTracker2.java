import java.time.*;
public class FitnessTracker2
{
   String activity;
   int minutes;
   LocalDate date;
   // constructor added for Exercise 3a
   public FitnessTracker2()
   {
      this("running", 0, LocalDate.of(2019, 1, 1));
   }
   // constructor added for Exercise 3b
   public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam)
   {
      activity = activityParam;
      minutes = minutesParam;
      date = dateParam;
   }
   public String getActivity()
   {
      return activity;
   }
   public int getMinutes()
   {
      return minutes;
   }
   public LocalDate getDate()
   {
      return date;
   }
}
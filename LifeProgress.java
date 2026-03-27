class LifeProgress {

public static void main(String[] args) {

System.out.println("Hello Life Progress Tracker");

getLifeInfo();

System.out.println("I have two goal scores, please add and display");
short careerGoal = 70;
short healthGoal = 85;
boolean progressActive = true;

addGoals(careerGoal, healthGoal, progressActive); // calling method

System.out.println("What is the overall life progress percentage");

float progressPercent = getProgressPercent();
System.out.println(progressPercent);
}

static void getLifeInfo() {
System.out.println("Tracking personal growth and life achievements");
}

static void addGoals(short goal1, short goal2, boolean active) {
System.out.println("Calculating total goal score");
int totalScore = goal1 + goal2;
System.out.println(totalScore);
System.out.println("Progress Active: " + active);
    }

static float getProgressPercent() {
System.out.println("Please wait, calculating life progress");
float percent = 77.5f;
System.out.println("Life progress calculated successfully");
return percent;
}
}
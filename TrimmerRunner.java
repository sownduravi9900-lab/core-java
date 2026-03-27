class TrimmerRunner {

public static void main(String[] args) {

// check trimmer status
Trimmer.checkTrimmerStatus();

// turn on trimmer
Trimmer.turnOnTrimmer();

// check again
Trimmer.checkTrimmerStatus();

// display trim level
int level = Trimmer.getTrimLevel();
System.out.println("Trim Level is : " + level);

}
}
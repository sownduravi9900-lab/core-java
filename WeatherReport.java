class WeatherReport {

public static void main(String[] args) {

System.out.println("Hello Weather Report System");

getWeatherInfo();

System.out.println("I have two temperature readings, please add and display");
float morningTemp = 28.5f;
float eveningTemp = 24.3f;
boolean rainExpected = true;

addTemperature(morningTemp, eveningTemp, rainExpected); // calling method

System.out.println("What is the humidity level today");

int humidity = getHumidityLevel();
System.out.println(humidity);
}

static void getWeatherInfo() {
System.out.println("Today's weather forecast is available");
}

static void addTemperature(float temp1, float temp2, boolean rain) {
System.out.println("Calculating average temperature");
float totalTemp = temp1 + temp2;
System.out.println(totalTemp);
System.out.println("Rain Expected: " + rain);
}

static int getHumidityLevel() {
System.out.println("Please wait, checking humidity level");
int humidityLevel = 65;
System.out.println("Humidity level retrieved successfully");
return humidityLevel;
}
}
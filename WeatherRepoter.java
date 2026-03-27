class WeatherRepoter {

    static String topic = "Weather Report:";
    static String[] cityNames = {"Bangalore", "Mysore", "Mandya"};
    static int[] temperatures = {28, 30, 27};

    static void getCityNames() {
        System.out.println("Cities:");
        for(String city : cityNames) {
            System.out.println(city);
        }
    }

    static int[] getTemperatures() {
        return temperatures;
    }
}
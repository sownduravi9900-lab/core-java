class WeatherRepoterRunner{

    public static void main(String[] args) {

        System.out.println(WeatherRepoter.topic);
        WeatherRepoter.getCityNames();

        System.out.println("Temperatures:");
        int[] temps = WeatherRepoter.getTemperatures();

        for(int temp : temps) {
            System.out.println(temp);
        }
    }
}
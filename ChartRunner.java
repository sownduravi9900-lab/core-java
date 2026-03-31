class ChartRunner {
    public static void main(String[] args) {

        Chart c1 = new Chart("Sales Report", "Bar", 10, "Blue");
        Chart c2 = new Chart("Profit Analysis", "Line", 8, "Green");
        Chart c3 = new Chart("Market Share", "Pie", 5, "Red");
        Chart c4 = new Chart("Growth Chart", "Line", 12, "Yellow");
        Chart c5 = new Chart("Expense Chart", "Bar", 7, "Orange");
        Chart c6 = new Chart("Revenue Chart", "Area", 9, "Purple");
        Chart c7 = new Chart("User Stats", "Scatter", 6, "Black");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
    }
}
class ChatGptRunner {
    public static void main(String[] args) {

        ChatGpt c1 = new ChatGpt("Ravi", 120, 15.5, 'P', true);
        ChatGpt c2 = new ChatGpt("Anu", 80, 10.2, 'F', false);
        ChatGpt c3 = new ChatGpt("Kiran", 200, 25.0, 'P', true);
        ChatGpt c4 = new ChatGpt("Sneha", 60, 8.5, 'F', false);
        ChatGpt c5 = new ChatGpt("Arjun", 150, 18.3, 'P', true);
        ChatGpt c6 = new ChatGpt("Meena", 90, 12.7, 'F', false);
        ChatGpt c7 = new ChatGpt("Rahul", 170, 20.1, 'P', true);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
    }
}
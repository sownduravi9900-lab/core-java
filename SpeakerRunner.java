class SpeakerRunner {

public static void main(String[] args) {

Speaker.brand();

Speaker.setVolume(8);

int speakerPrice = Speaker.price();
System.out.println("Price: " + speakerPrice);

String speakerColor = Speaker.color("Red");
System.out.println("Color: " + speakerColor);
}
}
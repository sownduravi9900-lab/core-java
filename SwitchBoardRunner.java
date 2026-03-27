class SwitchBoardRunner {
public static void main(String[] args) {
SwitchBoard.brand();

SwitchBoard.switchCount(6);

int switchBoardPrice = SwitchBoard.price();
System.out.println("Price: " + switchBoardPrice);

String switchBoardColor = SwitchBoard.color("White");
System.out.println("Color: " + switchBoardColor);
}
}
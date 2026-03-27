class Keyboard {

String layout = "QWERTY";
int keys = 104;

void showKeyboard() {
System.out.println("Keyboard Layout: " + layout);
}

int getKeys() {
return keys;
}

void setLayout(String newLayout) {
layout = newLayout;
System.out.println("New Layout: " + layout);
}

int addKeys(int extra) {
return keys + extra;
}
}
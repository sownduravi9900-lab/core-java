public class HairClipsRunner {
    public static void main(String[] args) {
HairClips clip = new HairClips();
clip.clipType = "Big Clip";
clip.material = "Plastic";
clip.color = "Black";
clip.length = 5.5;
clip.displayDetails();
clip.setDecoration(true);
System.out.println("Length: " + clip.getLength());
System.out.println("Double Length: " + clip.doubleLength());
System.out.println("____________**************____________");
}
}
public class ProductMain {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.showMobile();
        System.out.println(m.getPrice());
        m.setBrand("Apple");
        System.out.println(m.addPrice(5000));

        Mouse ms = new Mouse();
        ms.showMouse();
        System.out.println(ms.getDpi());
        ms.setType("Gaming");
        System.out.println(ms.increaseDpi(400));

        Keyboard k = new Keyboard();
        k.showKeyboard();
        System.out.println(k.getKeys());
        k.setLayout("AZERTY");
        System.out.println(k.addKeys(10));

        Monitor mn = new Monitor();
        mn.showMonitor();
        System.out.println(mn.getRate());
        mn.setSize("27 inch");
        System.out.println(mn.increaseRate(45));

        Speaker sp = new Speaker();
        sp.showSpeaker();
        System.out.println(sp.getVolume());
        sp.setBrand("JBL");
        System.out.println(sp.increaseVolume(20));

        Headphone hp = new Headphone();
        hp.showHeadphone();
        System.out.println(hp.getBattery());
        hp.setModel("Sony");
        System.out.println(hp.addBattery(20));

        Bottle b = new Bottle();
        b.showBottle();
        System.out.println(b.getCapacity());
        b.setMaterial("Plastic");
        System.out.println(b.addCapacity(1));

        Watch w = new Watch();
        w.showWatch();
        System.out.println(w.getPrice());
        w.setBrand("Fastrack");
        System.out.println(w.increasePrice(1000));

        Bag bg = new Bag();
        bg.showBag();
        System.out.println(bg.getPockets());
        bg.setColor("Blue");
        System.out.println(bg.addPockets(2));

        IronBox ib = new IronBox();
        ib.showIron();
        System.out.println(ib.getWatts());
        ib.setBrand("Bajaj");
        System.out.println(ib.increaseWatts(500));
    }
}
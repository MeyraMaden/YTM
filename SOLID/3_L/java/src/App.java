public class App {
    public static void main(String[] args) throws Exception {
        Ferrari ferrari=new Ferrari();
        Mercedes mercedes=new Mercedes();
        Tofas tofas=new Tofas();


        System.out.println("-------------------------ferrari");
        ferrari.power();
        System.out.println("ilk hiz: "+ferrari.getVelocity());
        ferrari.run();
        System.out.println("su anki hiz: "+ferrari.getVelocity());
        ferrari.boost();
        ferrari.run();
        System.out.println("su anki hiz: "+ferrari.getVelocity());
        ferrari.open();
        ferrari.run();
        System.out.println("su anki hiz: "+ferrari.getVelocity());

        System.out.println("-------------------------mercedes");
        mercedes.power();
        System.out.println("ilk hiz: "+mercedes.getVelocity());
        mercedes.run();
        System.out.println("su anki hiz: "+mercedes.getVelocity());
        mercedes.boost();
        mercedes.run();
        System.out.println("su anki hiz: "+mercedes.getVelocity());

        System.out.println("-------------------------tofas");
        tofas.power();
        System.out.println("ilk hiz: "+tofas.getVelocity());
        tofas.run();
        System.out.println("su anki hiz: "+tofas.getVelocity());
        tofas.open();
        tofas.run();
        System.out.println("su anki hiz: "+tofas.getVelocity());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        System.out.println("Canal Atual "+smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Novo Canal "+smartTv.canal);

        smartTv.diminuirVolume();

        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual ? "+ smartTv.canal);
        System.out.println("Volume Atual ? "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada ? -> "+smartTv.ligada);

    }
}

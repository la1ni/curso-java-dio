public class Usuario {
    public static void main(String[] args) {
        SmartTv minhaTv = new SmartTv();
        System.out.println(minhaTv.volume);
        minhaTv.ligar();
        System.out.println(minhaTv.ligada);
        int c = 0;
        while (c < 5){
            minhaTv.reduzirVolume();
            c++;
        }
        System.out.println(minhaTv.volume);
        minhaTv.setCanal(12);
        minhaTv.aumentarCanal();
        System.out.println(minhaTv.canal);
    }
}

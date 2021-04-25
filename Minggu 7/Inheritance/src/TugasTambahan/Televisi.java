package TugasTambahan;
public class Televisi {
   String deskripsi = "" ;
    int jumlahChannel = 0 ;
    String [] channels = new String [jumlahChannel];
    int channelAktif = 0;
    int volume = 0 ;
    
    Televisi( final String deskripsi, final int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    public void getDeskripsi(){
        System.out.println("saya membeli " + deskripsi);
    }
 
    public void setChannels(String[] channels){
        if (channels.length > this.jumlahChannel) {
            System.out.println("Maaf tv ini hanya dapat menyimpan" + this.jumlahChannel + "channel");   
        }else{
            this.channels = channels;
            System.out.println("Informasi channel  berhasil di update!");
        }
    }
     public void getChannel(){
        if (this.channels.length == 0) {
            System.out.println("Belum ada channel yang diset!");
        }else{
           String data = "";
           for (String channel : this.channels){
               data += channel + " ";
        }
            System.out.println("channel yang ada : [ " + data + "]"); 
        }
    }
    public void setChannelAktif(int e){
         this.channelAktif = e;
         int data = e;
            System.out.println("Pindah ke channel  : [" +this.channels[e-1] +"]");            
    }
        public void setVolume(int volume){
            this.volume = volume;;
            System.out.println("itensitas volume sekarang : " + volume);
        }
    }
    


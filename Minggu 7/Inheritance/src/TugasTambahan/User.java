
package TugasTambahan;
public class User {
     public static void main(String[] args) {
         
     Televisi user = new Televisi("TV tempoe doeloe, 14 inches", 10);
     String[] channel = {
         "RCTI", "INDOSIAR","TV ONE","MNC", 
           "ANTV","METRO TV","TRANS TV","TPI","TV 7", "GTV"
     };
     
     user.getDeskripsi();
     user.getChannel();
     user.setChannels(channel);
     
     user.setChannelAktif(3);
     user.setVolume(10);
     user.setChannelAktif(10);
     user.setChannelAktif(1);
     }
}
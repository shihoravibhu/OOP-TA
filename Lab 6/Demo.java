class InstaPost{
    String imageUrl;
    String text;
    String songName;    

    public void post(){
        System.out.println("Posted with imageUrl: "+imageUrl+" text: "+text+" song: "+songName);
    }

    public void setter(String iU, String t, String sN)
    {
        imageUrl=iU;
        text=t;
        songName=sN;
    }

    public void getter()
    {
        System.out.println("ImageUrl: "+imageUrl+" text: "+text+" SongName: "+songName);
    }

}

public class Demo{
    public static void main(String[] args) {
        // InstaPost jay=new InstaPost();
        // // InstaPost vibhu=new InstaPost();

       
        // jay.setter("www.example.com/image", "My post", "Bekhayali");

        // jay.post();

        // jay.getter();

        // String padded =String.format("%010d", 123);

        String padded = String.format("%-10s", "hello");

        System.out.println(padded+"1");
    }
}

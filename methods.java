class computer{
    public void playmusic(){
        System.out.println("music");
    }
    public String  getApen(int cost){
        return "pen";
    }
}
public class methods{
    public static void main(String[]args){
        computer obj = new computer();
        obj.playmusic();
        String str = obj.getApen(cost:2);
        System.out.println(str);

        

    }
}
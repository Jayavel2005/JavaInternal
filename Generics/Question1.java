// import javax.swing.Box;

class Boxx <Thing> {
    private Thing value;
    Boxx(Thing value){
        this.value = value;
    }

    public Thing getValue(){
        return value;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Boxx<Integer> intBox = new Boxx(45);
        System.out.println(intBox.getValue());

        Boxx<String> strBox = new Boxx("Jk");
        System.out.println(strBox.getValue());

    }
}

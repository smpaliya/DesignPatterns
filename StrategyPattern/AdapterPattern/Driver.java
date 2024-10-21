public class Driver {
    public static void main(String args[]){
        Turkey turkey=new WildTurkey();
        TurkeyAdapter turkeyduck=new TurkeyAdapter(turkey);
        test(turkeyduck);
    }
    static void test(Duck d){
        d.fly();
        d.quack();
    }
}

public class TurkeyAdapter implements Duck{
    //adapter implements target interface
    //adapter is composed of adaptee
        Turkey turkey;
        TurkeyAdapter(Turkey turkey){
            this.turkey=turkey;
        }
        public void quack(){
            turkey.gobble();
        }
        public void fly(){
            for(int i=0;i<5;i++){
                turkey.fly();
            }
        }
}

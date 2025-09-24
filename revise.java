public class revise {
    static class Pen{
        String color;
        int tip;
        String type;

        public Pen(String color,int tip,String type){
            this.color=color;
            this.tip=tip;
            this.type=type;
        }

        public void displayDetails(){
            System.out.print(color+"color"+tip+"tip"+type+"type");
        }

        public void setColor(String newColor){
            this.color=newColor;
            System.out.println("color updated to"+newColor);

        }



    }

    public static void main(String args[]){

        Pen p1=new Pen("blue",5,"ballPoint");
        p1.displayDetails();
        p1.setColor("red");
    }
}
